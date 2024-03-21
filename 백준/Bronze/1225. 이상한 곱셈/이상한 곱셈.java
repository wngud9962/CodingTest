import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().split(" ");
		long res = 0;
		
		for (int i = 0; i < input[0].length(); i++) {
			for (int j = 0; j < input[1].length(); j++) {
				res += (input[0].charAt(i)-'0') * (input[1].charAt(j)-'0');
			}
		}
		bw.write(res+"");

		br.close();
		bw.close();
	}
}
