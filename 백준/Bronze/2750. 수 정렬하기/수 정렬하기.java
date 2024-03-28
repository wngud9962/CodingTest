
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int line = Integer.parseInt(br.readLine());
		int input[] = new int[line];
		
		Set<Integer> s = new TreeSet<>();

		for (int i = 0; i < line; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}

//		Arrays.sort(input);


		for (int i = 0; i < line; i++) {
			s.add(input[i]);
		}

		for (int res : s) {
			bw.write(res+"");
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}
