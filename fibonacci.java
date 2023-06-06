class fibonacci{

static int fibonacci(int x){
int sum=x;
if(sum>=50){
	return 0;
}
else{
sum += fibonacci(x+1);
System.out.println(sum);
return 0;
}
}
public static void main(String args[]){
System.out.println(fibonacci(0));
}

}