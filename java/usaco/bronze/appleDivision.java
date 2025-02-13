import java.io.*;
import java.util.*;

// 7:15 pm 2/5/25
// 8:23 pm 2/10
public class appleDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] inputs = new long [N];
        for(int i =0; i < N; i++){
             inputs[i] = Long.parseLong(st.nextToken());
        }
        long[][][] tree = new long[N+1][(int)Math.pow(2,N)][2];
        for(int a = 1; a < N + 1; a++){
            for(int b = 0; b < Math.pow(2, a + 1); b+=2){
                // point 1
                tree[a][b][0] = inputs[a] + tree[a - 1][(int)Math.ceil(b / 2)][0];
                tree[a][b][1] = tree[a - 1][(int)Math.ceil(b / 2)][0];
                // point 2 
                tree[a][b + 1][0] = inputs[a] + tree[a - 1][(int)Math.ceil((b + 1) / 2)][0];
                tree[a][b + 1][1] = tree[a - 1][(int)Math.ceil((b + 1) / 2)][0];
            }
        }
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < (1 << N); j++) {
                System.out.print("tree[" + i + "][" + j + "] = { ");
                for (int k = 0; k < 2; k++) {
                    System.out.print(tree[i][j][k] + (k < 1 ? ", " : ""));
                }
                System.out.println(" }");
            }
        }
        
    }
}
