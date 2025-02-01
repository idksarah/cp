
import java.util.*;

public class permutations {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] inputs = new int[N];

		if(inputs.length<4){
			if(N ==1){
				System.out.println(1);
				return;
			}
			System.out.println("NO SOLUTION"); //seven doesnt work suck my DICK
			return;
		}else{
			if(N%2 != 0){
				int evenCounter=0;
				for(int i=0; i < inputs.length; i +=2){ //swap oddCounter i
					inputs [i] = i+1;
				}
				for(int i=inputs.length-1; i >0; i-=2){
					inputs[evenCounter+1] = i;
					evenCounter+=2;
				}
			} else {
				int evenCounter=0;
				for(int i=0; i < inputs.length; i +=2){ //swap oddCounter i
					inputs [i] = i+1;
				}
				for(int i=inputs.length; i >0; i-=2){
					inputs[evenCounter+1] = i;
					evenCounter+=2;
				}
			}

			int middle = (int)Math.ceil(((float)N)/((float)2));

			int a = inputs[middle-1];
			int b = inputs[middle];
			inputs[middle-1] = b;
			inputs[middle] = a;

			int c = inputs[middle-1];
			inputs[middle-1] = inputs[0];
			inputs[0] = c;

			if(Math.abs(inputs[0]-inputs[1])<2){
				a = inputs[1];
				b = inputs[inputs.length-1];
				inputs[1] =b;
				inputs[inputs.length-1] = a;
			}

			System.out.println(Arrays.toString(inputs).replaceAll("\\[|\\]|,",""));
		}
		sc.close(); 	
	}
}	
