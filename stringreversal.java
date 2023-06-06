import java.util.Scanner;

class stringreversal{
public static void main(String args[]){
System.out.println("Enter String");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String so="";
for(int i=s.length()-1;i>=0;i--){
so+=s.charAt(i);
}
	System.out.println("Reversal is :"+" "+so);
	}
	}