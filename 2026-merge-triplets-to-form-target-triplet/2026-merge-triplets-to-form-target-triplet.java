class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] res = new int[3]; // Array to store the maximum values from valid triplets

        // Iterate through each triplet in the array
        for (int[] s : triplets) {
            // Check if all elements of the current triplet are less than or equal to the corresponding elements of the target
            if (s[0] <= target[0] && s[1] <= target[1] && s[2] <= target[2]) {
                // Update the result array with the maximum values from valid triplets
                res = new int[]{
                    Math.max(res[0], s[0]),
                    Math.max(res[1], s[1]),
                    Math.max(res[2], s[2])
                };
            }
        }

        // Check if the result array matches the target array
        return Arrays.equals(res, target);
    }
}
