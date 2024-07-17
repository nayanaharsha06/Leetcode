//https://www.youtube.com/watch?v=C3fiCrBkK0Y
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];
        for(int i = 0; i < tasks.length ; i++){
            arr[tasks[i] - 'A']++;
        }
        Arrays.sort(arr);
        int maxFreq = arr[25];
        int idle = (maxFreq - 1)*n;
        for(int i = 24; i >= 0; i--){
            idle = idle - Math.min(maxFreq - 1, arr[i]);
        }

        idle = Math.max(0,idle);
        return tasks.length+idle;
    }
}