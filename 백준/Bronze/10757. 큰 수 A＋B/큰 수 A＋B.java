import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		BigInteger bi1 = new BigInteger(str);
		BigInteger bi2 = new BigInteger(str2);
		
		BigInteger sum = bi1.add(bi2);
		
		System.out.println(sum);
	}
}
