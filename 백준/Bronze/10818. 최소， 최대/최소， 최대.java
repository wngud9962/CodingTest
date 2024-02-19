import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int count = Integer.parseInt(br.readLine());
    	
    	int[] list = new int[count];
    	
    	String[] input = br.readLine().split(" ");
    	
    	for (int i = 0; i < count; i++) {
			list[i] = Integer.parseInt(input[i]);
		}
    	
    	int min = list[0];
    	int max = list[0];
    	
    	for (int i = 1; i < list.length; i++) {
			min = Math.min(min, list[i]);
			max = Math.max(max, list[i]);
		}
    	
    	System.out.println(min+" "+max);
    	
    	
    }
}