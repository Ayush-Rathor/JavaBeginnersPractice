import java.util.Scanner;

class stringOperations{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String s=sc.nextLine();
int a=0;
for(int i=0;i<s.length();i++){
	if(s.charAt(i)==' '){
		continue;
	}
	else {
		a++;
	}
}
System.out.println("No. of Characters is: "+a);
int v=0;
for(int i=0;i<s.length();i++){
	if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
		v++;
	}
	else{
		continue;
	}
}
System.out.println("No. of vowels is: "+v);

int c=0;
for(int i=0;i<s.length();i++){
	if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
		continue;
	}
	else if(s.charAt(i)==' '){
		continue;
	}
	else {
		c++;
	}
}
System.out.println("No. of consonants is: "+c);
}
}