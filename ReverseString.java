package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Welcome";
		char ch[]=str.toCharArray(); 
		String reverse="";
		for(int i=ch.length-1; i>=0; i--)
		{
			reverse=reverse+ch[i];
			
			
		}
		System.out.println("The Reversed String is:"+""+reverse);
	}

}
