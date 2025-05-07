import java.io.*;

public class circularBarn {
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("cbarn.in"));
        PrintWriter pw = new PrintWriter("cbarn.out");

        int N = Integer.parseInt(br.readLine());
        int[] doors = new int[N];
        int min = 2147483647; 

        int[] capacity = new int[N];
        for(int i =0; i < N; i++){
            capacity[i] = Integer.parseInt(br.readLine());
        }
        for(int a =0; a < N; a ++){
            // System.out.println("a:" + a);
            int possDistance=0;
            for(int b =0; b < N-1; b++){
                // System.out.println("b:" + b);
                if(a+b> capacity.length-1){
                    possDistance+= (b+1) * capacity[Math.abs(capacity.length - (a+b))];
                } else {
                    possDistance+= (b+1) * capacity[a+b];
                }
                // System.out.println(possDistance);
            }
            if(possDistance < min){
                min=possDistance;
            }
        }
        // System.out.println(min);
        pw.println(min);
        pw.close();

    }
}
