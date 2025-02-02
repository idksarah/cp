import java.io.*;
import java.util.Scanner;

public class speedingTicket{
    public static void main(String[] args) throws  IOException {
        // BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        // PrintWriter pw = new PrintWriter("speeding.out");        
		Scanner sc = new Scanner(System.in);
        
        // int N = Integer.parseInt(br.readLine());
        // int M = Integer.parseInt(br.readLine());
        int N = sc.nextInt();
        int M = sc.nextInt();
       
        int[] NSegments = new int[N];
        int[] NSpeed = new int[N];
        int[] MSegments = new int[M];
        int[] MspeedLimits = new int[M];
        int max = 0, NCounter = 0, MCounter = 0, currentSpeed=0, currentSpeedLimit=0;

        for(int i=0; i<N; i++){
            NSegments[i] = sc.nextInt();
            NSpeed[i] = sc.nextInt();
        }
        for(int i=0; i<M; i++){
            MSegments[i] = sc.nextInt();
            MspeedLimits[i] = sc.nextInt();
        }
        int NsegmentsTotaled=NSegments[0], MsegmentsTotaled=MSegments[0];

       for(int i =0; i<100; i++){
        System.out.println(i);
            System.out.println("N segment" + NSegments[NCounter]);
            if(i==NsegmentsTotaled){
                NsegmentsTotaled+= NSegments[NCounter];
                currentSpeed = NSpeed[NCounter];
                NCounter++;
            }
            System.out.println("M segment" + MSegments[MCounter]);
            if(i==MsegmentsTotaled){ //might be 1 off
                MsegmentsTotaled+=MSegments[MCounter];
                currentSpeedLimit=MspeedLimits[MCounter];
                MCounter++;
            }
            if(currentSpeed>currentSpeedLimit && (currentSpeed-currentSpeedLimit)> max){
                max= currentSpeed-currentSpeedLimit;
            }
       }
       System.out.println("max" + max);
    }
}