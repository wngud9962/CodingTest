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

		for (int i = 0; i < line; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int student_cnt = Integer.parseInt(st.nextToken()); // 학생 수
			int[] arr = new int[student_cnt];

			double sum = 0; 

			for (int j = 0; j < student_cnt; j++) {
				int score = Integer.parseInt(st.nextToken()); // 성적 저장
				arr[j] = score;
				sum += score; 
			}

			double avg = (sum / student_cnt);
			double overAvgCnt = 0; 

			// 평균 넘는 학생비율
			for (int j = 0; j < student_cnt; j++) {
				if (arr[j] > avg) {
					overAvgCnt++;
				}
			}

			String result = String.format("%.3f%%\n", (overAvgCnt / student_cnt) * 100);
			bw.write(result);

		}

		br.close();
		bw.close();
	}

}