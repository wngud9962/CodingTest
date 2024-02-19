import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		int[] num = new int[count];

		for (int i = 1; i <= count; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			int sum = a + b;

			System.out.println("Case #" + i + ": "+a+" + "+b +" = "+ sum);
		}

	}
}
