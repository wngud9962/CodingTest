import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int sosuMin = 0, sosuSum = 0;
		int cnt = 0;

		List<Integer> sosuList = new ArrayList<>();

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		for (int i = a; i <= b; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					cnt++;
			}
			if (cnt == 2) {
				sosuSum += i;
				sosuList.add(i);
			}
			cnt = 0;
		}

		if (sosuList.isEmpty()) {
			bw.write("-1");
			bw.newLine();
		}

		else {
			bw.write(sosuSum + "");
			bw.newLine();

			sosuMin = Collections.min(sosuList);
			bw.write(sosuMin + "");
		}
		br.close();
		bw.close();
	}
}
