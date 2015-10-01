import java.util.*;

public class addme
{

	private int firstInt;
	private int secondInt;
	private int addsum;
	//private int a;
	//private int b;
		public void addme(int a, int b)
		{

			firstInt = a;
			secondInt = b;

		}

		public int getSum()
		{

			addsum = firstInt + secondInt;
			return addsum;
		}

		public void printSum()
		{

			System.out.println("The sum of " + firstInt + "and " + secondInt + "is " + getSum());

		}

}
