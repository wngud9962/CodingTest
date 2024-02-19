import java.util.ArrayList;
import java.util.List;

class Solution {
	public int[] solution(int[] num_list) {
		int[] result = new int[num_list.length];
		
		for (int i = 0; i < result.length; i++) {
			result[i]=num_list[num_list.length-i-1];
		}
		return result;
	}
}