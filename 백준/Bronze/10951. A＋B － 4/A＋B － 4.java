import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> sum = new ArrayList<>();

		String inputLine;
		while ((inputLine = br.readLine()) != null) {
			String[] input = inputLine.split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			int currentSum = a + b;
			sum.add(currentSum);
		}

		for (int result : sum) {
			System.out.println(result);
		}

		br.close();
	}
}