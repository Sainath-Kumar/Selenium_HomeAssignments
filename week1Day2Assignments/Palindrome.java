package week1Day2Assignments;

public class Palindrome {

	static int reverseNumber(int n)
	{
		int palin = 0;
		while(n>0)
		{
			palin = palin*10 +n%10;
			n=n/10;
		}
		return palin;
	}
		public static void main(String[] args) {
	int input = 1234321;
	int output = reverseNumber(input);
	System.out.println("Reverse : "+output);
	if (input==output)
		System.out.println("Its Paindrome ");
	else 
		System.out.println("not a Palindrome");
		}
	}


