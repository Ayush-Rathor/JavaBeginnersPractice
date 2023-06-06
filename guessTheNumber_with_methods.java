import java.util.Scanner;
import java.util.Random;

class game{
int number;
int userInput;
int noOfGuesses=0;
game(){
	Random r=new Random();
this.number=r.nextInt(100);
}
void takeUserInput(){
	System.out.println("Enter number");
	Scanner sc=new Scanner(System.in);
	userInput=sc.nextInt();
	noOfGuesses++;
}
boolean isCorrectNumber(){
	if(number==userInput){
		System.out.println("You won the Game in " + noOfGuesses +" attempts");
		return true;
	}
	else if(number>userInput){
		System.out.println("Too Low...");
	}
	else if(number<userInput){
		System.out.println("Too High...");
	}
	return false;
}
}
class guessTheNumber_with_methods{
public static void main(String args[]){
game g=new game();
boolean b = false;
while(b==false){
	g.takeUserInput();
b=g.isCorrectNumber();
System.out.println(b);
}
}
}
