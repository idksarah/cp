//2:00 am 12/28/24

import java.io.*;

public class maximumDistance{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        double currentDistance, maxDistance;
        maxDistance=0;
        
        int[] xCoords= new int[N];
        int[] yCoords = new int[N];

        String[] temp1 = br.readLine().split(" ");
        String[] temp2 = br.readLine().split(" ");

        for(int i =0;i<temp1.length;i++){
            xCoords[i] = Integer.parseInt(temp1[i]);
            yCoords[i] = Integer.parseInt(temp2[i]);
        }

        for(int i=0;i<N;i++){ //for each point
            for(int a =0; a<N; a++){ //iterate through every point in array
                currentDistance=(Math.pow(xCoords[i]-xCoords[a], 2) + Math.pow(yCoords[i]-yCoords[a],2));
                if(currentDistance > maxDistance){
                    maxDistance = currentDistance;
                }
            }
        }
        System.out.println((int)Math.round(maxDistance));
    }
}