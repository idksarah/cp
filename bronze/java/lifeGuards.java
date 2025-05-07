import java.io.*;
import java.util.Arrays;


public class lifeGuards {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("lifeguards.in"));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("lifeguards.out");

        int N = Integer.parseInt(br.readLine());
        int[] times = new int[N*2];
        for(int a = 0; a < N*2; a +=2){
            String[] temp = br.readLine().split(" ");
            times[a] = Integer.parseInt(temp[0]);
            times[a+1] = Integer.parseInt(temp[1]);
        }
        int ends[] = new int[N];
        int ignore =0;
        for(int i =1; i < N*2; i+=2){
            ends[ignore] = times[i];
            ignore++;
        }
        Arrays.sort(ends);
        // System.out.println("ends:" + Arrays.toString(ends));
        // System.out.println("all times:" + Arrays.toString(times));
        int max=0;
        int[] fired = new int[2];
        for(int a =0; a < N; a ++){
            for (int b=0; b< N; b++){
                fired[0] =(times[2*b]);
                fired[1] =(times[2*b+1]);
                // System.out.println("fired" + Arrays.toString(fired));
                if(a != b){
                    int possMax = 0;
                    int[] possibilities = new int[ends[N-1]]; //makes new arr with length of the highest end time
                    for(int c =0; c < N; c++){
                        int[] tempTimes = new int[2];
                        tempTimes[0] = times[2*c];
                        tempTimes[1]=times[2*c+1]; 
                        // System.out.println("tempTimes" + Arrays.toString(tempTimes));
                        if(fired[0] != tempTimes[0] && fired[1] != tempTimes[1]){
                            for(int d =0; d < ends[N-1]; d++){
                                // System.out.println("d:"+d);
                                if(d >= tempTimes[0]  && d <=tempTimes[1]-1) { //minus 1 compensates for the fact taht arr starts from 0 and tiems start from 1
                                    possibilities[d]++;
                                }
                            }
                        }
                        // System.out.println(Arrays.toString(possibilities));
                    }
                    for(int i =0; i<ends[N-1];i++){
                        if(possibilities[i] > 0){
                            possMax++;
                            // System.out.println("pss max:"+possMax);
                        }
                    }
                    if(possMax >max){
                        max=possMax;
                    }
                }
            }
        }
        // System.out.println(max);
        pw.println(max);
        pw.close();
    }
}
