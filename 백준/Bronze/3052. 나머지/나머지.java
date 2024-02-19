import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] nums_str = new String[10];
		for (int i = 0; i < nums_str.length; i++) {
			nums_str[i] = br.readLine();
		}
		
		int[] nums_num = new int[10];
		int div[] = new int[10];
		for (int i = 0; i < nums_num.length; i++) {
			nums_num[i] = Integer.parseInt(nums_str[i]);
			div[i] = nums_num[i] % 42;
		}

		HashSet<Integer> cnt = new HashSet<>();
		for (int j = 0; j < div.length; j++) {
			cnt.add(div[j]);
		}

		bw.write(cnt.size()+"");
		br.close();
		bw.close();
	}
}