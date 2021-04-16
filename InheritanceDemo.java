import java.util.Scanner;

class Parent
{
	Parent()
	{
		System.out.println("\n\t[in Parent() Constructor]");
	}
	
	void display(int n)
	{
		System.out.println();
		for(int i=0; i<n; i++)			
		{
			System.out.println("Hellow World!");
		}
	}
}

class Child extends Parent
{
	Child()
	{
		System.out.println("\n\t[in Child() Constructor]");
	}
	
	void limit()
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("\nEnter the no. of times to print 'Hellow World': ");
		int N = read.nextInt();
		
		this.display(N);
	}
}

class InheritanceDemo extends Child
{
	InheritanceDemo()
	{
		System.out.println("\n\t[in InheritanceDemo() Constructor]");
	}
	
	void call()
	{
		limit();
	}
	
	public static void main(String args[])
	{
		InheritanceDemo ob = new InheritanceDemo();
		
		ob.call();
	}
}