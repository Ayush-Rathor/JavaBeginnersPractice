import java.util.Scanner;

class driving_license{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Age:");
int age=sc.nextInt();
if(age>=18){
	System.out.println("You are Eligible to apply for Driving License");
}
else{
	System.out.println("Sorry! You are not Eligible to apply for Driving License");
}
}
}