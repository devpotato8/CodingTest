class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=num_list.length; i>0; i--){
            answer[i-1] = num_list[num_list.length-i];
        }
        return answer;
    }
}