class Solution {
    public int solution(int a, int b, boolean flag) {
        if(flag) {
			return a + b;
		} else if(!flag) {
			return a - b;
		}
		return 0;
    }
}