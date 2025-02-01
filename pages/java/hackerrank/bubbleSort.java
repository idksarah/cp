import java.io.*;

public class bubbleSort {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
       int[] input = new int[]{6,4,1};
        int count=0;

        for(int i=0; i < input.length; i++){
            for (int j =0; j< input.length -1; j++){
                if(input[j] > input[j+1]) {
                    count++;
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        System.out.println("Array is sorted in " + count + " swaps");
        System.out.println("First Element: " + input[0]);
        System.out.println("Second Element: " + input[input.length-1]);

    }
}
