
import java.io.*;
import java.util.*;

// 12:18 pm 1/25/2025

public class astralSuperposition {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] NAB = br.readLine().split(" ");
        int N = Integer.parseInt(NAB[0]);
        int right = Integer.parseInt(NAB[1]);
        int down = Integer.parseInt(NAB[2]);
        char[][] sky = new char[N][N];
        for(int a=0;a<N;a++){
            String[] row = br.readLine().split("");
            for(int b=0; b < N;b++){
                sky[a][b] = row[b].charAt(0);
            }
        }
        int starCount = 0;
        Set<String> possiblyFake = new HashSet<>();
        System.out.println(Arrays.deepToString(sky));
        //rememebr to tierateo ver this multiple times for the diff skies
        for(int time=0; time < T; time++){
            
        }
        for(int a=0; a < N; a++){
            for(int b =0; b < N; b++){
                if(sky[a][b] == 'G'){
                    String coord = String.valueOf(b) + String.valueOf(a);
                    if(!possiblyFake.contains(coord)){
                        starCount++;
                    } else {
                        if((a-down) >= 0 && (b - right) >= 0){
                            if(sky[a-down][b-right] == 'B' || sky[a-down][b-right] == 'G'){
                                starCount++;
                                possiblyFake.add(coord);
                            }
                        } else {
                            System.out.println(-1);
                        }
                    }
                } else if(sky[a][b] =='B'){
                    if((a-down) >= 0 && (b - right) >= 0){
                        if(sky[a-down][b-right] == 'B' || sky[a-down][b-right] == 'G'){
                            starCount++;
                        }
                    } else {
                        System.out.println(-1);
                    }
                }
            }
        }
        System.out.println(starCount);
    }
}
