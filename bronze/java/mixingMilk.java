import java.io.*;
import java.util.*;

public class mixingMilk {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

        int B1cap = sc.nextInt();
        int B1current = sc.nextInt();
        int B2cap = sc.nextInt();
        int B2current = sc.nextInt();
        int B3cap = sc.nextInt();
        int B3current = sc.nextInt();

        for(int i =0; i<33; i++){
            if(B1current + B2current <= B2cap){
                B2current = B1current + B2current;
                B1current=0;
            } else {
                B1current = B1current + B2current - B2cap;
                B2current = B2cap;
            }
            if(B2current + B3current <= B3cap){
                B3current = B2current + B3current;
                B2current =0;
            } else {
                B2current = (B2current + B3current) - B3cap;
                B3current = B3cap;
            }
            if(B3current + B1current <= B1cap){
                B1current = B3current + B1current;
                B3current=0;
            } else {
                B3current = (B3current + B1current) - B1cap;
                B1current = B1cap;
            }
        }
        if(B1current + B2current <= B2cap){
            B2current = B1current + B2current;
            B1current=0;
        } else {
            B1current = B1current + B2current - B2cap;
            B2current = B2cap;
        }

        System.out.println(B1current);
        System.out.println(B2current);
        System.out.println(B3current);
    }
}