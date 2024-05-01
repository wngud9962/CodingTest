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

		String input = br.readLine();
		HashSet<String> set = new HashSet<>();
		
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j <= input.length(); j++) {
				set.add(input.substring(i,j));
			}
		}
		
		bw.write(set.size()+"");
		
		br.close();
		bw.close();
	}
}
