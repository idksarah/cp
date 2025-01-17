
import java.io.*;
import java.util.*;

// 1:17 am 1/17/25!!
// sleepe 1:49

public class mowingTheField {
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(FileReader("mowing.in"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // PrintWriter pw = new PrintWriter("mowing.out");

        ArrayList points = new ArrayList();
        int N = Integer.parseInt(br.readLine());
        int x=0, y=0;
        for(int i =0; i < N;i ++){
            String[] line = br.readLine().split(" ");
            char direction = line[0].charAt(0);
            int steps = Integer.parseInt(line[1]);
            if(direction=='N'){
                points.add(new int[]{x,steps});
                y+=steps;
            } else if(direction=='E'){
                points.add(new int[]{steps,y});
                x+=steps;
            }else if(direction=='S'){
                points.add(new int[]{x,-steps});
                y+=steps;
            } else {
                points.add(new int[]{-steps,y});
                x-=steps;
            }
        }
        // for(Object point:points){
        //     System.out.println(Arrays.toString((int[])point));
        // }
    }
}
