package codePkg;

public class SteppingStone {
	private boolean hasSteppedOnStone = false;
	
	//TODO: Create a function called "steppedOnStone" that *returns a string* based on whether
	// or not the person has stepped on the stone.
	// Return "I have stepped on the stone." if the person has stepped on the stone.
	// Otherwise, return "I did not step on this stone."
	
	public void personSteppedOnStone() {
		hasSteppedOnStone = true;
	}
	
	public String steppedOnStone()
	{
		//return (hasSteppedOnStone)? "I have stepped on the stone." : "I did not step on this stone.";
		if (hasSteppedOnStone) return "I have stepped on the stone.";
		else return "I did not step on this stone.";
	}
}
