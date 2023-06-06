import java.util.Scanner;

class palindrome{
public static void main(String args[]){
System.out.println("Enter String");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String so="";
for(int i=s.length()-1;i>=0;i--){
so+=s.charAt(i);
}
if(so.equals(s)){
	System.out.println("Yes! Entered String is a Palindrome");
}
else{
	System.out.println("No! Entered String is not a Palindrome");
}
}
}