import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine());
		int[] time = new int[cnt];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Y = 0;
		int M = 0;
		for (int i = 0; i < cnt; i++) {
			time[i] = Integer.parseInt(st.nextToken());
			Y += (time[i] / 30 + 1) * 10;
			M += (time[i] / 60 + 1) * 15;
		}
		if (Y > M) {
			bw.write("M " + M);
		} else if (Y < M) {
			bw.write("Y " + Y);
		} else
			bw.write("Y M " + Y);

		br.close();
		bw.close();
	}
}
