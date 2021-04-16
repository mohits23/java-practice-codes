class CommandLineInput
{
  public static void main(String args[])
  {
    int sum = 0;
    for(int i=0; i<10; i++)
      sum = sum + Integer.parseInt(args[i]);
    System.out.println("\nSum of all inputs = " + sum );
  }
}      