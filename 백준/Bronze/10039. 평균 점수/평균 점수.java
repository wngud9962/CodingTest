import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String score_str[] = new String[5];
		int sum = 0, avg = 0;

		for (int i = 0; i < score_str.length; i++) {
			score_str[i] = br.readLine();
		}
		int score_num[] = new int[score_str.length];
		for (int i = 0; i < score_str.length; i++) {
			score_num[i] = Integer.parseInt(score_str[i]);
		}

		for (int i = 0; i < score_num.length; i++) {
			if (score_num[i] < 40)
				score_num[i] = 40;
		}

		for (int res : score_num) {
			sum += res;
		}
		avg = sum / score_num.length;

		bw.write(avg + "");

		br.close();
		bw.close();
	}
}
