class Palindrome {
	
	public static void main(String[] args)
	{
		String s="";
		//Разбиение строки на слова
		for (int i = 0; i < args.length; i++) 
		{
			s = args[i];
			System.out.print(s);
			//Вызов метода проверки
			System.out.println(" - "+isPalindrome(s)); 
		}
	}
	//Метод который переворачивает символы в строке
	public static String reverseString(String args)
	{
		String s="";
		for(int i = args.length(); i>0; i--)
		{
			s+=args.charAt(i-1);
		}
		return s;
	}
	//Метод проверки эквивалентности данной строки и перевернутой
	public static boolean isPalindrome(String s)
	{
		return s.equals(reverseString(s));
	}
}