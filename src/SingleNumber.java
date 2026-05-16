public class SingleNumber {
    public static void main(String[] args) {
        int[] arr ={4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums){
        int unique = 0;
        for (int n: nums){
            unique ^= n;
        }
        return unique;
    }

    // for (int n: nums){
    //   unique ^= n;
    // } means ->
    // for (int i = 0; i < nums.length; i++) {
    //    int n = nums[i];
    //    unique ^= n;
    //}
}
