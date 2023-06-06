class fibonacci{

static int fibonacci(int x){
int sum=0;
sum += fibonacci(x+1);
return sum;
}

public static void main(String args[]){
System.out.println(fibonacci(0));
}

}