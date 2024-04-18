import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 가로^2 + 세로^2 = 대각선^2
		int input_num[] = new int[3];

		while (true) {
			String input_str[] = br.readLine().split(" ");

			for (int i = 0; i < input_str.length; i++) {
				input_num[i] = Integer.parseInt(input_str[i]);
			}
			
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
