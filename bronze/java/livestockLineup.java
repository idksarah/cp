import java.io.*;
import java.util.*;

// 12:27 3/18/25
// 4:57 pm 3/21
// 6:30pm 3/29
// 4/15

public class livestockLineup {
    static String[][] constraints;
    static ArrayList<String> alphaCows; 
    static PrintWriter pw;
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader br = new BufferedReader(new FileReader("lineup.in"));
        pw = new PrintWriter("lineup.out");

        alphaCows = new ArrayList<String>(Arrays.asList("Beatrice", "Belinda", "Bella", "Bessie", "Betsy", "Blue", "Buttercup", "Sue"));
        int N = Integer.parseInt(br.readLine());
        constraints = new String[N][2];
        for(int i =0; i < N; i++){
            String[] instructions = br.readLine().split(" ");
            constraints[i][0] = instructions[0];
            constraints[i][1] = instructions[5];
        }
        LinkedHashMap<String, Integer> blank = new LinkedHashMap<>();
        recurse(blank, 0, alphaCows);
        pw.close();
    }
    public static void recurse(LinkedHashMap<String, Integer> cows, Integer index, ArrayList<String> leftOverCows){
        // System.out.println(cows);
        if (cows.size() == 8){     
            // System.out.println(check(cows));     
            if (check(cows)){
                // System.out.println("check");  
                for(String cow : cows.keySet()){
                    // pw.println(cow);
                    System.out.println(cow);
                }
                pw.close();
                System.exit(0); //sus
            }
        } else {
            ArrayList<String> copy = new ArrayList<String>(leftOverCows);
            for (String cow : copy) {
                cows.put(cow, index);
                leftOverCows.remove(cow);
                recurse(cows, index + 1, leftOverCows);
                leftOverCows.add(cow);
                cows.remove(cow);
            }
            
        }
    }

    public static boolean check (LinkedHashMap<String, Integer> cows){
        boolean passes = true;
        for (int a = 0; a < constraints.length; a++){
            String cowA = constraints[a][0];
            String cowB = constraints[a][1];
            int posA = cows.get(cowA);
            int posB = cows.get(cowB);
            if (Math.abs(posA - posB) != 1){
                passes = false;
            }
        }
        return passes;
    }
}