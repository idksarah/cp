import java.io.*;
import java.util.*;

public class increasingArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(s.nextToken());

		String rawInputs = br.readLine();

		Long count = Long.valueOf(0);

		StringTokenizer rawS = new StringTokenizer(rawInputs, " ");
		Long old = Long.valueOf(rawS.nextToken());
		
		for(int i=0; i < N-1; i++){
			Long current = Long.valueOf(rawS.nextToken());
			if (current < old){
				count += old - current;
			}
			if(current<old || current ==old){
			} else {
				old = current;
			}
		}
		System.out.println(count);
	}
}
