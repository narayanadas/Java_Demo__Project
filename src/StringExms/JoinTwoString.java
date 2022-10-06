package StringExms;

//example of join and concat methods

public class JoinTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create first string
	    String first = "Java";
	    System.out.println("First String: " + first);

	    // create second
	    String second = "Programming";
	    System.out.println("Second String: " + second);

	    // join two strings
	    String joinedString = first.concat(second);
	    System.out.println("Joined String: " + joinedString);
	    
	    System.out.println("------------------------");
	    String str1 = "I";
	    String str2 = "love";
	    String str3 = "Java";
	    

	    // join strings with space between them
	    String joinedStr = String.join(" ",str1, str2, str3, str1, str1, str1,str1,str1,str1);
	   

	    System.out.println(joinedStr);

	}

}
