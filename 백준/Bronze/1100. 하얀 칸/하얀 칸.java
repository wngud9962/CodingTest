import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean even = true;
		int white = 0;

		for (int i = 0; i < 8; i++) {
			String input = br.readLine();
			for (int j = 0; j < 8; j++) {
				if (even && j % 2 == 0) {
					if (input.charAt(j) == 'F') {
						white++;
					}
				}
					else if (!even && j % 2 == 1) {
						if (input.charAt(j) == 'F') {
							white++;
						}
					}
				}
			
			even = !even;
		}
		bw.write(white+"");

		br.close();
		bw.close();
	}
}
