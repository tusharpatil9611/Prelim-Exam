
public class Vishal {

	public static void main(String[] args) 
	{
		int []a={6,7,9,6,3,9,2,6};
		
		for (int i = 0; i < a.length; i++) 
		{int count=0;
			for (int j = 1+i; j < a.length; j++) 
			{
				if(a[i]!=a[j])
					count++;
			}
			if(count==0)
			{
				
			}
		}
		
	}

}
