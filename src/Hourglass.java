/*  Firs we need to do top of hourglass. firstPart is for |""""""""""|. Then we creating nested loop for the top \:/. 
  secondPart is for that.
  

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
		for(int h = AAAA; h<=AAAA+g; h++) { //* for the spases.  *//
			System.out.print(" ");
		}
	for(int l = AAAA; l<=AAAA ; l++) {
		System.out.print("\\");                    /* loop for the side \ of hourglass */
		
     for(int j = (-2*g)+11; j>= 2 ; j-- ) {
    	System.out.print(":");
        }
     for(int v = AAAA; v<=AAAA ; v++) {           /* loop for the side / of hourglass */
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
			for(int g = AAAA; g<=4; g++ ) { //* for the all  /:\.  *//
				System.out.print(" ");
			for(int h = AAAA; h<=(-1*g)+5; h++) {
				System.out.print(" ");
			}
			for(int l = AAAA; l<=AAAA ; l++) {
				System.out.print(" /");              /* loop for the side / of hourglass */
			}
			for(int j=AAAA ; j<=(2*g)+0; j++) {
				System.out.print(":");
	        }
			 for(int v = AAAA; v<=AAAA ; v++) {           /* loop for the side \ of hourglass */
			  		System.out.print("\\");
			 	  }
			     System.out.println("");
			     
			
				
		
		    }
				}
				
		    
			
			
			
}

			
			
			
			
			
			
		   

	

