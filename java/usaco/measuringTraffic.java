import java.io.*;
// 12:15am 1/7/25
public class measuringTraffic {    
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(new FileReader("traffic.in"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // PrintWriter pw = new PrintWriter("traffic.out");
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());
        String[][] segments = new String[N][3];

        for(int i =0; i < N;i++){
            String[] temp = br.readLine().split(" ");
            segments[i][0] = temp[0];
            segments[i][1] = temp[1];
            segments[i][2] = temp[2];
        }

        int prior[] = new int[2], post[] = new int[2];
        for(int a =0; a < N; a ++){
            if(segments[a][0] == "on"){
                
            } else if(segments[a][0] == "none"){

            } else {

            }
        }

        pw.close();
    }
}