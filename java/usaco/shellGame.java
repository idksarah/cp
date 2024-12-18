import java.io.*;

public class shellGame{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("shell.in"));
        PrintWriter pw = new PrintWriter("shell.out");

        int swaps = Integer.parseInt(br.readLine());
        int counter = 0;
        int ugh[] = new int[3 * swaps];
        for(int i=0; i<ugh.length;i=i+3){
            String line = br.readLine();
            String[] grah=line.split(" ");
            ugh[0]=Integer.parseInt(grah[0]);
            ugh[1]=Integer.parseInt(grah[1]);
            ugh[2]=Integer.parseInt(grah[2]);
            if(ugh[0]==ugh[2]){
                counter++;
            }else if(ugh[1]==ugh[2]){
                counter++;
            }
        }
        pw.println(counter);
        pw.close();
    }
}