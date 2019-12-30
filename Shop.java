import java.util.Scanner;

public class Shop
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter no of item");
		int no=s.nextInt();
		Item item[]=new Item[no];
		
		String iname;
		double pr;
		int st;
		
		//int len=item.length;
		
		for(int i=0;i<item.length;i++)
		{
			System.out.println("Enter item name: ");
			iname=s.next();
			
			System.out.println("Enter the price: ");
			pr=s.nextDouble();
			
			System.out.println("Enter the stock: ");
			st=s.nextInt();
			
			item[i]=new Item(iname,pr,st);
			
			System.out.println(item[i]);
			
			item[i].calAmt();
		}
		Item.billamount();
	}
}
