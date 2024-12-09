package InterviewPrograms;

public class Removespace {
	
	public static void main(String[] args) {
		
		String s= new String("S  O  O  M");
		char[]c = s.toCharArray();
		StringBuffer sb= new StringBuffer();
		for (int i=0;i<c.length;i++)
		{
			if((c[i]!=' ' )&& (c[i]!='\t'))
			{
				sb.append(c[i]);
			}
			System.out.println(sb);
				
		}
	}
}

//Remove space alternative program//
class RemoveWhiteSpaces
{
    public static void main(String[] args)
    {
        String str1 = "Saket Saurav        is a QualityAna    list";
  
        //1. Using replaceAll() Method
  
        String str2 = str1.replaceAll("\\s", "");
  
        System.out.println(str2);
  
           }
}


		
	


