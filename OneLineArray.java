import  mathe.Square;
import  java.io.BufferedReader;
import  java.io.InputStreamReader;
import  java.io.IOException;

class FormatArray
{
public void printArray(int a[], int l){
int i;
System.out.print(" { ");
for(i=0; i<l; i++)
{
System.out.print(a[i]);
if( i < l-1 )
System.out.print(",  ");
}
System.out.print(" }");
}
}

public class OneLineArray
{
public static void main(String [] args) throws IOException
{
Square ob = new Square();
FormatArray D = new FormatArray();
BufferedReader in = new BufferedReader( new InputStreamReader(System.in) );
int i;

System.out.println("\nEnter the number of elements: ");
int n = Integer.parseInt(in.readLine());

int arr[] = new int[n];
int squared[] = new int[n];

String[] input = new String[n];
System.out.println("\nEnter all "+n+" elements:");
input = in.readLine().split(" ");

for(i=0; i<n; i++)
{
arr[i] = Integer.parseInt( input[i] );
squared[i] = ob.squ(arr[i]);
}

/*System.out.println("\nInput List Is: { ");
for(i=0; i<n; i++)
{
System.out.print(arr[i]);
if( i < 3 )
System.out.print(",  ");
}
System.out.print(" }");

for(i=0; i<n; i++)
{
System.out.print(squared[i]);
if( i < 3 )
System.out.print(",  ");
}
System.out.print(" }"); */

System.out.println("\nInput List Is:");
D.printArray(arr, n);
System.out.println("\n\nList with Squared elements Is:");
D.printArray(squared, n);
System.out.println("\n\nLength of List is: " + arr.length);
}
}