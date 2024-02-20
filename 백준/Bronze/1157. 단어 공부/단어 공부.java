import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String word = br.readLine().toUpperCase();// 입력 알파벳

		char word_str[] = new char[word.length()]; // 알파벳 갯수만큼 배열길이 생성
		int max = 0;
		int[] arr = new int[26];
		boolean duplicate = false;
		int index = 0;

		for (int i = 0; i < word.length(); i++) {
			word_str[i] = word.charAt(i);
		}

		for (int i = 0; i < word_str.length; i++) {
			int a = word_str[i] - 'A';
			arr[a]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				duplicate = false;
				max = arr[i];
				index = i;
			} else if (max == arr[i]) {
				duplicate = true;
			}
		}

		if (duplicate == true) {
			System.out.println("?");
		}

		else {
			System.out.println((char) (index + 'A'));
		}

//		for (char a = 'a'; a <= 'z'; a++) {
//			System.out.println(a + ": " + (int) (a - 'a'));
//		}
//		for (char a = 'A'; a <= 'Z'; a++) {
//			System.out.println(a + ": " + (int) (a - 'A'));
//		}
		br.close();
		bw.close();
	}
}
