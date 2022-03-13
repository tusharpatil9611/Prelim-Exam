
public class AprilPattern {

	public static void main(String[] args) 
	{
		int a=5;
		int count=1;
		int count1=a*a+1;
		int multi=a-1;
		for (int i = 0; i <a; i++) 
		{
			int diff=2*multi;
			for (int j = 0; j <a*2; j++)
			{
				if(j-i>=0 && j+i<a*2)
				{
					if(j<a)
					System.out.print(count+++" ");
					else
					{
					System.out.print(count1+++"  ");
					}
				}
				else
					System.out.print("  ");
			}
			count1=count1-diff+1;
			multi--;
			System.out.println();
		}
	}

}
