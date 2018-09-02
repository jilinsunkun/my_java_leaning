import java.util.*;
public class softerwarenumbe {

	private int serianumber;
	public static int counter=0;
	public softerwarenumbe(){
		counter ++;
		serianumber =counter;
	}
	public int getserianumber () {
		return serianumber;
	}
	public static int gettotalenumber() {
		return counter;
	}
	public static void main(String args[]) {
		softerwarenumbe s1=new softerwarenumbe();
		System.out.println(softerwarenumbe.counter);

		System.out.println(softerwarenumbe.gettotalenumber());
		softerwarenumbe sn2=new softerwarenumbe();
		System.out.println(sn2.gettotalenumber());
	}
	
} 