import java.io.*;
import java.util.*;

// 12:27 3/18/25
// 4:57 pm 3/21
// 6:30pm 3/29

public class livestockLineup {
    static String[][] constraints;
    static ArrayList goodCows;
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedHashMap<String, Integer> alphaCowMap = new LinkedHashMap<>();

        String[] cows = {"Beatrice", "Belinda", "Bella", "Bessie", "Betsy", "Blue", "Buttercup", "Sue"};
        for (int i = 0; i < cows.length; i++) {
            alphaCowMap.put(cows[i], i);
        }

        LinkedHashMap<String, Integer> testCowMap = new LinkedHashMap<>();
        int N = Integer.parseInt(br.readLine());
        for(int i =0; i < N; i++){
            String[] instructions = br.readLine().split(" ");
            constraints[i][0] = instructions[0];
            constraints[i][1] = instructions[1];
        }
        // for (int i = 0; i < constraints.length; i++) {
        //     System.out.println(Arrays.toString(constraints[i]));
        // }
        // ArrayList initial = new ArrayList<>();
        // initial.add(0);
        // recurse(initial);
        // for(int i = 0; i < goodCows.size(); i++){
        //     System.out.println(intToCows.get(goodCows.get(i)));
        // }
    
    }
}