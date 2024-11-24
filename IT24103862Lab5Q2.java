import java.util.Scanner ;

public class IT24103862lab5Q2 {

	public static void main (String[] args) {

	Scanner scanner = new Scanner (System.in) ;
	
	System.out.println ("how many members you have introduced to our company : ");
	int quant_ofMembers = sc.nextInt () ;

	if (quant_ofMembers < 0) {
		System.out.println ("Input must be Zero or greater than it");
	
	} else { 

		switch (quant_ofMembers) {
		
		case 0  : 
			
				System.out.println ("no prize.");

				break;
		case 1 : 
			
				
				System.out.println ("You are entitled to pen.");

				break;
		
		case 2 :
			
				System.out.println ("You are entitled Umbrella.");

				break;
		
		case 3 : 
			
				System.out.println ("You are entitled to Bag.");

				break;

		case 4 : 
			
				System.out.println ("You are entitled to Travelling chair.");

				break;
		
		default :
				System.out.println ("you are entitled to Headphone.");
				
		}
	}



  }	


}


