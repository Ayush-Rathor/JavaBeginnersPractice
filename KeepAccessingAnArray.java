import java.util.Scanner;

class maxTryException extends Exception{
public String toString(){
return "maxTryException: "+getMessage();
}
public String getMessage(){
	return "All 5 Attempts attempted";
	}
}

class KeepAccessingAnArray{
	static String arr[]={"AA","BB","CC"};
	static void accessArray() throws maxTryException{
		int i=0;
		while(i<5){
			try{
				System.out.println("Enter index no.");
			Scanner sc=new Scanner(System.in);
	int index=sc.nextInt();
	String a=arr[index];
	System.out.println(a);
	break;
}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("Invalid Index");
	i++;
	}
	if(i>=5){
		throw new maxTryException();
		}
	}
}
	public static void main(String args[]){

			try{
				accessArray();
				}
				catch(maxTryException e){
					e.printStackTrace();
					}
			}
		}
