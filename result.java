import java.util.Scanner;

class result{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter marks of student for each subject");
System.out.println("Enter marks for Science out of 100");
float S=sc.nextFloat();
System.out.println("Enter marks for Maths out of 100");
float M=sc.nextFloat();
System.out.println("Enter marks for History out of 100");
float H=sc.nextFloat();
System.out.println("Enter marks for Geography out of 100");
float G=sc.nextFloat();
System.out.println("Enter marks for English out of 100");
float E=sc.nextFloat();
float result=S+M+H+G+E;
float percentage_scored=(result/500)*100f;
System.out.println("Result = "+result+"/500");
System.out.println("Percentage Scored = "+(Math.round(percentage_scored*10))/10f+"%");
}
}