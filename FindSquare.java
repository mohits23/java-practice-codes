import  java.util.Scanner;
import  mathe.Square;

class FindSquare
{
public static void main(String [] args)
{
int n;
Scanner read = new Scanner(System.in);
Square ob = new Square();

System.out.println("\nEnter Any Number:");
n = read.nextInt();
System.out.println("\nSquare of the number is: " + ob.squ(n));
}
}