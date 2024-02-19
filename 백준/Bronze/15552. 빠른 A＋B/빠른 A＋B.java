import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 0;
		for (int i = 0; i < num; i++) {
			String str= br.readLine();
			String v[] = str.split(" ");
			a = Integer.parseInt(v[0]);
			b = Integer.parseInt(v[1]);
			bw.write(""+(a+b)+"\n");
		}
		bw.close();
		br.close();
	}
}
