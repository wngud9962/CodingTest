import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String eng = br.readLine();
		String[] eng_arr = eng.split(" ");

		int cnt = eng_arr.length;

		if (cnt > 0 && eng_arr[0].equals("")) {
			cnt = cnt - 1;
		}

		bw.write(cnt + "");
		br.close();
		bw.close();
	}
}