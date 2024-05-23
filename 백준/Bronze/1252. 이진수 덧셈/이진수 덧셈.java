import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		BigInteger input1 = new BigInteger(st.nextToken(), 2);
		BigInteger input2 = new BigInteger(st.nextToken(), 2);

		BigInteger sum = input1.add(input2);
		String res = sum.toString(2);

		bw.write(res + "");

		br.close();
		bw.close();
	}
}
