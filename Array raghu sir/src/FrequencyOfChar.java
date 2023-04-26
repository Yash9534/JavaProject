
public class FrequencyOfChar {
public static void main(String[] args) 
{
	String st="btm bangalore";
int[] freq=new int[st.length()];

char String[]=st.toCharArray();
for(int i=0; i<st.length(); i++)
{
	freq[i]=1;
	for(int j=i+1;j<st.length();j++)
	{
		if(String[i]==String[j])
		{
			freq[i]++;
			String[j]='0';
		}
	}
}
System.out.println("Character and their crossponding frequencies");
for(int i=0;i<freq.length;i++)
{
	if(String[i]!=' '&&String[i]!='0')
		System.out.println(String[i]+"="+freq[i]);
}
}
}
