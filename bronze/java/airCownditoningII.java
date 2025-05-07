import java.io.*;
import java.util.*;

public class airCownditoningII {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] idealTemps = new int[100];
        int minPrice = Integer.MAX_VALUE;

        // finds desired temp for every stall
        for(int a = 0; a < N; a++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int temp = Integer.parseInt(st.nextToken());
            for(int b = start - 1; b < end; b++){
                idealTemps[b] = Math.max(temp, idealTemps[b]);
            }
        }

        // store ac values
        int[][] acs = new int[M][4];
        for(int a = 0; a < M; a++){
            st = new StringTokenizer(br.readLine());
            acs[a][0] = Integer.parseInt(st.nextToken());
            acs[a][1] = Integer.parseInt(st.nextToken());
            acs[a][2] = Integer.parseInt(st.nextToken());
            acs[a][3] = Integer.parseInt(st.nextToken());
        }

        // generate ac subsets
        String[] bitmask = new String[(int)Math.pow(2,M)];
        for(int i = 0; i < (int)Math.pow(2, M); i++){
           String binary = String.format("%" + M + "s", Integer.toBinaryString(i)).replace(' ', '0'); 
           bitmask[i] = binary;
        }
        
        for(int acIteration = 0; acIteration < bitmask.length; acIteration++){
            int[] currTemps = new int[100]; 
            int currMinPrice = 0;
            boolean acceptable = true;
            // create conditions if acs r on
            for(int acNum = 0; acNum < M; acNum++){
                if(bitmask[acIteration].charAt(acNum) == '1'){
                    currMinPrice += acs[acNum][3];
                    for(int start = acs[acNum][0] -1; start < acs[acNum][1]; start++){
                        currTemps[start] += acs[acNum][2];
                    }
                }
            }
            for(int acNum = 0; acNum < 100; acNum++){
                if(idealTemps[acNum] > currTemps[acNum]){
                    acceptable = false;
                }
            }
            if(acceptable){
                minPrice = Math.min(currMinPrice, minPrice);
            }
        }
        System.out.println(minPrice);        
    }
}
