//https://www.youtube.com/watch?v=I6HrVRGGYNI
class Solution {
    public int countPrimes(int n) {
        if(n <= 2){
            return 0;
        }

        boolean[] isprime =new boolean[n];
        for(int i = 0 ; i < n ;i++){
            isprime[i] = true;
        }
        for(int i = 2; i < Math.sqrt(n) ; i++){
            if(isprime[i]){
            for(int j = i*i ; j < n ; j+=i){
                isprime[j] = false;
            }
            }
        }
        int count = 0;
        for(int i =2 ;i < n;i++){
            if(isprime[i]){
                count++;
            }
        }
        return count;
    }
}