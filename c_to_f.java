import java.util.Scanner;

class c_to_f{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Temperature in Degree");
		 int D=sc.nextInt();
		 System.out.println("Enter C or F Scale");
		 String str=sc.next();
		if(str.equals("f")||str.equals("F")){
			int C=(D-32)*5/9;
			System.out.println(C+"C");
		}
		else{
			int F=((D*9)/5)+32;
			System.out.println(F+"F");
		}
		}
	}