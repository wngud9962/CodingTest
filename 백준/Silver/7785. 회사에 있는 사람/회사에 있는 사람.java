import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int line = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();

		// set에 넣어야함, 중복 제거

		for (int i = 0; i < line; i++) {
			String[] input = br.readLine().split(" ");
			if (input[1].equals("enter")) {
				set.add(input[0]);
			}
			if (input[1].equals("leave")) {
				set.remove(input[0]);
			}
		}
		list.addAll(set);

		Collections.sort(list, Comparator.reverseOrder());

		for (String res : list) {
			bw.write(res);
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}
