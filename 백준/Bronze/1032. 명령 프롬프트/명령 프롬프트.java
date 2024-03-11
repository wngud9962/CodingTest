import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int line = Integer.parseInt(br.readLine());
		
		String input_str[] = new String[line];
		
		for (int i = 0; i < line; i++) {
			input_str[i] = br.readLine(); // 파일 이름 저장
		}

		boolean same = true;
		
		for (int i = 0; i < input_str[0].length(); i++) {
			for (int j = 1; j < line; j++) {
				if(input_str[0].charAt(i) != input_str[j].charAt(i)) {
					same = false;
					break;
				}
			}
			
			if(same) {
				bw.write(input_str[0].charAt(i));
			}
			else {
				bw.write("?");
				
				if (same == true) same = false;
				else same = true;
			}
		}
		

		br.close();
		bw.close();
	}
}