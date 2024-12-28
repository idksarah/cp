import java.io.*;

//12:59 pm 12/28/24
//1:20 pm passed example case
//1:47 reworked and passed all tests

public class milkPails{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("pails.in"));
        PrintWriter pw = new PrintWriter("pails.out");
        
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputs = (br.readLine()).split(" ");
        int X = Integer.parseInt(inputs[0]);
        int Y = Integer.parseInt(inputs[1]);
        int M = Integer.parseInt(inputs[2]);

        int maxNumOfX = (int)Math.floor(M / X);
        int maxNumOfY= (int)Math.floor(M / Y);

        int[] possibleX = new int[maxNumOfX+1];
        int[] possibleY = new int[maxNumOfY+1];

        for(int i=0; i<maxNumOfX+1; i++){
            possibleX[i] = i;
        }
        for(int i=0; i<maxNumOfY+1; i++){
            possibleY[i] = i;
        }
        int max =0;
        for(int i=0; i< possibleX.length; i++){ //for each possible X
            for(int a =0; a<possibleY.length; a++){ //check with each possible Y
                if(X * i + Y * a <= M && X * i + Y * a > max){
                    max = X * i + Y * a;
                }
            }
        }
        // System.out.println(max);
       pw.println(max);
       pw.close();
    }
}