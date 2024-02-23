import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		String input_str[] = br.readLine().split(" ");

		int count2 = Integer.parseInt(br.readLine());
		String compare_str[] = br.readLine().split(" ");

		int input_num[] = new int[count];
		int compare_num[] = new int[count2];

		for (int i = 0; i < count; i++) {
			input_num[i] = Integer.parseInt(input_str[i]);
		}
		for (int i = 0; i < count2; i++) {
			compare_num[i] = Integer.parseInt(compare_str[i]);
		}

		Arrays.sort(input_num);
		
		for (int j = 0; j < compare_num.length; j++) {
			if(Arrays.binarySearch(input_num, compare_num[j])>=0) {
				bw.write("1");
				bw.newLine();
			}
			else {
				bw.write("0");
				bw.newLine();
			}
		}

		br.close();
		bw.close();
		/*
		 *
5
4 1 5 2 3
6
1 3 7 9 5 3
		 */

//		while(low<=high) {
//			int mid_idx = (low+high)/2;
//			String mid_num = input[mid_idx];
//			
//			if(mid>target) {
//				high=mid-1;
//			}
//			else if(mid<target) {
//				low=mid+1;
//			}
//			else {
//				break;
//			}
//			if
//		}
	}
}