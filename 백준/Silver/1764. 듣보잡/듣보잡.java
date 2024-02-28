import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		String first_line[] = br.readLine().split(" ");
		int hearLine = Integer.parseInt(first_line[0]); // 3
		int seeLine = Integer.parseInt(first_line[1]); // 4

		int cnt = 0;
		for (int i = 0; i < hearLine; i++) {
			list2.add(br.readLine());
		}
		
		Collections.sort(list2);
		
		for (int i = 0; i < seeLine; i++) {
			String temp=br.readLine();
			if(Collections.binarySearch(list2, temp)>=0) {
				list.add(temp);
			}
		}
		StringBuilder sb = new StringBuilder();
		
		sb.append(list.size()+"\n");
		
		Collections.sort(list);
		for (String answer : list) {
			sb.append(answer+"\n");
		}
		bw.write(sb.toString());

		br.close();
		bw.close();
	}
}
