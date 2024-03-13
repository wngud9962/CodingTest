import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.ResultSet;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input_str[] = br.readLine().split(" ");

		int input_num[] = new int[input_str.length];

		for (int i = 0; i < input_str.length; i++) {
			input_num[i] = Integer.parseInt(input_str[i]);
		}

		int x = input_num[0] <= (input_num[2] - input_num[0]) ? input_num[0] : input_num[2] - input_num[0];
		int y = input_num[1] <= (input_num[3]-input_num[1]) ? input_num[1] : input_num[3]-input_num[1];
		
		int result = x<=y ? x:y;
		
		bw.write(result+"");

		br.close();
		bw.close();
	}
}