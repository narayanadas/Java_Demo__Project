package StringExms;

public class StrCompEql {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		System.out.println(s1==s2); //false
		System.out.println(s1.compareTo(s2)); //0
		
		String s11 = "Hello";
		String s21 = new String("Hello"); 
		System.out.println(s1==s11); //true
		System.out.println(s2.compareTo(s21)); //0
		System.out.println(s2.equals(s21));  //true

	}

}
