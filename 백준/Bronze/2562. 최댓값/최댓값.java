import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = 0;
		int maxPosition = 0;

		for (int i = 1; i <= 9; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > max) {
				max = num;
				maxPosition = i;
			}
		}

		System.out.println(max);
		System.out.println(maxPosition);

	}
}