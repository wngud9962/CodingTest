import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int case_num = sc.nextInt();
		int[] sumArr = new int[case_num];
		int a = 0;
		int b = 0;
		for (int i = 0; i < case_num; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sumArr[i] = a+b;
		}
		for (int i = 0; i < case_num; i++) {
			System.out.println(sumArr[i]);
		}
	}
}