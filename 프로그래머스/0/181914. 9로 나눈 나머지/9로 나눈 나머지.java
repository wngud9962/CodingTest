class Solution {
    public int solution(String number) {
        int realNumber = 0;
		
		String[] numList = number.split("");
		for(String num:numList) {
			realNumber += Integer.parseInt(num);
		}
		
		
		return realNumber%9;
    }
}