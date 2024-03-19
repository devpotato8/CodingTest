class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 x에 있다";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")) {
                answer=answer.replaceAll("x",String.valueOf(i));
                break;
            }
        }
        return answer;
    }
}