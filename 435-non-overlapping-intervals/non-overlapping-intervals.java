class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);
        //[[1,2], [2,3], [1,3], [3,4]]
        int removeCount = 0;
        int prevEnd = Integer.MIN_VALUE;

        for(int[] interval : intervals){
            if(prevEnd <= interval[0]){
                prevEnd = interval[1];
            }else{
                removeCount++;
            }
        }
        return removeCount;
    }
}