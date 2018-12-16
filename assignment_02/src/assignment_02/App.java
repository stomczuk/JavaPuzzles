package assignment_02;

import ignore.TestingUtils;

public class App {

	
	/**
	 * You are driving a little too fast, and a police officer stops you. 
	 * Write code to compute the fine you would have to pay. 
	 * If your speed is 60 or less, the result is 0 since there is no fine. 
	 * If speed is between 61 and 80 inclusive, the fine is 100 dollars. 
	 * If speed is 81 or more, the result is 200. 
	 * Unless it is a holiday -- on that day, your speed can be 5 higher in all cases. <br>
	 * <br> 
	 *
	 * <b>EXPECTATIONS:</b><br>
		speedingFine(60, false)  <b>---></b> 0 <br>
		speedingFine (65, false)   <b>---></b> 100 <br>
		speedingFine (65, true) <b>---></b> 0 <br>
	 */
		public static int speedingFine(int speed, boolean isHoliday) {

			int limitOne = 60;
			int limitTwo = 80;


			if (isHoliday) {
				limitTwo += 5;
				limitOne += 5;
			}

			if (speed <= limitOne) {
				return 0;
			}

			if (speed > limitTwo) {
				return 200;
			}

			if (speed >= limitOne && speed <= limitTwo) {
				return 100;
			}
			return 0;

		}
		
	
	
	
	
	
	
	
	
	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
		public static void main(String args[]){
			TestingUtils.runTests();
		}
			

}
