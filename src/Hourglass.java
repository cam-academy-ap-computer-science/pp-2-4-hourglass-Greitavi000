/* ?

*/

public class Hourglass {
	public static final int AAAA = 1;
	public static void main (String[]args){
		firstPart();
		secondPart();
		middlePart();
		forthPart();
		firstPart();
	}
	public static void firstPart() {
		System.out.println("  |\"\"\"\"\"\"\"\"\"\"|");   //* top of clock*//
	}
	
	public static void secondPart() {
		for(int g = AAAA; g<=4; g++ ) { //* for the all top \:/.  *//
		System.out.print(" ");
		for(int h = AAAA; h<=1+g; h++) { //* for the spases.  *//
			System.out.print(" ");
		}
	for(int l = 1; l<=1 ; l++) {
		System.out.print("\\");                    /* loop for the side \ of hourglass */
		
     for(int j = (-2*g)+11; j>= 2 ; j-- ) {
    	System.out.print(":");
        }
     for(int v = 1; v<=1 ; v++) {           /* loop for the side / of hourglass */
  		System.out.print("/");
 	  }
     System.out.println("");
     
    
    }
		}
		
		
		}
		
		public static void middlePart() {
		System.out.println("       ||");	
		}

		public static void forthPart() {
			for(int g = AAAA; g<=4; g++ ) { //* for the all top \:/.  *//
				System.out.print(" ");
				for(int h = AAAA; h<=1+g; h++) { //* for the spases.  *//
					System.out.print(" ");
				}
			for(int l = 1; l<=1 ; l++) {
				System.out.print("/");                    /* loop for the side / of hourglass */
				
		     for(int j = (-2*g)+11; j>= 2 ; j-- ) {
		    	System.out.print(":");
		        }
		     for(int v = 1; v<=1 ; v++) {           /* loop for the side \ of hourglass */
		  		System.out.print("\\");
		 	  }
		     System.out.println("");
		     
		    
		    }
				}
				
		    
			
			
			
			
			
			
			
			
			
			
		    }
		
		
			}	


	

