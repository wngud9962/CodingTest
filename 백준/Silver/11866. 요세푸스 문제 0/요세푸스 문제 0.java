import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> q = new LinkedList<>();

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		bw.write("<");

		int cnt = 1;
		while (q.size() != 1) {
			if(cnt == k) {
				bw.write(q.remove() + ", ");
				cnt = 1;
			}
			else {
				q.add(q.remove()); 
				cnt ++;
			}
		}
		bw.write(q.poll()+">");

		br.close();
		bw.close();
	}
}