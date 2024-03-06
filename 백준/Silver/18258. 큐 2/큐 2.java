import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main{
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> q = new LinkedList<>();
		int line = Integer.parseInt(br.readLine());
		String[] input;
		
		for (int i = 0; i < line; i++) {
			input = br.readLine().split(" ");
			
			if(input[0].equals("push")) {
				int input_num = Integer.parseInt(input[1]);
				q.add(input_num);
			}
			else if(input[0].equals("pop")) {
				if(q.isEmpty()) bw.write("-1");
				else bw.write(q.remove()+"");
				bw.newLine();
			}
			else if(input[0].equals("size")) {
				bw.write(q.size()+"");
				bw.newLine();
			}
			else if(input[0].equals("empty")) {
				if(q.isEmpty()) bw.write("1");
				else bw.write("0");
				bw.newLine();
			}
			else if(input[0].equals("front")) {
				if(q.isEmpty()) bw.write("-1");
				else bw.write(q.getFirst()+"");
				bw.newLine();
			}
			else if(input[0].equals("back")) {
				if(q.isEmpty()) bw.write("-1");
				else bw.write(q.getLast()+"");
				bw.newLine();
			}
		}
		
		br.close();
		bw.close();
	}
}