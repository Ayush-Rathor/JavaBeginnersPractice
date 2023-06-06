class array{
public static void main(String args[]){

/*int [][] flats= new int[2][3];
flats [0][0]=101;
flats [0][1]=102;
flats [0][2]=103;
flats [1][0]=201;
flats [1][1]=202;
flats [1][2]=203;
System.out.println(flats.length);
System.out.println(flats[0].length);
System.out.println(flats[1].length);
for(int i=0;i<flats.length;i++){
	for(int j=0;j<flats[i].length;j++){
		System.out.print(flats[i][j]);
		System.out.print("  ");
	}
	System.out.println();
}*/

int[][][] flats= new int[2][3][5];
flats [0][0][0]=01;
flats [0][0][1]=02;
flats [0][0][2]=03;
flats [0][0][3]=04;
flats [0][0][4]=05;
flats [0][1][0]=11;
flats [0][1][1]=12;
flats [0][1][2]=13;
flats [0][1][3]=14;
flats [0][1][4]=15;
flats [0][2][0]=21;
flats [0][2][1]=22;
flats [0][2][2]=23;
flats [0][2][3]=24;
flats [0][2][4]=25;
flats [1][0][0]=101;
flats [1][0][1]=102;
flats [1][0][2]=103;
flats [1][0][3]=104;
flats [1][0][4]=105;
flats [1][1][0]=111;
flats [1][1][1]=112;
flats [1][1][2]=113;
flats [1][1][3]=114;
flats [1][1][4]=115;
flats [1][2][0]=121;
flats [1][2][1]=122;
flats [1][2][2]=123;
flats [1][2][3]=124;
flats [1][2][4]=125;

System.out.println(flats.length);
System.out.println(flats[0].length);
System.out.println(flats[0][0].length);


for(int i=0;i<flats.length;i++){
	for(int j=0;j<flats[i].length;j++){
		for(int k=0;k<flats[i][j].length;k++){
			System.out.print(flats[i][j][k]);
			System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println();
}
}
}