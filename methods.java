class methods{

// method to print an array
/*static int arr(int a[][]){
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[0].length;j++){
			System.out.print(a[i][j]);
			System.out.print("  ");
		}
		System.out.println();
	}
return 0;
}


public static void main(String args[]){
	// int [][] z={{1,2,3},{11,22,33}};
    // arr(z);
}*/

// method to transform array
static int a(int a[]){
	a[0]=55;
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]);
	}
	return 0;
}
public static void main(String args[]){
	 int [] z={1,2,3};
     a(z);
}
}