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

		// 각각 걸리는 시간 오름차순
		int line = Integer.parseInt(br.readLine());
		int res = 0, add = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		int input_num[] = new int[line];

		for (int i = 0; i < line; i++) {
			input_num[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(input_num);

		for (int i = 0; i < input_num.length; i++) {
			add += input_num[i];
			res += add;
		}

		bw.write(res + "");
		
		br.close();
		bw.close();
	}
}
