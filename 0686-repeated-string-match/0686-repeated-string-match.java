class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count = b.length()/a.length();
        int answer = 1;
        String s = a;

        for(int i = 0 ; i <= count +1; i++){
            if(s.contains(b)) return answer;
            s = s + a;
            answer++; 
        }

        return -1;
    }
}