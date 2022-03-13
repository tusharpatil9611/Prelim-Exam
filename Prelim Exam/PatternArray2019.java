
public class PatternArray2019 {
	public static void main(String[] args)
	{
		int [][]a=new int[5][5];
		int count=1;
		for (int i = 0; i < a.length; i++) 
		{
			int jcount=count+i;
			for (int j = 0; j < a.length; j++)
			{
				if(j+i>=4)
				{
					if(i%2==0)
					{
						a[i][j]=count++;
					}
					else
					{
						a[i][j]=jcount--;
						count++;
					}
				}
			}
		
		}
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i][j]==0)
					System.out.print(" ");
				else
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
