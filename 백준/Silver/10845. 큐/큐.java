import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int line = Integer.parseInt(br.readLine());
		Deque<Integer> q = new LinkedList<>();
		
		String[] input = new String[line];
		
		for (int i = 0; i < line; i++) {
			input = br.readLine().split(" ");
			String input_str = input[0];
			
			if(input_str.equals("push")){
				q.add(Integer.parseInt(input[1]));
			}
			
			else if(input_str.equals("pop")) {
				if(q.isEmpty()) System.out.println("-1");
				else System.out.println(q.remove());
			}
			
			else if(input_str.equals("size")) {
				System.out.println(q.size()+"");
			}
			
			else if(input_str.equals("empty")) {
				if(q.isEmpty()) System.out.println("1");
				else System.out.println("0");
			}
			
			else if(input_str.equals("front")) {
				if(q.isEmpty()) System.out.println("-1");
				else System.out.println((q.peek()+""));
			
			}
			else if(input_str.equals("back")) {
				if(q.isEmpty()) System.out.println("-1");
				else System.out.println(q.getLast());
			}
			
		}
		
		
		br.close();
		bw.close();
	}
}