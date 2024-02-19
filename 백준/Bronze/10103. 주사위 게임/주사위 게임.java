
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cScore = 100, sScore = 100;
		int round = Integer.parseInt(br.readLine());

		while (round != 0) {
			int cNum = 0;
			int sNum = 0;

			String[] score = br.readLine().split(" ");

			cNum = Integer.parseInt(score[0]);
			sNum = Integer.parseInt(score[1]);

			if (cNum < sNum) {
				cScore -= sNum;
			}
			else if (cNum > sNum) {
				sScore -= cNum;
			}

			round--;
		}

		bw.write(cScore+"");
		bw.newLine();
		bw.write(sScore+"");

		bw.flush();
		br.close();
	}
}
