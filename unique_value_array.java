import java.util.Scanner;

class unique_value_array{
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter no. of elements: ");
	int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0; i<arr.length; i++){
	arr[i]=sc.nextInt();
	}
	int distinct = 0;
	for(int i=0; i<arr.length; i++){
		for(int j=0; j<=i; j++){
			if(i==j){
				distinct++;
				}
				else if(arr[i]==arr[j]){
					break;
					}
	}
}
	int arr2[]=new int[distinct];
	int index=0;
	for(int i=0; i<arr.length; i++){
		for(int j=0; j<=i; j++){
			if(i==j){
				arr2[index]=arr[i];
				index++;
				}
				else if(arr[i]==arr[j]){
					break;
					}
	}
}
int arr3[]=new int[distinct];
for(int i=0; i<arr2.length; i++){
	int a=0;
for(int j=0; j<arr.length; j++){
		if(arr2[i]==arr[j]){
			a++;
			}
		}
		arr3[i]=a;
		}
		boolean bool=true;
		for(int i=0; i<arr3.length-1; i++){
			for(int j=i+1; j<arr3.length; j++){
				if(arr3[i]==arr3[j]){
					bool=false;
					}
				}
			}
			System.out.println(bool);
}
}