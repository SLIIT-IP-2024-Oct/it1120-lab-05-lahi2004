import java.util.Scanner ;

	public class IT24103862lab5Q3 {

		public static final double rentof_Room = 48000 ;
		public static final double discount_One = 10 ;
		public static final double discount_Tw0 = 5 ;
			
			public static void main (String...args) {
						
			Scanner sc = new Scanner (System.in) ;
			System.out.println ("When would you like to reserve a room  (1 - 31) ? ") ;
			int start_Date = sc.nextInt ();

			System.out.println ("Could you please tell us what is your planned check out date (1 - 31) ? ");
			int end_Date = sc.nextInt ();
			
			int days_Booked =  end_Date - start_Date ;

			 if ((start_Date >= 1 &&  end_Date <= 31) && start_Date <  end_Date ) {

				if (days_Booked < 3) {
							double amount_One = days_Booked * rentof_Room; 
							System.out.println ("Your total amount is : " +amount_One) ;

				} else if (days_Booked == 3 || days_Booked < 5 ) {

							double amount_Two = days_Booked * rentof_Room ;
							double discountAmount_One = amount_Two / discount_One ;
							double amountwithDiscount_One = amount_Two - discountAmount_One ;
					
							System.out.println ("Your total amount is : " amountwithDiscount_One) ;
				
				} else if (daysReserved >= 5) {

					
							double amount_Three = days_Booked * rentof_Room ;
							double discountAmount_Two = amount_Three / discount_Tw0;
							double amountwithDiscount_Two = amount_Three - discountAmount_Two ;

							System.out.println ("Your total amount is : " +amountwithDiscount_Two) ;
		
				} else {

							System.out.println ("Sorry we only give our room for 24 hours or more than it" ) ;
		
				}

			} else {

			
							
							System.out.println ("invalid date or End date must be greater than Start date." ) ;
			}


	}


}


			
				

		