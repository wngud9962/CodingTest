import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		String[] alpha = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int cnt = 0;
		
		for (int i = 0; i < alpha.length; i++) {
			input = input.replace(alpha[i], "1");
		}
		
		bw.write(input.length()+"");
		br.close();
		bw.close();
	}
}
