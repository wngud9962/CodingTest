import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> q = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		while(!(q.size()==1)) {
			q.remove();
			int firstToLast = q.pollFirst();
			q.offerLast(firstToLast);
		}
		bw.write(q.peek()+"");
		
		
		br.close();
		bw.close();
	}
}