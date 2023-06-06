import java.util.Scanner;
class dualtriangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows :");
		//int a=sc.nextInt();
		int i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();

		}
		for(i=1;i<=5;i++){
			for(j=4;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}