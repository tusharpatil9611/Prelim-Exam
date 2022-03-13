
public class PrilimQ1 {

	public static void main(String[] args) 
	{
		int []a={1,0,1,0,1,0,1,0};
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			sum=sum+a[i];
		}
		//System.out.println(sum);
		System.out.println(a.length-sum);
	}

}
