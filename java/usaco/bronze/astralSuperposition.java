
import java.io.*;
import java.util.*;

// 12:18 pm 1/25/2025

public class astralSuperposition {
    public static void checkSky(BufferedReader br) throws IOException{
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
        Set<String> realGray = new HashSet<>();
        Set<String> translatedGray = new HashSet<>();
        System.out.println(Arrays.deepToString(sky));
        for(int a=0; a < N; a++){
            for(int b =0; b < N; b++){
                if(sky[a][b] == 'G'){
                    String coord = String.valueOf(a) + String.valueOf(b);
                    String reverseTranslatedCoord = String.valueOf(a-down) + String.valueOf(b-right);
                    String translatedCoord = String.valueOf(a+down) + String.valueOf(b+right);
                    System.out.println("curren coord" + coord);
                    if(!translatedGray.contains(coord)){
                        if((a-down) >= 0 && (b - right) >= 0){
                            if(!realGray.contains(reverseTranslatedCoord)){ //check for reverse trnsalsted here
                                starCount++;
                                realGray.add(coord);
                                translatedGray.add(translatedCoord);
                            }
                            // else{
                            //     System.out.println(-1);
                            //     return;
                            // }
                        }
                        realGray.add(coord);
                        starCount++;
                    } 
                } else if(sky[a][b] =='B'){
                    if((a-down) >= 0 && (b - right) >= 0){
                        System.out.println("possibly fake star2");
                        if(sky[a-down][b-right] == 'B' || sky[a-down][b-right] == 'G'){
                            System.out.println("real" + a + " "+b);
                            realGray.add(String.valueOf(a+down) + String.valueOf(b+right));
                        }
                    } else {
                        starCount=-1;
                        System.out.println(starCount);
                        System.out.println("real" + a + " "+b);
                        return;
                    }
                }
            }
        }
        for (String star : realGray) {
            System.out.println("accepted stars" + star);
        }
        for (String star : translatedGray) {
            System.out.println("translated stars" + star);
        }
        System.out.println(starCount);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        //rememebr to tierateo ver this multiple times for the diff skies
        for(int time=0; time < T; time++){
            System.out.println("time" + T);
            checkSky(br);
        }
    }
}
