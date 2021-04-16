import  java.io.BufferedReader;
import  java.io.InputStreamReader;
import  java.io.IOException;
class Show
{
int a;
Show(int x){
a = x; 
}
void display(){
System.out.println("This is Java" + a + ".");
}
}

public class AdvertiseJava
{
public static void main(String args []) throws IOException
{
String input1, input2;
int arr[] = new int[3];
int i;

BufferedReader input = new BufferedReader( new InputStreamReader(System.in));

System.out.println("Enter Any JAVA Version :");
input1 = input.readLine();
int num1 = Integer.parseInt(input1);

System.out.println("Enter Another JAVA Version:");
//input2 = input.readLine();
//int num2 = Integer.parseInt(input2);
int num2 = Integer.parseInt(input.readLine());  // In this, there is no use any extra variable at starting as above,i.e., "input1".

System.out.println("\nEnter The Elements Of Array:");
for(i=0; i<3; i++)  // Like "C++", we can declare a variable at any point in the program.
{
arr[i] = Integer.parseInt(input.readLine());
}

System.out.println("\nSum of first two inputs : " + (num1+num2));

System.out.print("The Input Array is : { ");
for(i=0; i<3; i++)
{
System.out.print(arr[i]);
if( i != 2)
System.out.print(",  ");
}
System.out.println(" }\n");

Show Obj1 = new Show(num1);
Show Obj2 = new Show(num2);

Obj1.display();
Obj2.display();
}
}