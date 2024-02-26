import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main{
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int numCount = Integer.parseInt(br.readLine());
		String[] input_str = br.readLine().split(" ");

		int numCount2 = Integer.parseInt(br.readLine());
		String[] compare_str = br.readLine().split(" ");

		HashMap<String, Integer> map = new HashMap<>();


		for (int i = 0; i < numCount; i++) {
			String key = input_str[i];
			int value = map.getOrDefault(key, 0);
			map.put(key, value + 1);
		}
		for (int i = 0; i < numCount2; i++) {
			bw.write(map.getOrDefault(compare_str[i], 0)+" ");
		}

		br.close();
		bw.close();
	}
}
