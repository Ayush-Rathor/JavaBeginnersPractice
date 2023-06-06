import java.util.Scanner;

class compound_interest{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Interest Compounded Annually");
		System.out.println("Enter Principal Amount:");
		double P=sc.nextDouble();
		System.out.println("Enter Rate of Interest:");
		double R=sc.nextDouble();
		System.out.println("Enter Time in Years:");
		double T=sc.nextDouble();
		double CI=P*Math.pow((1+(R/100)),T);
		System.out.println(CI);
	}
}