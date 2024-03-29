import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	
	public static int min(int...a) {
		int min =10000000;
		
		for(int i: a) {
			if(i<min) {
				min=i;
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Scanner sc = new Scanner(System.in);
		String input_str[] = br.readLine().split(" ");

		int input_num[] = new int[input_str.length];
		

		for (int i = 0; i < input_str.length; i++) {
			input_num[i] = Integer.parseInt(input_str[i]);
		}
		int x = input_num[0];
		int y = input_num[1];
		int w = input_num[2];
		int h = input_num[3];
		int min = min(x,y,(w-x),(h-y));
		
		bw.write(min+"");

		br.close();
		bw.close();
	}
}