import java.io.*;

class SwitchCaseTrick
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(inp);
		
		System.out.print("\n  Enter First Value: ");
		int a = Integer.parseInt(read.readLine());
		
		System.out.print("\n  Enter Second Value: ");
		int b = Integer.parseInt(read.readLine());

		switch(a-b)
		{
			case 0:
				System.out.println("\n " +a+ " and " +b+ " are same.");			
				break;
			default:
				System.out.println("\n " +a+ " and " +b+ " are different.");			
		}
	}
}