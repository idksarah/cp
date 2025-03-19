import java.io.*;
import java.util.*;

// 12:27 3/18/25

public class livestockLineup {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, String> cows = new HashMap<>();

        cows.put(0, "Beatrice");
        cows.put(1, "Bella");
        cows.put(2, "Belinda");
        cows.put(3, "Bessie");
        cows.put(4, "Betsy");
        cows.put(5, "Blue");
        cows.put(6, "Buttercup");
        cows.put(7, "Sue");
        
        int N = Integer.parseInt(st.nextToken());
        int[][] constraints = new int[N][2];

        for(int i =0; i < N; i++){
            String[] instructions = br.readLine().split(" ");
            constraints[i][0] = cows.(instructions[0]);
            constraints[i][1] = cows.containsKey(instructions[5]);
        }
    }

    // public static 
}