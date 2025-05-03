import java.io.*;

// 2:37 pm 1/5/2025
//passes first case 3:04
//passed 3:06

public class triangles {
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("triangles.in"));
        PrintWriter pw = new PrintWriter("triangles.out");

        int N = Integer.parseInt(br.readLine());
        int[][] coords = new int[N][2];

        for (int i =0; i < N; i++){
            String[] tempCoords = br.readLine().split(" ");
            coords[i][0] = Integer.parseInt(tempCoords[0]);
            coords[i][1] = Integer.parseInt(tempCoords[1]);
        }

        // System.out.println(Arrays.deepToString(coords));
        int max=0;

        for(int a = 0; a < N; a++){
            int[] firstCoord = {coords[a][0], coords[a][1]};
            for(int b=0; b < N; b++){
                int[] secondCoord = {coords[b][0], coords[b][1]};
                if(firstCoord != secondCoord){
                    for(int c=0; c < N; c++){
                        int[] thirdCoord = {coords[c][0], coords[c][1]};
                        if(thirdCoord != firstCoord && thirdCoord != secondCoord){
                            if((firstCoord[0] == thirdCoord[0] && thirdCoord[1] == secondCoord[1])){
                                int width = Math.abs(secondCoord[0] - thirdCoord[0]);
                                int height = Math.abs(firstCoord[1]-thirdCoord[1]);
                                if((width * height) > max){
                                    max = width * height;
                                }
                            } else if ((firstCoord[1] == thirdCoord[1] && firstCoord[0] == secondCoord[0])) {
                                int width = Math.abs(firstCoord[0] - thirdCoord[0]);
                                int height = Math.abs(firstCoord[1]-secondCoord[1]);
                                if((width * height) > max){
                                    max = width * height;
                                }
                            } else if (thirdCoord[0] == secondCoord[0] && secondCoord[1] == firstCoord[1]) {
                                int width = Math.abs(secondCoord[0] - firstCoord[0]);
                                int height = Math.abs(secondCoord[1]-thirdCoord[1]);
                                if((width * height) > max){
                                    max = width * height;
                                }
                            }
                        }
                }
                }
            }
        }

        // System.out.println(max);
        pw.println(max);
        pw.close();
    }
}
