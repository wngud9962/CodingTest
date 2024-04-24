import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

import javax.swing.plaf.FontUIResource;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// A 고정비용
		// B 하나당 가변비용
		// C 노트북 가격
		// (C x 갯수) > A + (B x 갯수) 시점

		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		if (B >= C) {
			bw.write("-1");
			bw.newLine();
		} 
		else {
			bw.write(A / (C - B) + 1 + "");
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}
