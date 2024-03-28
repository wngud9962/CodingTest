import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input_str = br.readLine().split(" ");

		int[] input_num = new int[3];
		for (int i = 0; i < input_str.length; i++) {
			input_num[i] = Integer.parseInt(input_str[i]);
		}

		if (input_num[0] == input_num[1] && input_num[0] == input_num[2]) {
			bw.write(10000 + input_num[0] * 1000 + "");
		}
		else if(input_num[0]==input_num[1]) bw.write(1000+input_num[0]*100+ "");
		else if(input_num[0]==input_num[2]) bw.write(1000+input_num[0]*100+ "");
		else if(input_num[1]==input_num[2]) bw.write(1000+input_num[1]*100+ "");
		else {
			bw.write(Math.max(input_num[0], Math.max(input_num[1], input_num[2]))*100+"");
		}
		

		br.close();
		bw.close();
	}
}
