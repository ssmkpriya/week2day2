package week2.day2;

public class ReverseEvenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the input as Follow
		String test = "I am a Software tester";
		// split the words and have it in an array
		String words[] = test.split(" ");
		String reverse = " ";
		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 0) 

				reverse = reverse + new StringBuilder(words[i]).reverse().toString() + " ";

			else 

			reverse=reverse + words[i] +" ";

		}
reverse=reverse.trim();
System.out.println(reverse);
	}

}
