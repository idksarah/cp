import java.io.*;
import java.util.*;

public class repetitions {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String[] sequence = st.nextToken().split("");

		String currentLetter = sequence[0];
		int longest = 0;
		int current = 0;

		for(int i=0; i < sequence.length; i++){
			if(currentLetter.equals(sequence[i])){	
				current++;
			}else{
				currentLetter = sequence[i]; 
				if(current > longest){
					longest = current;
				}
				current = 1;
			}
		}
		if(current > longest){
			longest = current;
		}
		System.out.println(longest);
	}
}
