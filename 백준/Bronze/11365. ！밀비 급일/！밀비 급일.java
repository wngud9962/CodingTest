import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = "";

		while(true) {
			str = br.readLine();
			if(str.equals("END")) {
				break;
			}
			StringBuffer sb = new StringBuffer(str);
			
			bw.write(sb.reverse().toString());
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}