package scanner_num;
import java.util.Scanner;

public class Nian{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("������ָ�����:");

int n = sc.nextInt();

System.out.println("������ָ���·�:");

int y = sc.nextInt();

if(n/4==0){

if(y==2){

System.out.println("29");

}

if(y==1&&y==3&&y==5&&y==7&&y==8&&y==10&&y==12){

System.out.println("31");

}

else{

System.out.println(30);

}

}

else if(y==2){

System.out.println("28");

}

else{

System.out.println("30");

}

}

}