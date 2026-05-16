public class HammingDistance {
    public static void main(String[] args) {
        int x = 3, y = 1;
        System.out.println(hammingDistance(x,y));
    }
    private static int hammingDistance(int x, int y){
        int count = 0;
        int z;
        z = x ^ y;
        while(z > 0){
            count ++;
            z = z & (z-1);
        }
        return count;
    }
}
