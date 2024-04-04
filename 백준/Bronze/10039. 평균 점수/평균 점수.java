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

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int score = Integer.parseInt(br.readLine());
			sum += score < 40 ? 40 : score;
		}

		bw.write((sum / 5) + "");

		br.close();
		bw.close();
	}
}
