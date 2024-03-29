import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int res = 1;
		//(num-(num-10))*(num-(num-9))*(num-(num-8))*(num-(num-7))...*(num-(num-1))
		for (int i = num; i > 0; i--) {
			res *= num-(num-i);
		}
		bw.write(res+"");

		br.close();
		bw.close();
	}
}