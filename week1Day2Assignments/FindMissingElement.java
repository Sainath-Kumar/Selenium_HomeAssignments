package week1Day2Assignments;

import java.util.Arrays;

public class FindMissingElement {
 public static void main(String[] args) {
	
	int  i, num[] = {1,4,3,6,8,7,2};
	Arrays.sort(num);
    for(i=1;i<num.length;i++)
	    {
        if ( num[i] - num[i-1] != 1 ) 
        {
            System.out.println( "Missing number is " + ( num[i] - 1 ) );
        }
     }
}
}
	
	
	
	
 
		
	
 
 
 
 
	
 
 
