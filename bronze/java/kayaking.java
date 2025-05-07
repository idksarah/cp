import java.io.*;
import java.util.*;

public class kayaking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> weights = new ArrayList<>();

        for(int i = 0; i < 2 * n; i++){
            weights.add(Integer.parseInt(st.nextToken())); 
        }

        Collections.sort(weights);

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 2 * n; i++){
            for(int j = 0; j < 2 * n; j++){
                int tempSum = 0;
                if (j != i){
                    ArrayList<Integer> copy = new ArrayList<>();
                    for(int k = 0; k < 2 * n; k++){
                        if(k != i && k != j){
                            copy.add(weights.get(k));
                        }
                    }
                    for(int k = 0; k < 2 * n - 2; k+= 2){
                        tempSum += copy.get(k + 1) - copy.get(k);
                    }
                    min = Math.min(tempSum, min);
                }
            }
        }

        System.out.println(min);

    }
}
