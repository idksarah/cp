import java.io.*;
import java.util.*;

// passes sample case 5:11 PM 4/22/25
// ts loses solutions somewhere IDK like for 88 as solution it returns 85 or for answer == 60 it reutnrs 58 idk bru

public class backAndForth {
    static ArrayList<Integer> iB1;
    static ArrayList<Integer> iB2;
    static HashSet<Integer> sums;
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(new FileReader("backforth.in"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // PrintWriter pw = new PrintWriter("backforth.out");

        iB1 = new ArrayList<>(10);
        iB2 = new ArrayList<>(11);
        sums = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 10; i++){
            iB1.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 10; i++){
            iB2.add(Integer.parseInt(st.nextToken()));
        }
        recurse(iB1, iB2, 0, 0);
        // System.out.println(sums.toString());
        // pw.println(sums.size());
        // pw.close();
        System.out.println(sums.size());
    }

    public static void recurse(ArrayList<Integer> b1, ArrayList<Integer> b2, int sum, int day){
        if (day % 2 == 0){ // day 0 or day 2
            for(int i = 0; i < b1.size(); i++){
                int bucket = b1.get(i);
                b1.remove(Integer.valueOf(bucket));
                b2.add(bucket);
                // System.out.println("barn 1" + b1.toString() + "   " + "barn 2" + b2.toString());
                recurse(b1, b2, sum - bucket, day + 1);
                b1.add(bucket);
                b2.remove(Integer.valueOf(bucket));
            }
        } else {
            for(int i = 0; i < b2.size(); i++){
                int bucket = b2.get(i);
                if (day == 1) { // day 1
                    b1.add(bucket);
                    b2.remove(Integer.valueOf(bucket));
                    // System.out.println("barn 1" + b1.toString() + "   " + "barn 2" + b2.toString());
                    recurse(b1, b2, sum + bucket, day + 1);
                    b1.remove(Integer.valueOf(bucket));
                    b2.add(bucket);
                } else { // day 3
                    sums.add(sum + bucket);
                }
            }
        }
    }
}
