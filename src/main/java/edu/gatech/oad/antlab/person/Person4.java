package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
      //Person 1 put your implementation here
	String output = "";
	for (int i = 0; i < input.length(); i++) {
		char outChar = input.charAt(i);
		if (outChar == "9".charAt(0)) {
			output += "a";
			continue;
			}
		else if (outChar == "z".charAt(0)) {
			output += "A";
			continue;
			}
		else if (outChar == "Z".charAt(0)) {
			output += "0";
			continue;
			}
		outChar += 1;
		output += String.valueOf(outChar);
		}
	return output;
    }
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }

}

