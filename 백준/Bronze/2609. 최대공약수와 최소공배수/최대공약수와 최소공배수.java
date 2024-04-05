import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input_str = br.readLine().split(" ");
		int maxYak = 0, minBae = 0;

		int num1 = Integer.parseInt(input_str[0]);
		int num2 = Integer.parseInt(input_str[1]);

		for (int i = num1; i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				maxYak = i;
				break;
			}
		}

		for (int i = 1;; i++) {

			if ((num1 * i) % num2 == 0) {
				minBae = num1 * i;
				break;
			}
		}

		bw.write(maxYak + "");
		bw.newLine();
		bw.write(minBae + "");

		br.close();
		bw.close();
	}
}
