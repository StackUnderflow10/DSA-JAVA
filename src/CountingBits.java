public class CountingBits {
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for(int i = 0; i<= n; i++){
            int count = 0;
            int z = i;
            while(z > 0){
                count++;
                z = z & (z-1);
            }
            ans[i] = count;
        }
        return ans;
    }
}
