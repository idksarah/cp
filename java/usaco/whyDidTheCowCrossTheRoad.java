import java.io.*;
import java.util.*;
// 3:20 pm 1/18/25
// 3:28
// 12:35 pm 1/19
// passed 1st 1:22
// 12:55 am 1/25
// 1:23 am
public class whyDidTheCowCrossTheRoad {
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(new FileReader("circlecross.in"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // PrintWriter pw = new PrintWriter("circlecross.out");

        HashMap<Character, List<Integer>> points = new HashMap<>();
        HashSet<String> pairs = new HashSet<>();
        int count=0;

        //REMEMBER UR HASHMAPS ARE 0 BASED!! THEY ARE 1 OFF!!!!!!!!!!!!!!!!!!!
        String input = br.readLine();
        for(int i=0;i<52;i++){
            char cow = input.charAt(i);
            points.putIfAbsent(cow, new ArrayList<>());
            points.get(cow).add(i);
        }
        for(int a =0; a <26;a++){
            System.out.println(a);
            char currCow = (char)(a+'A');
            List<Integer> currCowPoints = points.get(currCow);
            System.out.println(currCowPoints);
            for(int b =currCowPoints.get(0); b <(currCowPoints.get(1)); b++){
                char innerCow = input.charAt(b);
                if(points.get(innerCow).get(1) > currCowPoints.get(1)){
                    // if((points.get(innerCow).get(0) < currCowPoints.get(1) && points.get(innerCow).get(1) > currCowPoints.get(0)) || (points.get(innerCow).get(0) > currCowPoints.get(0) && points.get(innerCow).get(1) < currCowPoints.get(0))){
                    char[] cowsArr = new char[]{currCow, innerCow};
                    Arrays.sort(cowsArr);
                    String cows = new String(cowsArr[0] + ""+cowsArr[1]);
                    if(!pairs.contains(cows)){
                        pairs.add(cows);
                        System.out.println(cows);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(pairs.toString());
        System.out.println(pairs.size());
        // pw.println(count);
        // pw.close();
        
    }
}
