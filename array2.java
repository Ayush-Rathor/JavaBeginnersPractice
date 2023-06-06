import java.util.Scanner;

class array2{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int [][] flats =new int[2][3];

	System.out.println("Fill array");
	flats[0][0]=sc.nextInt();
	flats[0][1]=sc.nextInt();
	flats[0][2]=sc.nextInt();
	flats[1][0]=sc.nextInt();
	flats[1][1]=sc.nextInt();
	flats[1][2]=sc.nextInt();
//int sum = 0;
	for(int i=0;i<flats.length;i++){
		for(int j=0;j<flats[i].length;j++){
			if(flats[i][j]==103){
				System.out.println("Yes 103 is present");
			}
			else{
				continue;
			}
		}
		System.out.println();
	}
}
}