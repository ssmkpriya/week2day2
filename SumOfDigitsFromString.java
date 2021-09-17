package week2.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get thhe String
		String str="Testleaf2021";
		//Get Only numeric Values
		String number=str.replaceAll("[^0-9]", "");
		int digit=Integer.parseInt(number);
		int sum=0,n;
		int remainder;
//		while(digit>0) {
//			
//			remainder=digit%10;
//			sum=sum+remainder;
//			digit=digit/10;
//			
//			
//		}
//		
		
		for(int i=0;i<number.length();i++) {
			char character=number.charAt(i);
			n=Character.getNumericValue(character);
			sum=sum+n;
			
		
			
			
		}
	
		System.out.println("The Sum of numeric values in String is"+sum);

	}

}
