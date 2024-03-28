
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int inputCnt = Integer.parseInt(br.readLine());
		int sosuCnt = 0;
		int[] input_num = new int[inputCnt];
		boolean isSosu = true;

		String[] input_str = br.readLine().split(" ");
		for (int i = 0; i < input_str.length; i++) {
			input_num[i] = Integer.parseInt(input_str[i]);
		}
		
		for (int i = 0; i < inputCnt; i++) {
			for (int j = 2; j < Math.sqrt(input_num[i]); j++) {
				if (input_num[i] % j == 0)
					isSosu = false;
			}
			if (isPrime(input_num[i]))
				sosuCnt++;
		}
		
		for (int i = 0; i < inputCnt; i++) {
			if(input_num[i]==1) 
				sosuCnt--;
		}
		
		bw.write(sosuCnt + "");

		br.close();
		bw.close();
	}
public static boolean isPrime(int input) {
		
		for (int i = 2; i <= Math.sqrt(input); i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}
}


