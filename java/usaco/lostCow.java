import java.io.*;

//3:28 pm 1/5/2025
//YOOOOO passes first 3:54

public class lostCow {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("lostcow.in"));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("lostcow.out");

        String temp[] = br.readLine().split(" ");
        int start = Integer.parseInt(temp[0]);
        int bessie = Integer.parseInt(temp[1]);
        int current = start;

        boolean right = true;
        boolean johnnyLeft;
        int nextMove = 1, distance=0;

        if(start < bessie){
            johnnyLeft=true;
        } else {
            johnnyLeft = false;
        }
        while(current != bessie){
            if(johnnyLeft){ //if john is left of bessie    
                if(right){
                    if((current + nextMove) > bessie){
                        distance += bessie-start;
                        current = bessie;
                    } else {
                        distance += 2 * (nextMove);
                    }
                } else {
                    distance += 2 * (nextMove);
                }
            } else {
                if(!right){
                    if((current + nextMove) < bessie){
                        distance += bessie-start;
                        current = bessie;
                    } else {
                        distance += 2 * (nextMove);
                    }
                } else {
                    distance += 2 * (nextMove);
                }
            }
            nextMove*=2;
        }
        pw.println(distance);
        pw.close();
    }
}
