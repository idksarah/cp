import java.io.*;
import java.util.*;
import javax.lang.model.element.Element;

// 12:27 3/18/25
// 4:57 pm 3/21
// 6:30pm 3/29

public class livestockLineup {
    static String[][] constraints;
    static ArrayList<String> alphaCows; 
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        alphaCows = new ArrayList<String>(Arrays.asList("Beatrice", "Belinda", "Bella"));
        // for (int i = 0; i < cows.length; i++) {
        //     alphaCowMap.put(cows[i], i);
        // }

        int N = Integer.parseInt(br.readLine());
        constraints = new String[N][2];
        for(int i =0; i < N; i++){
            String[] instructions = br.readLine().split(" ");
            constraints[i][0] = instructions[0];
            constraints[i][1] = instructions[5];
        }
        LinkedHashMap<String, Integer> blank = new LinkedHashMap<>();
        recurse(blank, 0, alphaCows);
    }
    public static void recurse(LinkedHashMap<String, Integer> cows, Integer index, ArrayList<String> leftOverCows){
        System.out.println(cows);
        if (cows.size() == 8){
            System.out.println("check");            
            if (check(cows)){
                for(String cow : cows.keySet()){
                    System.out.println(cow);
                }
            }
            System.exit(0); //sus
        } else {
            ArrayList<String> copy = new ArrayList<String>(leftOverCows);
            for (String cow : copy) {
                cows.put(cow, index);
                leftOverCows.remove(cow);
                recurse(cows, index + 1, leftOverCows);
                leftOverCows.add(cow);
                cows.remove(cow, index);
            }
            
        }
    }

    public static boolean check (LinkedHashMap<String, Integer> cows){
        boolean passes = true;
        for (int a = 0; a < constraints.length; a++){
            String cowA = constraints[a][0];
            String cowB = constraints[a][1];
            if ((cows.get(cowA) - 1 != cows.get(cowB)) && cows.get(cowA) + 1 != cows.get(cowB)){
                passes = false;
            }
        }
        return passes;
    }
}