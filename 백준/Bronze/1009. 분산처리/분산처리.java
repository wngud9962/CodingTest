import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		//제곱할때마다 %10 해서 일의 자리만 제곱하여 구하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int line = Integer.parseInt(br.readLine());
		StringTokenizer st;


		for (int i = 0; i < line; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int res = 1;
			
			for (int j = 0; j < b; j++) {
				res = (res * a) % 10;
			}
			if(res == 0) {
				bw.write("10");
				bw.newLine();
			}
			else {
				bw.write(res + "");
				bw.newLine();
			}
		}

		br.close();
		bw.close();
	}
}
