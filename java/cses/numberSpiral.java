import java.util.Scanner;

public class numberSpiral{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();

		long y;
		long x;
		long ans;

		for(int i =0; i<t; i++){
			y = s.nextLong();
			x = s.nextLong();

			if(y>x){
				ans = (y-1) * (y-1);
				if(y%2 ==0){
					ans += 2 * y-x;
				} else {
					ans += x;
				}
			} else {
				ans = (x-1) * (x-1);
				if(x%2 ==0){
					ans+=y;
				} else {
					ans+= 2*x-y;
				}
			}

			System.out.println(ans);
			s.close();
		}
	}
}