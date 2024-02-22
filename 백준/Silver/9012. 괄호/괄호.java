import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int line = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < line; i++) {
			String data = br.readLine();
			
			Stack<Character> st = new Stack<Character>();
			
			for(int j = 0; j < data.length(); j++) {
				if(data.charAt(j) == '(') {
					st.push(data.charAt(j));
				}else {
					if(st.empty()) {
						st.push(data.charAt(j));
						break;
					}else {
						st.pop();
					}
				}
			}
			if(st.empty()) {
				bw.write("YES");
				bw.newLine();
			}
			else {
				bw.write("NO");
				bw.newLine();
			}
		}
		br.close();
		bw.close();
	}

}