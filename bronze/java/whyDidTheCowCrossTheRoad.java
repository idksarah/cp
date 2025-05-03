import java.io.*;
import java.util.*;
// 3:20 pm 1/18/25
// 3:28
// 12:35 pm 1/19
// passed 1st 1:22
// 12:55 am 1/25
// 1:23 am
// 12:12 am
// 10:40 am 2/1 oh my goood
// 11:13 am i hate my life
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
