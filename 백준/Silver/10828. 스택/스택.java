import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int line = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < line; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			if (input.equals("push")) {
				int c = Integer.parseInt(st.nextToken());
				stack.push(c);
			} 
			else if (input.equals("pop")) {
				if (stack.isEmpty()) {
					System.out.println("-1");
				} 
				else
					System.out.println(stack.pop());
			} 
			else if (input.equals("size")) {
				System.out.println(stack.size());
			} 
			else if (input.equals("empty")) {
				if (stack.isEmpty()) {
					System.out.println("1");
				} 
				else {
					System.out.println("0");
				}
			} 
			else if (input.equals("top")) {
				if (stack.isEmpty()) {
					System.out.println("-1");
				} 
				else
					System.out.println(stack.peek());
			}

		}
	}
}