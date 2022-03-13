
public class FebPatternSetD {

	public static void main(String[] args)
	{
		for (int i = 2; i <=10; i=i+2) 
		{
			for (int j = 0; j <=10; j++) 
			{
				if(j-i<=0)
				{
					if(j==i/2)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
