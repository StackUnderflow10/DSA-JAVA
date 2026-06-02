public class BinaryNumber {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(6));
    }
    public static boolean hasAlternatingBits(int n) {
        int a = n ^ (n >> 1);
        int result = a & (a + 1);
        if(result == 0){
            return true;
        }
        return false;
    }

}
