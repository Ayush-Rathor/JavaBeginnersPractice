class rectangle{
int l;
int b;
public int area(){
return l*b;
}
public int perimeter(){
return 2*(l+b);
}
}
class recFormulas{
public static void main(String args[]){
rectangle r1=new rectangle();
r1.l=10;
r1.b=5;
rectangle r2=new rectangle();
r2.l=15;
r2.b=20;
 System.out.println(r1.area());
 System.out.println(r1.perimeter());
 System.out.println(r2.area());
 System.out.println(r2.perimeter());
 }
 }