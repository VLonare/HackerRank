class DeciToBin 
{
	public static void toBinary(int n)
	{
		String ans="";
		while (n>=1)
		{
			int rem=n%2;
			ans=rem+ans;
			n/=2;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) 
	{
		toBinary(12223);
	}
}
