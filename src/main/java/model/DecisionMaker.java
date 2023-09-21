/**
 * @author Evan Bunnell - ebunnell
 * CIS175 12737 - Fall 2023
 * Sep 20, 2023
 */
package model;

public class DecisionMaker {

	private boolean decision;
	
	public DecisionMaker() {
		super();
	}
	
	public DecisionMaker(String path, String input) {
		super();
		if (path.equals("1")) {
			this.decision = saysYes(input);
		} 
		else if (path.equals("2")) {
			this.decision = inside(input);
		} else  this.decision = outside(input);
	}

	public boolean getDecision() {
		return decision;
	}

	public void setDecision(boolean decision) {
		this.decision = decision;
	}

	public boolean saysYes(String input) {
		String lower = input.toLowerCase();
		if (lower.equals("yes")) {
			return true;
		} else return false;
	}
	
	public boolean inside(String input) {
		String lower = input.toLowerCase();
		if (lower.equals("eat")) {
			return true;
		} else return false;
	}
	
	public boolean outside(String input) {
		String lower = input.toLowerCase();
		if (lower.equals("leave")) {
			return true;
		} else return false;
	}
}
