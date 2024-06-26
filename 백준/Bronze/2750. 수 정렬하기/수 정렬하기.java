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

// 트리셋 사용
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
// import java.util.Set;
// import java.util.TreeSet;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

// 		int line = Integer.parseInt(br.readLine());
// 		int input[] = new int[line];
		
// 		Set<Integer> s = new TreeSet<>();

// 		for (int i = 0; i < line; i++) {
// 			input[i] = Integer.parseInt(br.readLine());
// 		}


// 		for (int i = 0; i < line; i++) {
// 			s.add(input[i]);
// 		}

// 		for (int res : s) {
// 			bw.write(res+"");
// 			bw.newLine();
// 		}

// 		br.close();
// 		bw.close();
// 	}
// }

