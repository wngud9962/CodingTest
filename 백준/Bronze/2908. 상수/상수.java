
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int rev1 = 0;
		int rev2 = 0;

		while (a != 0) {
			rev1 = rev1 * 10 + a % 10;
			a /= 10;
		}
		while (b != 0) {
			rev2 = rev2 * 10 + b % 10;
			b /= 10;
		}
		
		if(rev1>rev2) {
			bw.write(rev1+"");
		}
		else bw.write(rev2+"");

		br.close();
		bw.close();
	}
}
