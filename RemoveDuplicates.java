package week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "We learn java in a java session learn in java a";
		String words[] = sentence.split(" ");
		int count = 0;
		String replace = "";
		for (int i = 0; i < words.length; i++) {
					
			for (int j = i + 1; j < words.length; j++) {

				
				if (words[i].equals(words[j])) {
					words[j] = "duplicate";

				}

			}
		}
		//convert to string
		for(String word:words) {
			
		if(word!="duplicate")	{
			
			replace=replace+word+" ";
		}
			
		}
		System.out.println(replace);

	}
}
