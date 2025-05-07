import java.io.*;
import java.util.*;

public class whyDidTheCowCrossTheRoad {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("circlecross.in"));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("circlecross.out");

        int[] points = new int[52];
        HashSet<String> pairs = new HashSet<>();
        int count=0;

        String input = br.readLine();
        for(int i=0;i<52;i++){
            int cow = input.charAt(i) - 'A';
            points[i] = cow;
        }
        System.out.println(Arrays.toString(points));

        for(int a =0; a < 52; a++){
            for (int b =a+1; b < 52; b++){
                for(int c = b+1; c < 52; c++){
                    for(int d = c+1; d < 52; d++){
                        if(points[a] == points[c] && points[b] == points[d]){
                            count++;
                        }
                    }
                }
            }
        }
        // System.out.println(count);
        pw.println(count);
        pw.close();
    }
}
