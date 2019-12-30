import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		
		int i,j,flag;
		
		for(i=0; i<=100; i++)
		{
			flag=0;
			for(j=1;j<=i;j++)
			{
				if(i % j==0)
					flag++;
			}
			
			if(flag==2)
				
			System.out.println( +i );
		}
		
	}
}
	

