import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
		int origin[] = { 1, 1, 2, 2, 2, 8 };
		int piece_cnt[] = new int[6];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < piece_cnt.length; i++) {
			piece_cnt[i] = origin[i] - Integer.parseInt(st.nextToken());
		}

		for (int res : piece_cnt) {
			bw.write(res + " ");
		}

		br.close();
		bw.close();
	}
}