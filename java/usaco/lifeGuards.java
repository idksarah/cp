import java.io.*;
import java.util.Arrays;

// 1:19am 1/10/25
// sleepy at 1:50 am

public class lifeGuards {
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(new FileReader("lifeguards.in"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // PrintWriter pw = new PrintWriter("lifeguards.out");

        int N = Integer.parseInt(br.readLine());
        int[] times = new int[N*2];
        for(int a = 0; a < N*2; a +=2){
            String[] temp = br.readLine().split(" ");
            times[a] = Integer.parseInt(temp[0]);
            times[a+1] = Integer.parseInt(temp[1]);
        }
        int ends[] = new int[N];
        for(int i =0; i < N; i++){
            ends[i] = times[i+1];
        }
        Arrays.sort(ends);
        System.out.println(Arrays.toString(ends));
        // System.out.println(Arrays.toString(times));
        int runninTotal=0;
        for(int a =0; a < ends[N-1]; a ++){
            for(int b =0; b < ends[N-1]; b++){
                if(a!=b){
                    int possibleTotal=0;
                    int[] possible = new int[N];
                    for(int c =0; c < ends[N-1]; c++){
                        if(c > times[2*a+b] && c < times[2*a+b+1]){
                            possible[c]++;
                        }
                    }
                    for(int d =0; d < ends[N-1]; d++){
                        if(possible[d] > 0){
                            possibleTotal++;
                        }
                    }
                    System.out.println(possibleTotal);
                    if(possibleTotal > runninTotal){
                        runninTotal = possibleTotal;
                    }
                }
            }
        }
        System.out.println(runninTotal);
    }
}
