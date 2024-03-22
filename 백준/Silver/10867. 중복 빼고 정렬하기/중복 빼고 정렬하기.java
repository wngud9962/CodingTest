import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		String numArr[] = new String[num];
		numArr = br.readLine().split(" ");
		int numArr_2[] = new int[num];

		for (int i = 0; i < numArr.length; i++) {
			numArr_2[i] = Integer.parseInt(numArr[i]);
		}

		Set<Integer> numSet = new HashSet<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			numSet.add(numArr_2[i]);
		}

		list.addAll(numSet);

		Collections.sort(list);

		for (int res : list) {
			bw.write(res + "" + " ");
		}

		br.close();
		bw.close();
	}
}