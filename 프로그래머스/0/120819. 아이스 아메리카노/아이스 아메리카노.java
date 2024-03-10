class Solution {
    public int[] solution(int money) {
        int price = 5500;
        int maxCount = money/price;
        int changePrice = money%price;
        
        int[] answer = {maxCount,changePrice};
        return answer;
    }
}