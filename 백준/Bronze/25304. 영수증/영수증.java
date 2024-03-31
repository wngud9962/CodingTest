import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		int total = Integer.parseInt(br.readLine());
		int productCnt = Integer.parseInt(br.readLine());

		int sum = 0;

		for (int i = 0; i < productCnt; i++) {
			st = new StringTokenizer(br.readLine());
			sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()); 
		}
		if(sum == total) bw.write("Yes");
		else bw.write("No");

		br.close();
		bw.close();
	}

}