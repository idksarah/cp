
import java.io.*;

public class diamondCollector {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("diamond.in"));
        // BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("diamond.out");

        String[] NK = br.readLine().split(" ");
        int num = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        int max=0, counter=0, upper =0, lower=0;

        int[] sizes = new int[num];
        for(int i=0;i < num; i++){
            sizes[i] = Integer.parseInt(br.readLine());
        }

        for(int a=0; a< sizes.length; a++){
            upper = sizes[a]+K;
                lower = sizes[a];
            // System.out.println("up" + upper);
            // System.out.println("low" + lower);
            for(int b=0; b < sizes.length; b++){
                if(sizes[b] >= lower && sizes[b] <= upper){
                    counter++;
                }
            }
            // System.out.println(counter);
            if(counter > max){
                max = counter;
            }
            counter = 0;
        }

        pw.println(max);
        pw.close();
    }
}