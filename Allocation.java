import java.util.Scanner;
import java.io.*;

public class Allocation {
	public static void main(String args[]) {
		try(Scanner in = new Scanner(System.in)) {
			int T = in.nextInt();
			for(int i=0; i<T; i++) {
				int N = in.nextInt();
				int B = in.nextInt();
				
				int[] arr = new int[N];
				
				for(int j=0; j<N; j++) {					
					arr[j] = in.nextInt();
					//int ele = in.nextInt();
					//arr[ele]++;
				}
				System.out.println();
				System.out.println(N);
				System.out.println(B);
				for(int k=0; k<N; k++) {	
					System.out.print("  "+ arr[k]);
				}	
			}
								
		}
	}
}