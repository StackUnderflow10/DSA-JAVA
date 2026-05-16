public class HammingWeight {
    public static void main(String[] args) {
        int ans = 11;
        System.out.println(Integer.toBinaryString(ans));
        System.out.println(hammingWeight(ans));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        while(n > 0){
            count ++;
            n = n & (n-1);
        }
        return count;
    }
}
