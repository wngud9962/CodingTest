import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		BigInteger big1 = new BigInteger(br.readLine());
		BigInteger big2 = new BigInteger(br.readLine());
		
		bw.write(big1.add(big2)+"");
		bw.newLine();
		
		bw.write(big1.subtract(big2)+"");
		bw.newLine();
		
		bw.write(big1.multiply(big2)+"");
		bw.newLine();
		
		br.close();
		bw.close();
	}
}