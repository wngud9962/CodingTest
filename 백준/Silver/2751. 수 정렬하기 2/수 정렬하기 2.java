import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int line = Integer.parseInt(br.readLine());
		int arr[] = new int[line];
		
		for (int i = 0; i < line; i++) {
			arr[i] = Integer.parseInt(br.readLine()); 
		}
		
		Arrays.sort(arr);
		
		for(int res: arr) {
			bw.write(res+"");
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}
