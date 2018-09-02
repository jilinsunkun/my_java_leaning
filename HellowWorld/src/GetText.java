import java.io.*;

public class GetText {
	
	public static void main(String args[]) {
		if(args.length<3)
		{
			System.out.println("enoughless args");
			return;
		}
		else {
			for(int i=0;i<3;i++) {
				System.out.println("args["+i+"]="+args[i]);
			}
		}
	}
}
