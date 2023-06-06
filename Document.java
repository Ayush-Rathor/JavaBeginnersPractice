import java.util.Scanner;
class Document{
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. :");
    int a = sc.nextInt();
    System.out.println("Table of  "+a);
    int b;
    for(b=1;b<=10;b++){
		System.out.println(a+"  *  "+b+"  =  "+(a*b));
	}
	}
}