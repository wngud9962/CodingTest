import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main{
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Comparator<Integer> reverseComparator = Comparator.reverseOrder();
		PriorityQueue<Integer> pq = new PriorityQueue<>(reverseComparator);
		int line = Integer.parseInt(br.readLine());
		
		String input[] = new String[line];
		for (int i = 0; i < line; i++) {
			input[i] = br.readLine();
		}
		
		for (int i = 0; i < line; i++) {
			int temp = Integer.parseInt(input[i]);
			if(temp!=0) {
				pq.add(temp);
				continue;
			}
			
			if(pq.size()==0) {
				System.out.println("0");
			}
			else {
				System.out.println(pq.poll());
			}
		}
		
		br.close();
		bw.close();
	}
}