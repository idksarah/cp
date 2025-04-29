import java.io.*;

public class roundaboutRounding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numTests = Integer.parseInt(br.readLine());
        
        long min =45;
        long max = 49;
        for (int i = 0; i < numTests; i++) {
            min =45;
            max = 49;
            long count = 0;
            long current = Long.parseLong(br.readLine());
            int power = String.valueOf(current).length();
            for (int a = 0; a < power; a++) {
                if (current >= min) {
                    if (current >= max) {
                        count += max - min + 1;
                    } else {
                        count += current - min + 1;
                    }
                }
                min = Long.parseLong("4" + String.valueOf(min));
                max = Long.parseLong(String.valueOf(max) +"9");
            }
            System.out.println(count);
            
        }
    }
}
