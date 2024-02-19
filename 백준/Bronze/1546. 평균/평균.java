import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] scores = new int[Integer.parseInt(br.readLine())];
		String[] nums;

		String num = br.readLine();

		nums = num.split(" ");

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += Integer.parseInt(nums[i]);
		}

		float avg = (1.0f)*sum / scores.length;

		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			max = Math.max(Integer.parseInt(nums[i]), max);
		}

		float result = avg / max * 100;

		bw.write(result + "");

		br.close();
		bw.close();
	}
}