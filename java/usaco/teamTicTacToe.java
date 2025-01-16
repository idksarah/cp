import java.io.*;
// 12:11 am 1/5/2025
// passes sample 12:29
// fails tests 2-4 and 10. im sleepe. good night
public class teamTicTacToe {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader br = new BufferedReader(new FileReader("tttt.in"));
        // PrintWriter pw = new PrintWriter("tttt.out");
        char[][] letters = new char[3][3];
      
        for (int i = 0; i < 3; i++) {
            String line = br.readLine();
            for (int j = 0; j < 3; j++) {
                letters[i][j] = line.charAt(j);
            }
        }
        int soloVictory=0, duoVictory=0;
        for(int i=0;i<3;i++){
            if(letters[i][0]==letters[i][1] && letters[i][1] == letters[i][2]){
                soloVictory++;
            } else if((letters[i][0] == letters[i][1] && letters[i][0] != letters[i][2])
            || (letters[i][0] == letters[i][2] && letters[i][0] != letters[i][1])
            || (letters[i][1] == letters[i][2] && letters[i][0] != letters[i][2])) {
                duoVictory++;
            }
            if(letters[0][i]==letters[0][i] && letters[1][i] == letters[2][i]){
                soloVictory++;
            } else if((letters[0][i] == letters[1][i] && letters[0][i] != letters[2][i])
            || (letters[0][i] == letters[2][i] && letters[0][i] != letters[1][i])
            || (letters[1][i] == letters[2][i] && letters[0][i] != letters[2][i])) {
                duoVictory++;
            }
        }
        if(letters[0][0]==letters[1][1] && letters[1][1] == letters[2][2]){
            soloVictory++;
        } else if((letters[0][0] == letters[1][1] && letters[0][0] != letters[2][2])
        || (letters[0][0] == letters[2][2] && letters[0][0] != letters[1][1])
        || (letters[1][1] == letters[2][2] && letters[0][0] != letters[2][2])) {
            duoVictory++;
        }
        // // System.out.println(Arrays.deepToString(letters));
        System.out.println(soloVictory);
        System.out.println(duoVictory);
        
        // pw.println(soloVictory);
        // pw.println(duoVictory);
        // pw.close();
    }
}
