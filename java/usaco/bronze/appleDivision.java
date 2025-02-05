import java.io.*;
import java.util.*;

public class appleDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] inputs = new int[N];
        for(int i =0; i < N; i++){
             inputs[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(inputs);
        ArrayList<Integer> left = new ArrayList<>(); 
        ArrayList<Integer> right = new ArrayList<>();

        if(N%2 == 0){
            for(int i = 0; i < N/2; i+=2){
            }
    
        }
    }
}
