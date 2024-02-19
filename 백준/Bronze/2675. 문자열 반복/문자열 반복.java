import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		StringTokenizer st = new StringTokenizer(input_info," ");

		/*
		 * 2 3 ABC 5 /HTP
		 * 
		 * AAABBBCCC /////HHHHHTTTTTPPPPP
		 */
		int cycle = Integer.parseInt(br.readLine());
		for (int i = 0; i < cycle; i++) {
			String result = "";
			String[] str = br.readLine().split(" "); // 공백으로 배열 넣기
			for (int j = 0; j < str[1].length(); j++) {
				for (int k = 0; k < Integer.parseInt(str[0]); k++) {
					result += str[1].charAt(j);
				}
			}
			bw.write(result);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}