
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int line = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new LinkedList<Integer>();
		
		String []input_str = new String[line];
		
		for (int i = 0; i < line; i++) {
			input_str = br.readLine().split(" ");
			String command = input_str[0];
			
				switch(command) {
				case "push_front":
					dq.addFirst(Integer.parseInt(input_str[1]));
					break;
				case "push_back":
					dq.addLast(Integer.parseInt(input_str[1]));
					break;
				case "pop_front":
					if(dq.isEmpty()) System.out.println("-1");
					else System.out.println(dq.removeFirst());
					break;
				case "pop_back":
					if(dq.isEmpty()) System.out.println("-1");
					else System.out.println(dq.removeLast());
					break;
				case "size":
					if(dq.size()==0) System.out.println("0");
					else System.out.println(dq.size());
					break;
				case "empty":
					if(dq.isEmpty()) System.out.println("1");
					else System.out.println("0");
					break;
				case "front":
					if(dq.isEmpty()) System.out.println("-1");
					else System.out.println(dq.getFirst());
					break;
				case "back":
					if(dq.isEmpty()) System.out.println("-1");
					else System.out.println(dq.getLast());
					break;
				}
			}
		
			br.close();
			bw.close();
		}
	}
