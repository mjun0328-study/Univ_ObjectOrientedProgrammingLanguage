import java.util.Scanner;
public class Problem1
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int term = input.nextInt();

		if(term <=0)
			System.out.println("The given term is not a positive integer.");
		else if(term == 1)
			System.out.println("0");
		else {
			long n = 1;
			long n_prev = 0;

			System.out.print("0 1");
			for(int i=2; i<term; i++) {
				long temp = n_prev;
				n_prev = n;
				n = n + temp;
				System.out.print(" " + n);
			}
			System.out.println("");
		}
	}
}