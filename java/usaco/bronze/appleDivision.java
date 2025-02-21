import java.io.*;
import java.util.*;

// 7:15 pm 2/5/25
// 8:23 pm 2/10
// 5:10 pm
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

        int totalIndices = 0;
        for(int i = 1; i < inputs.length + 1; i++){
            totalIndices += Math.pow(2, i);
        }
        long[][] tree = new long[totalIndices][2];

        long first = inputs[0];
        tree[0] = new long[]{first, 0}; 
        tree[1] = new long[]{0, first};
        
        int lastOffset = 2;
        long currOffset = 0;
        for(int a = 0; a < inputs.length; a++){
            currOffset += Math.pow(2,(long)a);
            for(int b = 0; b < Math.pow(2,a); b++){
                tree[lastOffset + b] = new long[]{tree[lastOffset + (int)b/2][0] + inputs[a], tree[lastOffset + (int)b/2][1]};
                tree[lastOffset + b + 1] = new long[]{tree[lastOffset + (int)b/2][0], tree[lastOffset + (int)b/2][1] + inputs[a]};
            }
            lastOffset += Math.pow(2,(long)a);
        }
        /*
        input = [3,2,7]
        arraylist [][]
        arraylist[0][3,0]
        arraylist[1][0,3]
        int lastoffset += 2^ a
         * for a < length
         *      int curoffset += 2^ a
         *      for b < 2 ^ a
         *          arraylist[offset +b][0] = arraylist[lastoffset + (int)(b/2)][0] + input[a]
         *          arraylist[offset +b][1] = arraylist[lastoffset + (int)(b/2)][1]
         * 
         *          arraylist[offset +b+1][0] = arraylist[lastoffset + (int)(b/2)][0]
         *          arraylist[offset +b+1][1] = arraylist[lastoffset + (int)(b/2)][1]  + input[a] 
         *          
         *      lastoffset += 2 ^ a  
         */     
        
    }
}
