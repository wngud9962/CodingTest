class Solution {
    public int solution(int n, String control) {
        int answer = n;
		String[] control_list = control.split("");
		
		for(String i:control_list) {
			if(i.equals("w")) {
				answer += 1;
			} else if(i.equals("s")) {
				answer -= 1;
			} else if(i.equals("d")) {
				answer += 10;
			} else if(i.equals("a")) {
				answer -= 10;
			}
		}
		return answer;
    }
}