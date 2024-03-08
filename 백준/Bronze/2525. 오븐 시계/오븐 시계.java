import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String firstTime_str[] = br.readLine().split(" ");
		int firstTime[] = new int[2];
		for (int i = 0; i < firstTime_str.length; i++) {
			firstTime[i] = Integer.parseInt(firstTime_str[i]);
		}

		int needTime = Integer.parseInt(br.readLine());

		int endTime[] = new int[2];
		endTime[0] = firstTime[0];
		endTime[1] = firstTime[1] + needTime;
		if (endTime[1] / 60 >= 1) {
			endTime[0] = endTime[0] + (endTime[1] / 60);
			endTime[1] = endTime[1] - (60*(endTime[1] / 60));
		}

		if (endTime[0] > 23) {
			endTime[0] = endTime[0] - 24;
		}

		for (int result : endTime) {
			bw.write(result + " ");
		}

		br.close();
		bw.close();
	}
}