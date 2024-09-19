package week1Day2Assignments;
public class Fibonacci_series {
static void fibo (int range)
{
int i=0, j=1;
for (int k=0; k<range; k++) {
	System.out.println(i);
	int l = j + i;
	i=j;
	j=l;
}
}
	public static void main(String[] args) {
	int range = 8;
	fibo(range);	
	}
}
