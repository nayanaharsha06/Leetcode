class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;

        int n = bloomDay.length; // Size of the array
        if (val > n) return -1; // Impossible case.
        // Find maximum and minimum:
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int right = maxi;
        int left = mini;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (possible(bloomDay, mid, m, k)) {
                right = mid; // Try to find a smaller number of days
            } else {
                left = mid + 1; // Increase the number of days
            }
        }

        return left; 
    }

    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length; // Size of the array
        int cnt = 0;
        int noOfB = 0;
        // Count the number of bouquets:
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }
}