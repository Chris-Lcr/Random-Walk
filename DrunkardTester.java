// Name: Cairu Liao
// USC loginid: Cairulia
// CS 455 PA1
// Fall 2015

/**
 * DrunkardTester
 * console-based test program for Drunkard class.
 * Uses hard-coded data, prints actual output.
 * @author Cairu Liao
 */
public class DrunkardTester {
	public static void main(String[] args){
		ImPoint startLoc1 = new ImPoint(0,0);
		drunkardTest(startLoc1,5);
		
		ImPoint startLoc2 = new ImPoint(1000, 8);
		drunkardTest(startLoc2,3);	
		
		ImPoint startLoc3 = new ImPoint(50, 60);
		drunkardTest(startLoc2,9);	
	}
	
	/**
	 * Test takeStep() method and getCurrentLoc() method with startLoc, theStepSize and hard-coded numberOfSteps.
	 */
	private static void drunkardTest(ImPoint startLoc,int theStepSize){
		
		Drunkard drunkard = new Drunkard(startLoc,theStepSize);

		int numberOfSteps = 20;
		
		for (int i=1;i<=numberOfSteps;i++){
			 
			int oldX = drunkard.getCurrentLoc().getX();
		     int oldY = drunkard.getCurrentLoc().getY(); 
			
			System.out.print("Drunkard starts at " + drunkard.getCurrentLoc() +"\t");
			System.out.println("step size is " + theStepSize);
			System.out.println("get starting loc expected: " + drunkard.getCurrentLoc());
			
			drunkard.takeStep();
			int newX = drunkard.getCurrentLoc().getX();
			int newY = drunkard.getCurrentLoc().getY();
			
			System.out.print("took step to " + drunkard.getCurrentLoc() + "\t");
			
			int deltaX = newX - oldX;
			int deltaY = newY - oldY;
			
			//test each step only moves the Drunkard by stepSize coordinate units
			if((Math.abs(deltaX)==theStepSize) || (Math.abs(deltaY)==theStepSize))
			{
				System.out.print("SUCCEEDED\t");
				
				//test each step moves only in one of the four compass directions
				if (deltaX==theStepSize){
					System.out.println("move a step to the EAST");
				}
				if (deltaX==(-theStepSize)){
					System.out.println("move a step to the WEST");
				}
				if (deltaY==theStepSize){
					System.out.println("move a step to the NORTH");
				}
				if (deltaY==(-theStepSize)){
					System.out.println("move a step to the SOUTH");
				}
			}
			else{
				System.out.println("FAILED: not a valid step");
			}
		}
		System.out.println();
	}
}
