class test{
void meth(int i, int j){
i =i*1;
j =j/2;
System.out.println("a and b after call: "+i+" "+j);
}
}
class CallByValue{
public static void main(String args[]){
test ob = new test();
int a = 15,b= 20;
System.out.println("a and b before call: "+a+" "+b);
ob.meth(a,b);
}
}