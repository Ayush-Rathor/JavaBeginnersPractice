import java.util.Random;
import java.util.Scanner;

class Game{
	int noOfGuess=1;
public void Game(int x,int y,int z){
	if(x==y){
		System.out.println("Congratulations you won the game in"+noOfGuess+"guess");
		}
	else if(x>y){
				System.out.println("Computer number is greater than"+y);
		}
		if(x<y){
				System.out.println("Computer number is less than"+y);
		}
		noOfGuess++;
}
}

class guessTheNumber{
public static void main(String args[]){
	Random r= new Random();
	Scanner sc=new Scanner(System.in);
	int cu=r.nextInt(100);
	//Game su[]=new Game[5];
	//int cu=(int)(Math.random()*(100-1+1)+1);
	Game GTN=new Game();
	//int noOfGuess=1;
	for(int i=1;i<=100;i++){
		int a=101-i;
		System.out.println("You have "+a+" attempts left");
			int u=sc.nextInt();
			GTN.Game(cu,u,a);
			/*if(cu==u){
					System.out.println("Congratulations you won the game in"+noOfGuess+"guess");
					}
				else if(cu>u){
							System.out.println("Computer number is greater than"+u);
					}
					if(cu<u){
							System.out.println("Computer number is less than"+u);
		}
		noOfGuess++;*/
	}
}
}