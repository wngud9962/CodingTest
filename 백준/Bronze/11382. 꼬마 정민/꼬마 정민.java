import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger numA = new BigInteger(st.nextToken());
		BigInteger numB = new BigInteger(st.nextToken());
		BigInteger numC = new BigInteger(st.nextToken());
		
		bw.write(numA.add(numB.add(numC))+"");

		br.close();
		bw.close();
	}
}