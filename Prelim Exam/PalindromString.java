import com.sun.org.apache.xerces.internal.impl.xs.SubstitutionGroupHandler;


public class PalindromString {

	public static void main(String[] args) 
	{
		String s="ABAAB";
		for (int i = 0; i <s.length(); i++) 
		{
			for (int j = i+2; j <=s.length(); j++)
			{
				String substring=s.substring(i,j);
				//System.out.println(substring);
				boolean result=isPalindrom(substring);
				if(result)
					System.out.println(substring);
			}
		}
	}
	private static boolean isPalindrom(String s) 
	{
		int i=0;
		int j=s.length()-1;
		
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
