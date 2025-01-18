
import java.io.*;
import java.util.*;

// 1:17 am 1/17/25!!
// sleepe 1:49
// 1:17 pm 1/18/25
// first passed 2:42;; passed 7 cases :(
// passes all 2:48 :3

public class mowingTheField {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("mowing.in"));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("mowing.out");

        int N = Integer.parseInt(br.readLine());
        int x=0, y=0, time=1, max=Integer.MAX_VALUE, statement=0;
        Map<String, Integer> visited = new HashMap<>();
        visited.put(0 +" "+0, 0);
        String[] directions = new String[2*N];
        for(int i =0; i < N*2;i+=2){
            String temp[] = br.readLine().split(" ");
            directions[i] = temp[0];
            directions[i+1] = temp[1];
        }
        while(statement < N*2){
            String direction = directions[statement];
            int steps=Integer.parseInt(directions[statement+1]);
            if(direction.equals("N")){
                for(int i=0; i < steps;i++){
                    y+=1;
                    if(visited.containsKey(x+" "+y)){
                        max = Math.min(max, time-visited.get(x+" "+y));
                    }
                    visited.put((x+" "+y), time);
                    time++;
                }
            } else if(direction.equals("E")){
                for(int i=0; i < steps;i++){
                    x+=1;
                    if(visited.containsKey(x+" "+y)){
                        max = Math.min(max, time-visited.get(x+" "+y));
                    }
                    visited.put((x+" "+y), time);
                    time++;
                }
            }else if(direction.equals("S")){
                for(int i=0; i < steps;i++){
                    y-=1;
                    if(visited.containsKey(x+" "+y)){
                        max = Math.min(max, time-visited.get(x+" "+y));
                    }
                    visited.put((x+" "+y), time);
                    time++;
                }
            } else {
                for(int i=0; i < steps;i++){
                    x-=1;
                    if(visited.containsKey(x+" "+y)){
                        max = Math.min(max, time-visited.get(x+" "+y));
                    }
                    visited.put((x+" "+y), time);
                    time++;
                }
            }
            statement+=2;
        }
        if(max == Integer.MAX_VALUE){
            System.out.println(-1);
            pw.println(-1);
        }else{
            pw.println(max);
        }
        pw.close();
    }
}
