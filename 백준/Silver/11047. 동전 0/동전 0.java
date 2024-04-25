import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		int line = Integer.parseInt(st.nextToken());
		int sum = Integer.parseInt(st.nextToken());

		Integer[] input = new Integer[line];

		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(input, Comparator.reverseOrder()); // 내림차순

		// Arrays.sort(input); // 오름차순 정렬
		// Collections.reverse(Arrays.asList(input));

		for (int i = 0; i < input.length; i++) {
			cnt += (sum / input[i]);
			sum = sum % input[i];
		}
		
		bw.write(cnt + "");

		br.close();
		bw.close();
	}
}
