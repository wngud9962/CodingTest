class Solution {
    public int solution(int a, int b) {
        int aCase = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
		int bCase = Integer.valueOf(String.valueOf(b) + String.valueOf(a));
		return aCase > bCase ? aCase : bCase;
    }
}