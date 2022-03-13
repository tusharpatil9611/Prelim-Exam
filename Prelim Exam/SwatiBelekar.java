
public class SwatiBelekar {

	public static void main(String[] args) 
	{
		int [][]a=new int[7][7];
		int imin=0,imax=6,jmin=0,jmax=6;
		int count=4;
		while(imin<=imax)
		{
			for (int j = jmin; j <jmax; j++) 
			{
				a[imin][j]=count;
			}
			for (int i =imin ; i <imax; i++)
			{
				a[i][jmax]=count;
			}
			for (int j = jmax; j>=jmin; j--)
			{
				a[imax][j]=count;
			}
			for (int i = imax; i >=imin; i--)
			{
				a[i][jmin]=count;
			}
			count--;
			 imin++;;imax--; jmin++;jmax--;
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
