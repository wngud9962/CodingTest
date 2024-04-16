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
		int res = 0;

		while (st.hasMoreElements()) {
			res += Math.pow(Integer.parseInt(st.nextToken()), 2);
		}
		res = res % 10;

		bw.write(res + " ");

		br.close();
		bw.close();
	}
}
