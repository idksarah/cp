import java.io.*;
import java.util.Arrays;

//2:06 pm 1/1/2025 !!!
//fml 3:05
//passes test case 4:33 1/3/25
//break at 5
//back at 5:42
public class bucketList {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("blist.in"));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("blist.out");
        // PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());

        int[] starts = new int[N], ends = new int[N], amts = new int[N];

        for(int i = 0; i < N; i++){
            String[] temp = br.readLine().split(" ");
            starts[i] = Integer.parseInt(temp[0]);
            ends[i] = Integer.parseInt(temp[1]);
            amts[i] = Integer.parseInt(temp[2]);
        }

        int[] sortedEnds = Arrays.copyOf(ends, ends.length);
        Arrays.sort(sortedEnds);
        int[] events = new int[sortedEnds[N-1]];

        for(int a = 0; a < N; a ++){
            int start = starts[a];
            int end = ends[a];
            int amt = amts[a];
            for(int b =start-1; b < end; b++){
                events[b] += amt;
            }
        }

        // System.out.println(Arrays.toString(events));

        int max=0;

        for(int i =0; i < sortedEnds[N-1]; i ++){
            if(events[i] > max){
                max = events[i];
            }
        }

        // System.out.println(max);
        pw.println(max);
        pw.close();
        
    }
}
