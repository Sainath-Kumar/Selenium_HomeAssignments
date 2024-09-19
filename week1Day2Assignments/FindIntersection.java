package week1Day2Assignments;

public class FindIntersection {

	public static void main(String[] args) {
	int a[] = {3,11,2,4,6,7};
	int b[] = {1,2,8,4,9,7};
	int length =a.length;
	int len = b.length;
	System.out.println("Length of first array : "+length);
	System.out.println("Length of second array : "+len);
		for (int i = 0; i < a.length; i++) 
		{
			for (int j=0; j<b.length; j++)
				{
							
			if(a[i]==b[j]) {
				System.out.println("Duplicate number : "+a[i]);
			}
				}
					
		}
	}		
}