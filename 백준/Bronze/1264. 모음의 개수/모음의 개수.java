import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String input = br.readLine();

			if (input.equals("#"))
				break;

			input = input.toLowerCase();
			int cnt = 0;

			for (int i = 0; i < input.length(); i++) {
				char element = input.charAt(i);
				switch (element) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':{
						cnt++;
						break;
					}
				}
			}
			bw.write(cnt + "");
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}
