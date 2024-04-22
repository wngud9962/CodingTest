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

		int input = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 0; i < input; i++) {
			int num = i;
			int sum = i;

			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}

			if (sum == input) {
				result = i;
				break;
			}
		}
		System.out.println(result);

		br.close();
		bw.close();
	}
}
