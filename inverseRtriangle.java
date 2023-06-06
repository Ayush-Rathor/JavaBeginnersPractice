import java.util.Scanner;
class inverseRtriangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows :");
		int a=sc.nextInt();
		int i,j;
		for(i=1;i<=a;i++){
			for(j=a;j>=(a-i);j--){
				System.out.print(" ");
			}
			for(j=a;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}