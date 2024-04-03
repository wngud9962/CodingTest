import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int inputNum = Integer.parseInt(st.nextToken());
		int searchNum = Integer.parseInt(st.nextToken());
		int containCnt = 0;

		Set<String> set = new HashSet<>();
		for (int i = 0; i < inputNum; i++) {
			set.add(br.readLine());
		}
		for (int i = 0; i < searchNum; i++) {
			if (set.contains(br.readLine()))
			containCnt++;
		}
		bw.write(containCnt + "");

		br.close();
		bw.close();
	}
}
