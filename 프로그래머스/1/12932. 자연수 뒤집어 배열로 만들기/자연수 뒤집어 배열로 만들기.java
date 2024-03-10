import java.util.*;

class Solution {
    public int[] solution(long n) {
        String nStr = Long.toString(n);
        int[] answer = new int[nStr.length()];
        for(int i=0; i<answer.length; i++){
            answer[i] = (int)(n%10);
            n/=10;
        }
        return answer;
    }
}