
public class RotateMatrixAnticlockwise {

	public static void main(String[] args)
	{
		int [][] a={{1,2,3,4},
				{5,6,7,8},
				{9,0,1,2},
				{3,4,5,6}};
		int imin=0, jmin=0, imax=3,jmax=3;
		int coun=2;		//this is the extra way to rotate matrix no of the way.
		while(coun>0)
		{
		while(jmin<jmax)
		{
			int temp=a[imin][jmin];
			//Shift 1st Array.
			for (int j =jmin; j <jmax; j++) 
			{
				a[imin][j]=a[imin][j+1];
			}
			//Shift 2nd Array.
			for (int i = imin; i <imax; i++) 
			{
				a[i][jmax]=a[i+1][jmax];
			}
			//Shift 3rd Array.
			for (int j =jmax ; j>jmin; j--) 
			{
				a[imax][j]=a[imax][j-1];
			}
			//Shift 4th array
			for (int i = imax; i >imin; i--)
			{
				a[i][jmin]=a[i-1][jmin];
			}
			a[imin+1][jmin]=temp;
			jmin++;imin++;jmax--;
			imax--;
		}
		imin=0; jmin=0; imax=3;jmax=3;	// Repeat the condition to rotate the matrix. 
		coun--;
		}
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
