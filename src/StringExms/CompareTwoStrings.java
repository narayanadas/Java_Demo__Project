package StringExms;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// create 3 strings
	    String first = "java programming";
	    String second = "java programming";
	    String third = "python programming";

	    // compare first and second strings
	    boolean result1 = first.equals(second);
	    System.out.println("Strings first and second are equal: " + result1);

	    // compare first and third strings
	    boolean result2 = first.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);
	    
	    System.out.println("string compareTo: "+first.compareTo(second));;
//	    equals() checks if two objects are the same or not
//	    and returns a boolean. compareTo() (from interface Comparable) 
//	    returns an integer
	    
	    
//	    In general, both equals() and “==” operators in Java 
//	    		are used to compare objects to check equality, 
//	    		but here are some of the differences between the two: 
//	    			The main difference between the .equals() method 
//	    			and == operator is that one is a method, 
//	    			and the other is the operator.
	}

}
