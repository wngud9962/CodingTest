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

		int white = 0;

		for (int i = 1; i <= 8; i++) {
			String input = br.readLine();

			if (i % 2 == 1) { // 홀수 줄(흰색 먼저)
				for (int j = 0; j <= 6; j += 2) {
					if(input.charAt(j)=='F') white++;
				}
			}
			else {
				for (int j = 1; j <= 7; j+=2) {
					if(input.charAt(j)=='F') white++;
				}
			}
		}
		bw.write(white + "");

		br.close();
		bw.close();
	}
}
