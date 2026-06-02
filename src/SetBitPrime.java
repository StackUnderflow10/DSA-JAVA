public class SetBitPrime {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(10,15));
    }
    public static int countPrimeSetBits(int left, int right) {
        int primeCount = 0;
        for(int i = left; i <= right; i++){
            int count = 0;
            int temp = i;
            while(temp > 0){
                count++;
                temp = temp & (temp-1);
            }
            //alternative method
            //if (((665772 >> count) & 1) == 1) {
            //    primeCount++;
            //}
            boolean[] isPrime = {
                    false, false, true,  true,  false, true,  false, true,
                    false, false, false, true,  false, true,  false, false,
                    false, true,  false, true,  false
            };

            if(isPrime[count]){
                primeCount++;
            }
        }
        return primeCount;

    }

}
