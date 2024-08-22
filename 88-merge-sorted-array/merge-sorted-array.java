public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer for the end of the initialized part of nums1
        int p2 = n - 1; // Pointer for the end of nums2
        int p = m + n - 1; // Pointer for the end of nums1, including extra space

        // Merge nums2 into nums1 starting from the end
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
            }
        }
    }
}
