import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int line = Integer.parseInt(br.readLine());

		for (int i = 1; i <= line; i++) {
			for (int k = 0; k <= line-i; k++) {
				bw.write("*");
			}
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}

//line-i만큼 *
//줄 개행