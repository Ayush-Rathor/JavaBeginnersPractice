import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidInputException extends Exception{
public String toString(){
return "InvalidInputException: "+getMessage();
}
public String getMessage(){
return "The user input is Invalid";
}
}

class CannotDivideBy0Exception extends Exception{
public String toString(){
return "CannotDivideBy0Exception: "+getMessage();
}
public String getMessage(){
return "A number is not divisible by zero(0)";
}
}

class MaxInputExceededException extends Exception{
public String toString(){
return "MaxInputExceededException: "+getMessage();
}
public String getMessage(){
return "You have exceeded the Maximum input Allowed";
}
}

class MaxMultiplierReachedException extends Exception{
public String toString(){
return "MaxMultiplierReachedException: "+getMessage();
}
public String getMessage(){
return "You have excedeed the Maximum multiplier";
}
}

class CustomCalculator{
	static void performOperations() throws InvalidInputException,CannotDivideBy0Exception,MaxInputExceededException,MaxMultiplierReachedException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Values and operand :");
		int a;
		char c;
		int b;
		try{
			a=sc.nextInt();
		c=sc.next().charAt(0);
		b=sc.nextInt();
	}
	catch(InputMismatchException e){
		throw new InvalidInputException();
		}
		if(a<=7000 && b<=7000){

			}
			else{
				throw new MaxInputExceededException();
				}
			if(c=='+'||c=='-'||c=='*'||c=='/'){
				if(c=='+'){
					if(-2147483648<a && a<2147483647 && -2147483648<a && a<2147483647){
					System.out.println(a+b);
				}
				else{
					throw new InvalidInputException();
					}
					}
					else if(c=='-'){
						if(-2147483648<a && a<2147483647 && -2147483648<a && a<2147483647){
											System.out.println(a-b);
						}
					else{
					throw new InvalidInputException();
					}
				}
						else if(c=='*'){
							if(a*b<100000){
											System.out.println(a*b);
										}
						else{
						throw new MaxMultiplierReachedException();
					}
				}
				else if(c=='/'){
						if(b!=0){
								System.out.println(a/b);
							}
						else{
						throw new CannotDivideBy0Exception();
						}
					}
				}
				else{
					throw new InvalidInputException();
				}
			}


		public static void main(String args[]){
			try{
				performOperations();
			}
			catch(InvalidInputException e){
				e.printStackTrace();
				}
				catch(CannotDivideBy0Exception e){
					e.printStackTrace();
					}
					catch(MaxInputExceededException e){
					e.printStackTrace();
					}
					catch(MaxMultiplierReachedException e){
					e.printStackTrace();
					}
			}
	}