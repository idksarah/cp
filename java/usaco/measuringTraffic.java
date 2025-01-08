import java.io.*;
// 12:15am 1/7/25
//9:27 pm 1/7/25
//passes sample 10:24

//passes 2 cases......
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

        // System.out.println(Arrays.deepToString(segments));

        int current[] = new int[2];
        current[1] = 1001;
        
        for(int a =N-1; a > -1; a--){ // prior
            if(segments[a][0].equals("on")){
                // System.out.println("on");
                current[0] -= Integer.parseInt(segments[a][2]);
                current[1] -= Integer.parseInt(segments[a][1]);
            } else if(segments[a][0].equals("none")){
                // System.out.println("none");
                current[0] = Math.max(Integer.parseInt(segments[a][1]), current[0]);
                current[1] = Math.min(Integer.parseInt(segments[a][2]), current[1]);
            } else {
                // System.out.println("off");
                current[0] += Integer.parseInt(segments[a][2]);
                current[1] += Integer.parseInt(segments[a][1]);
            }
            // System.out.println(Arrays.toString(current));
        }
        // System.out.println(Arrays.toString(current));
        pw.print(current[0] + " ");
        pw.println(current[1]);
        current[0] = 0;
        current[1] = 1001;
        for(int a =0; a < N; a ++){ // post
            if(segments[a][0].equals("on")){
                // System.out.println("on");
                current[0] += Integer.parseInt(segments[a][2]);
                current[1] += Integer.parseInt(segments[a][1]);
            } else if(segments[a][0].equals("none")){
                // System.out.println("none");
                current[0] = Math.max(Integer.parseInt(segments[a][1]), current[0]);
                current[1] = Math.min(Integer.parseInt(segments[a][2]), current[1]);
            } else {
                // System.out.println("off");
                current[0] -= Integer.parseInt(segments[a][2]);
                current[1] -= Integer.parseInt(segments[a][1]);
            }
        }
        // System.out.println(Arrays.toString(current));
        // pw.print(current[0] + " ");
        // pw.println(current[1]);
        // pw.close();
    }
}