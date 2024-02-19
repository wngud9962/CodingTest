import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// O의 연속갯수만큼 점수를 누적하고
		// X가 나오면 누적값은 0으로 초기화
		int cycle = Integer.parseInt(br.readLine());
		String ox;
		int score = 1;
		int sum = 0;
		for (int i = 0; i < cycle; i++) {
			ox = br.readLine();
			sum = 0;
			score = 1;
			for (int j = 0; j < ox.length(); j++) {
				if (ox.charAt(j) == 'O') {
					sum += score;
					score++;
				} else {
					score = 1;
				}
			}
			bw.write(sum + "");
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}