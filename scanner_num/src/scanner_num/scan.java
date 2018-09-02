package scanner_num;
import java.util.Scanner;
public class scan {
	public static void main(String[] args) {
		System.out.println("please cout a num from 0-1000");
		int a=456;
		for (int b = 0; b < 10; b++) {
			Scanner sc=new Scanner(System.in);
			int i =sc.nextInt();
			if (i>a) {
				System.out.println("the neum that your think is large");
				
			}
			else if (i<a) {
				System.out.println("the neum that your think is smaller");
			}
			else {
				System.out.println("Äã²Â¶ÔÁË");
			}
			
		}
	}

}
