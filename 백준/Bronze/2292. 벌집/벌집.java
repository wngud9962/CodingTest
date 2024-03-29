import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = Integer.parseInt(br.readLine());

		int minMove = 0;

		if (input == 1) {
			minMove = 1;
		}

		else {
			while (input > 1) {
				input = input - (6 * minMove);
				minMove++;
			}
		}

		bw.write(minMove + "");
		br.close();
		bw.close();
	}
}