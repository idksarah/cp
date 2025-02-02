import java.io.*;

//3:28 pm 1/5/2025
//YOOOOO passes first 3:54
// 4 : 17 :33333

public class lostCow {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("lostcow.in"));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter("lostcow.out");

        String temp[] = br.readLine().split(" ");
        int current = Integer.parseInt(temp[0]);
        int bessie = Integer.parseInt(temp[1]);

        boolean right = true;
        int nextMove = 1, distance=0;

        while(current != bessie){
            // System.out.println("right" + right);
            if(current < bessie){ //if john is left of bessie    
                if(right){
                    if((current + nextMove) >= bessie){
                        distance += Math.abs(bessie-current);
                        current = bessie;
                    } else {
                        distance += 2 * (nextMove);
                    }
                    right = false;
                } else {
                    distance += 2 * (nextMove);
                    right = true;
                }
            } else {
                if(!right){
                    if((current - nextMove) <= bessie){
                        distance += Math.abs(bessie-current);
                        current = bessie;
                    } else {
                        distance += 2 * (nextMove);
                    }
                    right = true;
                } else {
                    distance += 2 * (nextMove);
                    right = false;
                }
            }
            nextMove*=2;
            // System.out.println("distance" + distance);
            // System.out.println("next" + nextMove);
        }
        // System.out.println(distance);
        pw.println(distance);
        pw.close();
    }
}
