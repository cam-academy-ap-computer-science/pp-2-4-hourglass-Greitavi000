/***** 
 * Grading Comments:   22/25 pts
 * Nice Job.  Your program compiles and does the job.  
 * 
 * There are a couple of things you can improve upon.
 *  - Your indentation makes it very difficult to read and
 *    follow.   It may not seem important, but it actually
 *    significantly adds to the effort you need to make to 
 *    understand your program and makes it easier to introduce
 *    bugs.
 *  - Although you used a class constant, you didn't really
 *   use it for much except 1.  It would've been good to say
 *   'WIDTH' for the firstpart for loops.
 *  - You could have used a loop to print out the " in the 
 *  top and bottom of the hourglass, and you didn't need a 
 *  for loop from i = 1; i <= 1... it's just a statement.
 *  - The pseudocode is ok - you broke down what you needed
 *  to do, but it should be a tool to help you write the code
 *  
 * Correct Output 10/10
 * Proper Use of Static Methods 3/3
 * Proper Use of for loops 3/3
 * Pseudocode 2/3
 * Comments 2/2
 * Consistent Layout and Style 1/2 -  Make sure your
 *   indentation lines up correctly, though - 
 * Proper Use of Class Constant 1/2 -   
 * Resizing extra credit: 0/2
 */ 
/*  Firs we need to do top of hourglass. firstPart is for |""""""""""|. Then we creating nested loop for the top \:/, 
  secondPart is for that. The middle part is just println statement of ||. And then we duing  nested loop for the bottom /:\.
  And then we put firstPart  |""""""""""| again for the buttom. And boom you have hourglass.  
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

			
			
			
			
			
			
		   

	

