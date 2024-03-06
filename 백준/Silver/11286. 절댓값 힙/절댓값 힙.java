import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int a = Math.abs(o1);
				int b = Math.abs(o2);
				if(a<b) {
					return -1;
				}
				else if(a>b) {
					return 1;
				}
				else if(o1<o2) {
					return -1;
				}
				else if(o1>o2) {
					return 1;
				}
				else
					return 0;
			}
		});

		int line = Integer.parseInt(br.readLine());

		String[] input = new String[line];
		int input_num[] = new int[line];
//		int input_abs[] = new int[line];
		int zeroCnt = 0;

		for (int i = 0; i < line; i++) {
			input[i] = br.readLine();
			input_num[i] = Integer.parseInt(input[i]);

			if (input_num[i] != 0) {
				pq.offer(input_num[i]);
			} 
			else {
				if(pq.size()==0) {
					bw.write("0");
				}
				else {
					bw.write(pq.poll()+""); 
				}
				bw.newLine();
			}
		}


		br.close();
		bw.close();
	}
}