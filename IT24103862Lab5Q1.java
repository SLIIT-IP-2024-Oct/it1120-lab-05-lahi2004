import java.util.Scanner;

public class IT24103862Lab5Q1 {

	public static void main (String[] args) {

		Scanner input = new Scanner (System.in) ;
		
		System.out.println ("Enter 3 integers to see which one is largest and smallest : ");
		int number_One = inputInt.nextInt ();

		int number_Two = inputInt.nextInt ();

		int number_Three = inputInt.nextInt (); 
		
		System.out.println ("User inputs are : " +number_One+ " " +number_Two+ " " +number_Three);

		int larg ;
		int small ;

		if ((number_One > number_Two) && (number_One > number_Three) && (number_Two> number_Three)) {

			larg = number_One;
			small = number_Three;
			System.out.println ("Largest number is : " +larg);
			System.out.println ("Smallest number is : " +small);
		
		}else if ((number_Two > number_Three) && (number_Two > number_One) && (number_Three > number_One)) {
		
			larg = number_Two;
			small = number_One;
			System.out.println ("Largest number is : " +larg);
			System.out.println ("Smallest number is : " +small);

		}else {

			larg = number_Three;
			small = number_Two;
			System.out.println ("Largest number is : " +larg);
			System.out.println ("Smallest number is : " +small);
		
		}


		

	}



}



			