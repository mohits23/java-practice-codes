import  mathe.Armstrong;
import  java.io.BufferedReader;
import  java.io.InputStreamReader;
import  java.io.IOException;

public class CheckArmstrong
{
public static void main(String [] args) throws IOException
{
BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );

System.out.println("\nEnter a number to check if it is Armstrong or Not : ");
int num = Integer.parseInt(reader.readLine());

Armstrong Obj = new Armstrong(num);

if( Obj.arm() == 1 )
System.out.println("\n\t!! Armstrong !!");
else
System.out.println("\n\t!! Not Armstrong !!");
}
}