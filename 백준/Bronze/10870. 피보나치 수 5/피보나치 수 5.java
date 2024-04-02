import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = Integer.parseInt(br.readLine());

		bw.write(fi(input)+"");

		br.close();
		bw.close();
	}

	public static int fi(int input) {
		if (input == 0) return 0;
		else if (input == 1) return 1;
		else return fi(input - 1) + fi(input - 2);
	}
}