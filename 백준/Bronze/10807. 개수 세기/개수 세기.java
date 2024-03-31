import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int line = Integer.parseInt(br.readLine());
		int cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int findNum = Integer.parseInt(br.readLine());

		while (st.hasMoreElements()) {
			if (Integer.parseInt(st.nextToken()) == findNum) {
				cnt++;
			}
		}

		bw.write(cnt + "");

		br.close();
		bw.close();
	}

}