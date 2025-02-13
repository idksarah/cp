import java.io.*;
import java.util.*;

// 12:53 pm 2/2/25
// first test case 1:12; 60%
// 1:27

public class loadBalancing{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("balancing.in"));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("balancing.out");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[][] coords = new int[N][2];
        int[] xFences = new int[N];
        int[] yFences = new int[N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            coords[i][0] = Integer.parseInt(st.nextToken());
            coords[i][1] = Integer.parseInt(st.nextToken());
            xFences[i] = coords[i][0] + 1;
            yFences[i] = coords[i][1] + 1;
        }
        int min = Integer.MAX_VALUE;
        for(int a = 0; a < xFences.length; a++){
            for(int b = 0; b < yFences.length; b++){
                int Q1 = 0, Q2 = 0, Q3 = 0, Q4 = 0;
                for(int c = 0; c < N; c++){
                    if(coords[c][0] < xFences[a]){
                        if(coords[c][1] < yFences[b]){
                            Q3++;
                        } else {
                            Q2++;
                        }
                    } else {
                        if(coords[c][1] < yFences[b]){
                            Q4++;
                        } else {
                            Q1++;
                        }
                    }
                }
                min = Math.min(Math.max(Math.max(Math.max(Q1, Q2),Q3),Q4), min);
            }
        }
        pw.println(min);
        pw.close();
    }
}