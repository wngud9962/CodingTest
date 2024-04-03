import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		/*
				*********
				 *******
				  *****
				   ***
				    *
		 */
		int line = Integer.parseInt(br.readLine());

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < i; j++) {
				bw.write(" ");
			}
			for (int j = 0; j < 2*(line-i)-1; j++) {
				bw.write("*");
			}

			bw.newLine();
		}

		br.close();
		bw.close();
	}
}
