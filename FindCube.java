import  mathe.Cube;
import  java.io.BufferedReader;
import  java.io.InputStreamReader;
import  java.io.IOException;

public class FindCube
{

static int printCube(int x)
{
Cube ob = new Cube();
return ob.cub(x);
}

public static void main(String [] args) throws IOException
{
char choice = 'y';
int n, ch;
BufferedReader in = new BufferedReader( new InputStreamReader(System.in) );

//choice = 'y';
while( choice == 'y' || choice == 'Y' )
{
System.out.println("\nEnter Any Number :");
for(n = null; null != (n = in.readLine()); )
{
n = Integer.parseInt(n);
}
//while( (n = Integer.parseInt(in.readLine())) != null )
//n = Integer.parseInt(n);

System.out.println("\n\nCube of given number is: " + printCube(n));

System.out.println("\n\n   Do you want to do it again: ");
for(ch = null; null != (ch = in.readLine()); )
{
ch = Integer.parseInt(ch);
}
//while( (ch = Integer.parseInt(in.readLine())) != null )
//ch = Integer.parseInt(ch);
//choice = (char) Integer.parseInt(choice);
//ch = (char) in.read();
choice = (char) ch;
}

}
}