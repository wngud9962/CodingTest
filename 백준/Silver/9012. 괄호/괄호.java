import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	//")"이 들어왔을때 stack이 비어있으면 여는괄호가 없기 때문에 NO
	//반복종료
	
	//반복문이 끝나고 스택에 저장된게 없으면 YES
	
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
				}
				else if(data.charAt(j) == ')'){
					if(st.empty()) {
						st.push(data.charAt(j));
						break;
					}
					else {
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