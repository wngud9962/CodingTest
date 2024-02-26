import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum=0;

		Stack<Integer> s = new Stack<>();
		// 0을 외치면 가장 최근 수 pop
		int line = Integer.parseInt(br.readLine());

		for (int i = 0; i < line; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num == 0) {
				s.pop();
				continue;
			}
			s.push(num);
			
		}
		while(!s.isEmpty()) {
			sum +=s.pop();
		}
		
		bw.write(sum+"");
		
		br.close();
		bw.close();
	}
}