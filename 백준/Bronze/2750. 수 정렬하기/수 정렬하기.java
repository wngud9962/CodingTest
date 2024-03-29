import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int line = Integer.parseInt(br.readLine());
		Integer input[] = new Integer[line];

		for (int i = 0; i < line; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}


		Set<Integer> s = new HashSet<>();
		List<Integer> list = Arrays.asList(input);
		List<Integer> list1 = new ArrayList<>();
//		int[] resArr = new int[line];
//		for (int i = 0; i < line; i++) {
//			s.add(input[i]);
//		}
		
		s.addAll(list);
		list1.addAll(s);
		
		Collections.sort(list1);

		for (int res : list1) {
			bw.write(res+"");
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}
