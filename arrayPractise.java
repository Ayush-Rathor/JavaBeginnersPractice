class arrayPractise{
public static void main(String args[]){

// adding two matrices
/*int [][] a={{1,2,3},{11,12,13}};
int [][] b={{4,5,6},{14,15,16}};
int [][] c={{0,0,0},{0,0,0}};
for(int i=0;i<a.length;i++){
	for(int j=0;j<a[0].length;j++){
		c[i][j]=a[i][j]+b[i][j];
	}
	System.out.print("");
}
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[0].length;j++){
		System.out.print(c[i][j]);
		System.out.print("    ");
	}
	System.out.println();
}*/

// reversing an array
/*int [] a={1,2,3,4,5};
int temp=0;
int l=a.length;
int n=Math.floorDiv(l,2);
for(int i=0;i<n;i++){
	temp=a[i];
	a[i]=a[l-i-1];
	a[l-i-1]=temp;

}
for(int i=0;i<a.length;i++){
	System.out.print(a[i]);
}*/

//finding the maximum element in the array
/*int [] a={1,2,3,4,5};
int max=0;
for(int i=0;i<a.length;i++){
	if(a[i]>max){
		max=a[i];
	}
	System.out.print("");
}
System.out.println(max);*/

//find wether an array is sorted or not
int [] a={1,2,1 ,4,5};
boolean sorted=true;
for(int i=0;i<a.length-1;i++){
	if(a[i]>a[i+1]){
		sorted=false;
		break;
	}
}
	if(sorted){
		System.out.println("Array is sorted");
	}
	else{
		System.out.println("Array is not sorted");
	}
}
}