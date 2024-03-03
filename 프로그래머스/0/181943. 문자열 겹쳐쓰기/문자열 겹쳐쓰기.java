class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
		sb.append(my_string);
		int sl = overwrite_string.length();
		
		for(int i =0; i<sl; i++) {
			char c = overwrite_string.charAt(i);
			sb.setCharAt(s+i, c);
		}
		String answer = sb.toString();
        return answer;
    }
}