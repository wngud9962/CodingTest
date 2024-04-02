import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String []input_str = br.readLine().split(" ");
		int[] input_num = new int[3];

		for (int i = 0; i < input_num.length; i++) {
			 input_num[i] = Integer.parseInt(input_str[i]);
		}
		Arrays.sort(input_num);
		bw.write(input_num[1]+"");

		br.close();
		bw.close();
	}
}