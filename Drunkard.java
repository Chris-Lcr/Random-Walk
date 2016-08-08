// Name: Cairu Liao
// USC loginid: Cairulia
// CS 455 PA1
// Fall 2015

import java.util.Random;

/**
* Drunkard class
* Represents a "drunkard" doing a random walk on a grid.
*/

public class Drunkard {
	
	private ImPoint startLoc;
	private int theStepSize;
	private Random ranGen = new Random();
	
	//DIRECTION stands for four compass directions
	private static final int DIRECTION = 4;
	
/**
* Creates drunkard with given starting location and distance to move in a single step.
* @param startLoc starting location of drunkard
* @param theStepSize size of one step in the random walk
*/
  
  public Drunkard(ImPoint startLoc, int theStepSize) {
	  this.startLoc=startLoc;
	  this.theStepSize=theStepSize;
    }

/**
*  Takes a step of length step-size (see constructor) in one of the four compass directions. Changes the current location of the drunkard.
*/
    
  public void takeStep() {
	  
	  //Get a direction randomly
	  int direction = 1 + ranGen.nextInt(DIRECTION);

	  switch (direction)
	  {
	  case 1: startLoc = startLoc.translate(theStepSize,0);break; // x+deltaX, East
	  case 2: startLoc = startLoc.translate(-theStepSize,0);break; // x-deltaX, West
	  case 3: startLoc = startLoc.translate(0,theStepSize);break;	// y+deltaY, North
	  case 4: startLoc = startLoc.translate(0,-theStepSize);break;	// y-deltaY, South
	  }
    }

/**
* Gets the current location of the drunkard.
* @return an ImPoint object representing drunkard's current location
*/

  public ImPoint getCurrentLoc() {
      return startLoc; 
    }
}