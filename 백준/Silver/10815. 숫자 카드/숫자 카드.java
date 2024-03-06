import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		int[] N_num = new int[N];
		String[] N_str; //= new String[N];
		
		N_str = br.readLine().split(" ");
		
		for (int i = 0; i < N_str.length; i++) {
			N_num[i] = Integer.parseInt(N_str[i]); 
		}
		
		int M = Integer.parseInt(br.readLine());
		
		int[] M_num = new int[M];
		String[] M_str = new String[M];
		
		M_str = br.readLine().split(" ");
		
		for (int i = 0; i < M_str.length; i++) {
			M_num[i] = Integer.parseInt(M_str[i]); 
		}

		Arrays.sort(N_num);
		
		for (int j = 0; j < M; j++) {
			if(Arrays.binarySearch(N_num, M_num[j])>=0){
				bw.write("1 ");
			}
			else {
				bw.write("0 ");
			}
		}
		
		br.close();
		bw.close();
	}
}
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class Main {
//	public static void main(String[] args) throws Exception {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//
//		int N = Integer.parseInt(br.readLine());
//		int[] N_num = new int[N];
//
//		st = new StringTokenizer(br.readLine());
//		for (int i = 0; i < N; i++) {
//			N_num[i] = Integer.parseInt(st.nextToken());
//		}
//		
//		int M = Integer.parseInt(br.readLine());
//		int[] M_num = new int[M];
//		
//		st = new StringTokenizer(br.readLine());
//		for (int i = 0; i < M_num.length; i++) {
//			M_num[i]=Integer.parseInt(st.nextToken());
//		}
//		
//		Arrays.sort(N_num);
//
//		for (int j = 0; j < M; j++) {
//			if (Arrays.binarySearch(N_num, M_num[j]) >= 0) {
//				bw.write("1 ");
//			} else {
//				bw.write("0 ");
//			}
//		}
//
//		br.close();
//		bw.close();
//	}
//}

