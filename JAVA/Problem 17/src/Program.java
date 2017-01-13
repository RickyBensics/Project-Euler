/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.
 * 
 * Richard Bensics
 * 1/12/17
 */

public class Program 
{
	private static int letterCount = 0;
	
	public static void main(String[] args)
	{	
		for (int count = 1; count <= 1000; count++)
		{
			String[] digitArray = Integer.toString(count).split("");
			for(int i = 0; i < digitArray.length; i++)
			{
				if(digitArray.length - i == 4) // thousand's place
				{
					System.out.print(digitToString(digitArray[i]) + " thousand ");
					letterCount += 8;
				}
				
				if(digitArray.length - i == 3 && digitArray.length != 4) // hundred's place
				{
					System.out.print(digitToString(digitArray[i]) + " hundred ");
					letterCount += 7;
				}
				
				if(digitArray.length - i == 2) // ten's place
				{
					if(digitArray.length > 2 && !(digitArray[digitArray.length-1].compareTo("0") == 0 && digitArray[digitArray.length-2].compareTo("0") == 0))
					{
						System.out.print("and ");
						letterCount += 3;
					}
					System.out.print(tensPlace(digitArray[i], digitArray[i+1]) + " ");
					if(digitArray[i].compareTo("1") == 0) // don't repeat ones place if number is 10-19
						break;
				}
				
				if(digitArray.length - i == 1) // one's place
						System.out.print(digitToString(digitArray[i]));
			}
			System.out.println();
		}
		System.out.println(letterCount + " letters were used to create this number list");
	}
	
	public static String digitToString(String number)
	{
		String word = null;
		
		switch(Integer.parseInt(number))
		{
			case 0:	word = "";
					break;
			case 1:	word = "one";
					letterCount += word.length();
					break;
			case 2:	word = "two";
					letterCount += word.length();
					break;
			case 3:	word = "three";
					letterCount += word.length();
					break;
			case 4:	word = "four";
					letterCount += word.length();
					break;
			case 5:	word = "five";
					letterCount += word.length();
					break;
			case 6:	word = "six";
					letterCount += word.length();
					break;
			case 7:	word = "seven";
					letterCount += word.length();
					break;
			case 8:	word = "eight";
					letterCount += word.length();
					break;
			case 9:	word = "nine";
					letterCount += word.length();
					break;
		}
		
		return word;
	}
	
	public static String tensPlace(String number, String nextNumber)
	{
		String word = null;
		
		switch(Integer.parseInt(number))
		{
			case 0:	word = "";
					break;
			case 1:	
				{
					switch(Integer.parseInt(nextNumber))
					{
						case 0:	word = "ten";
								letterCount += word.length();
								break;
						case 1:	word = "eleven";
								letterCount += word.length();
								break;
						case 2:	word = "twelve";
								letterCount += word.length();
								break;
						case 3:	word = "thirteen";
								letterCount += word.length();
								break;
						case 4:	word = "fourteen";
								letterCount += word.length();
								break;
						case 5:	word = "fifteen";
								letterCount += word.length();
								break;
						case 6:	word = "sixteen";
								letterCount += word.length();
								break;
						case 7:	word = "seventeen";
								letterCount += word.length();
								break;
						case 8:	word = "eighteen";
								letterCount += word.length();
								break;
						case 9:	word = "nineteen";
								letterCount += word.length();
								break;
					}
					break;
				}
			case 2:	word = "twenty";
					letterCount += word.length();
					break;
			case 3:	word = "thirty";
					letterCount += word.length();
					break;
			case 4:	word = "fourty";
					letterCount += word.length();
					break;
			case 5:	word = "fifty";
					letterCount += word.length();
					break;
			case 6:	word = "sixty";
					letterCount += word.length();
					break;
			case 7:	word = "seventy";
					letterCount += word.length();
					break;
			case 8:	word = "eighty";
					letterCount += word.length();
					break;
			case 9:	word = "ninety";
					letterCount += word.length();
					break;
		}
		
		return word;
	}
}
