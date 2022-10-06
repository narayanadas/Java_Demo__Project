package StringExms;
import java.util.Arrays;

// importing Arrays to convert array to string
// used for printing arrays
public class SplitAtCharacter{
	public static void main(String[] args) {
	    String vowels = "a+e+f";

	    // splitting the string at "+"
	    String[] result = vowels.split("\\+");


	    // converting array to string and printing it
	    System.out.println("result = " + Arrays.toString(result));
	  }
}