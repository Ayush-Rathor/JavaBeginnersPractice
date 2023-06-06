class varargs{
static int arr(int ...arr){
int sum=0;
for(int i=0;i<arr.length;i++){
sum +=arr[i];
}
System.out.println(sum);
return sum;
}
public static void main(String args[]){
	int [] a= {1,2,3,4,5};
	arr(a);

}
}