import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());

		int[] zeroToNine = new int[10];
		String multi_str = String.valueOf(num1 * num2 * num3);
		
		for (int i = 0; i < multi_str.length(); i++) {
			zeroToNine[multi_str.charAt(i)-'0']++;
		}
		for (int i = 0; i < zeroToNine.length; i++) {
			bw.write(zeroToNine[i]+"");
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}