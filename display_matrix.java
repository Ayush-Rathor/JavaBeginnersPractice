import java.util.Scanner;

class display_matrix{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter numbers for 2 x 3 Matrix");
int a[][]=new int[2][3];
for(int i=0;i<2;i++){
	for(int j=0;j<a[i].length;j++){
	System.out.println("Enter number for "+(i+1)+"th row "+(j+1)+"th column");
	a[i][j]=sc.nextInt();
}
System.out.println();
}
for(int i=0;i<2;i++){
	for(int j=0;j<a[i].length;j++){
	System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}