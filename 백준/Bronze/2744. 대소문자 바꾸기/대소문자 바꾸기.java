import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		String result="";
		
		for (int i = 0; i < input.length(); i++) {
			char one = input.charAt(i);
			if(Character.isLowerCase(one)) {
				result += Character.toUpperCase(one);
			}
			else
				result += Character.toLowerCase(one);
		}
		
		bw.write(result);

		br.close();
		bw.close();
	}
}
