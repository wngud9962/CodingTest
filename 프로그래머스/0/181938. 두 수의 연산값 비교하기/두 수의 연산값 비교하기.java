class Solution {
    public int solution(int a, int b) {
        int pluscase = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
		int multicase = 2 * a * b;
		return pluscase > multicase ? pluscase : multicase;
    }
}