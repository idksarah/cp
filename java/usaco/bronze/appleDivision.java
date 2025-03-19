import java.io.*;
import java.util.*;

// 7:15 pm 2/5/25
// 8:23 pm 2/10
// 5:10 pm
// 12:15 pm 3/17
public class appleDivision {
    static long N;
    static long min;
    static long[] apples;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        apples = new long[(int)N];
        for(int i =0; i < N; i++){
             apples[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(recurse(0, apples[0], 1));

    }
    static long recurse(long sum1, long sum2, int n){
        if (n == N){
            return Math.abs((sum1 - sum2));
        }
        return(Math.min(recurse(sum1 + apples[n], sum2, n + 1), recurse(sum1, sum2 + apples[n], n + 1)));
    }
}
