import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < 3; i++) {
			BigInteger sum = new BigInteger("0");
			int line = Integer.valueOf(br.readLine());
			
			for (int j = 0; j < line; j++) {
				sum = sum.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
			}
			
			if(sum.compareTo(BigInteger.ZERO) == -1) bw.write("-"+"\n");
			else if(sum.compareTo(BigInteger.ZERO) == 0) bw.write("0"+"\n");
			else bw.write("+"+"\n");
		}
		

		br.close();
		bw.close();
	}
}
