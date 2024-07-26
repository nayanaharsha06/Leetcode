//https://www.youtube.com/watch?v=Nvrltvb2yIU&t=104s
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        List<Integer>[] arr = new ArrayList[numCourses];

        for(int i = 0; i < numCourses ; i++){
            arr[i]= new ArrayList<Integer>();
        }

        int pre; // [a,b] - b is pre and a is cour
        int cour;

        for(int[] pair : prerequisites){
            pre = pair[1];
            cour = pair[0];

            arr[pre].add(cour);
            inDegree[cour]++;
        }

        int[] res = new int[numCourses];
        int k = 0 ;
        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0){
                res[k++] = i;
            }
        }
        //res = [0, 0, 0, 0]  // Course 0 has no prerequisites  , k = 1

        if(k == 0){
            return new int[0];
        }
        int j = 0;
        List<Integer> temp;
        while(k < numCourses){
            temp = arr[res[j++]];
        
        for(int id: temp){
            if(--inDegree[id] == 0){
                res[k++] = id;
            }
        }
        if (j == k) {
           return new int[0];
        }
        }
        return res;

    }
}