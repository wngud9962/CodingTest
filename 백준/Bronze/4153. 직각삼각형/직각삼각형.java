import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 가로^2 + 세로^2 = 대각선^2
		int input_num[] = new int[3];

		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			input_num[0]= Integer.parseInt(st.nextToken());			
			input_num[1]= Integer.parseInt(st.nextToken());			
			input_num[2]= Integer.parseInt(st.nextToken());			
			
			Arrays.sort(input_num);
			
			if (input_num[0] == 0 && input_num[1] == 0 && input_num[2] == 0)
				break;


			if (Math.pow(input_num[0], 2) + Math.pow(input_num[1], 2) == Math.pow(input_num[2], 2)) {
				bw.write("right");
				bw.newLine();
			} else {
				bw.write("wrong");
				bw.newLine();
			}
		}

		br.close();
		bw.close();
	}
}
