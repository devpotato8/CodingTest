class Solution {
    public int solution(int n) {
        double answer = Math.sqrt(n);
        return Math.floor(answer) == answer? 1 : 2;
    }
}