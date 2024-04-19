
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int line = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int i = 0; i < line; i++) {
			st = new StringTokenizer(br.readLine(), ",");
			int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			bw.write(sum + "");
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}
