import java.io.*;
import java.util.*;

public class teamTicTacToe {
    private static void checkLine(char a, char b, char c, Set<Character> soloWins, Set<String> teamWins){
        if(a == b && b == c){
            soloWins.add(a);
            return;
        }
        Set<Character> characters = new HashSet<>();
        characters.add(a);
        characters.add(b);
        characters.add(c);
            char[] team = new char[(characters.size())];
            int i=0;
            for(char character : characters){
                team[i++] = character;
            }

            if(team.length ==2){
                teamWins.add(team[0]+""+team[1]);
            }
            
    }
    public static void main(String[] args) throws  IOException{
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("tttt.in"));
        PrintWriter pw = new PrintWriter("tttt.out");
        char[][] board = new char[3][3];
      
        for (int i = 0; i < 3; i++) {
            String line = br.readLine();
            for (int j = 0; j < 3; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        Set<Character> soloWins = new HashSet<>();
        Set<String> teamWins = new HashSet<>();
        
        for(int i=0;i<3;i++){
            checkLine(board[0][i], board[1][i], board[2][i], soloWins, teamWins);
            checkLine(board[i][0], board[i][1], board[i][2], soloWins, teamWins);
        }
        checkLine(board[0][0], board[1][1], board[2][2], soloWins, teamWins);
        checkLine(board[2][0], board[1][1], board[0][2], soloWins, teamWins);
        
        pw.println(soloWins.size());
        pw.println(teamWins.size());
        pw.close();
    }
}
