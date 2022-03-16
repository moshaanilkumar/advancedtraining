
public class shuffel2strings
{
	public static void main(String arghs[])
	{
		
		String a="abc";
		
		System.out.println("Enter the word to check with");
		String b="def";
		if(a.length()!=b.length())
		{
			System.out.println("Wrong word");
		}
		else
		{
			char x[]=b.toCharArray();
			char y[]=a.toCharArray();
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<y.length;j++)
				{
					if(x[i]==y[j])
					{
						x[i]='0';
						y[j]='0';
						break;
					}
				}
			}
			for(int i=0;i<x.length;i++)
			{
				if(x[i]!='0'||y[i]!='0')
				{
					System.out.println("Wrong word");
					System.exit(0);
				}
			}
			System.out.println("Word matched");
		}
	}
}