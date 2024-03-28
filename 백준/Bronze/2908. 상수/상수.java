
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		String a = st.nextToken();
		String b = st.nextToken();

		StringBuffer sb1 = new StringBuffer(a);
		sb1.reverse();
		
		StringBuffer sb2 = new StringBuffer(b);
		sb2.reverse();

		int revA = Integer.parseInt(sb1.toString());
		int revB = Integer.parseInt(sb2.toString());

		if(revA > revB) bw.write(revA+"");
		else bw.write(revB+"");

		br.close();
		bw.close();
	}
}
