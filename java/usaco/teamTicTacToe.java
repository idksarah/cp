import java.io.*;
import java.util.*;
// 12:11 am 1/15/2025
// passes sample 12:29
// fails tests 2-4 and 10. im sleepe. good night
//5:07 1/15/25
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
        char[][] usedDuo = new char[3][3];
        char[] usedSolo = new char[3];
        int soloCounter =0, duoCounter=0;
        boolean unique = true;
        char[] duo = new char[2];
        for(int i=0;i<3;i++){
            boolean solo=true;
            unique = true;
            // if(letters[i][0]==letters[i][1] && letters[i][1] == letters[i][2]){ //rows
            //     solo = true;
            //     System.out.println("row");
            if(letters[i][0] == letters[i][1] && letters[i][0] != letters[i][2]){
                solo = false;
                duo[0] = letters[i][0];
                duo[1] = letters[i][2];
            }
            else if (letters[i][0] == letters[i][2] && letters[i][0] != letters[i][1]){
                duo[0] = letters[i][0];
                duo[1] = letters[i][1];
                solo = false;
            } else if (letters[i][1] == letters[i][2] && letters[i][0] != letters[i][2]) {
                duo[0] = letters[i][0];
                duo[1] = letters[i][1];
                solo = false;
            }
            if(solo && (letters[i][0]==letters[i][1] && letters[i][1] == letters[i][2])){
                System.out.println("passed");
                for(int a =0; a < usedSolo.length; a ++){
                    if(letters[i][0] == usedSolo[a]){
                        unique = false;
                        System.out.println("row false");
                    }
                }
            } else {
                for(int a =0; a < usedDuo.length; a++){
                    if((duo[0]==usedDuo[a][0] && duo[1]==usedDuo[a][1]) || (duo[0]==usedDuo[a][1] && duo[1]==usedDuo[a][0])){
                        unique = false;
                        System.out.println("column false");
                    }
                }
            }
            if(unique){
                if(solo){
                    soloVictory++;
                    usedSolo[soloCounter] = letters[i][0];
                    soloCounter++;
                } else {
                    duoVictory++;
                    System.out.println("duo" + duo[0]);
                    System.out.println("duo" + duo[1]);
                    usedDuo[duoCounter][0] = duo[0];
                    usedDuo[duoCounter][1] = duo[1];
                }
            }
            System.out.println(Arrays.toString(usedSolo));
            System.out.println(Arrays.deepToString(usedDuo));
            /*unique = true;
            if(letters[i][0]==letters[i][1] && letters[i][1] == letters[i][2]){ //columns
                System.out.println("columns");
                solo = true;
            } else if(letters[0][i] == letters[1][i] && letters[0][i] != letters[2][i]){
                solo = false;
                duo[0] = letters[0][i];
                duo[1] = letters[2][i];
            }
            else if (letters[0][i] == letters[2][i] && letters[0][i] != letters[1][i]){
                duo[0] = letters[0][i];
                duo[1] = letters[1][i];
                solo = false;
            } else if (letters[1][i] == letters[2][i] && letters[0][i] != letters[2][i]) {
                duo[0] = letters[0][i];
                duo[1] = letters[1][i];
                solo = false;
            }
            if(solo){
                for(int a =0; a < usedSolo.length; a ++){
                    if(letters[i][0] == usedSolo[a]){
                        unique = false;
                    }
                }
            } else {
                for(int a =0; a < usedDuo.length; a++){
                    if((duo[0]==usedDuo[a][0] && duo[1]==usedDuo[a][1]) || (duo[0]==usedDuo[a][1] && duo[1]==usedDuo[a][0])){
                        unique = false;
                    }
                }
            }
            if(unique){
                if(solo){
                    soloVictory++;
                    usedSolo[soloCounter] = letters[i][0];
                    soloCounter++;
                } else {
                    duoVictory++;
                    usedDuo[duoCounter][0] = duo[0];
                    usedDuo[duoCounter][1] = duo[1];
                }
            }*/
        }
        if((letters[0][0]==letters[1][1] && letters[1][1] == letters[2][2])){ //diagnoal left ro right
            System.out.println("diagnoals");
            soloVictory++;
        } else if((letters[0][0] == letters[1][1] && letters[0][0] != letters[2][2])
        || (letters[0][0] == letters[2][2] && letters[0][0] != letters[1][1])
        || (letters[1][1] == letters[2][2] && letters[0][0] != letters[2][2])) {
            duoVictory++;
        }
        if((letters[2][0]==letters[1][1] && letters[1][1] == letters[0][2])){ //diagnoal right to left
            System.out.println("diagnoals");
            soloVictory++;
        } else if((letters[2][0] == letters[1][1] && letters[0][0] != letters[0][2])
        || (letters[2][0] == letters[0][2] && letters[2][0] != letters[1][1])
        || (letters[1][1] == letters[2][0] && letters[2][0] != letters[0][2])) {
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
