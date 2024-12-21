import java.io.*;

public class shellGame{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("shell.in"));
        PrintWriter pw = new PrintWriter("shell.out");

        int swaps = Integer.parseInt(br.readLine());
        int counter = 0;
        int nums[] = new int[3 * swaps];
        for(int i=0; i<nums.length;i=i+3){
            String line = br.readLine();
            String[] grah=line.split(" ");
            nums[0]=Integer.parseInt(grah[0]);
            nums[1]=Integer.parseInt(grah[1]);
            nums[2]=Integer.parseInt(grah[2]);
            

        }
        pw.println(counter);
        pw.close();
    }
}