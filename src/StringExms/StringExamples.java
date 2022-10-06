package StringExms;

public class StringExamples {
	String str = "Automation Testing";
	int countT;

	public void countOccurrencesofaCharInString() {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 't') {
				countT++;
			}
		}
		System.out.println("The Number of times t occures " + countT);
		
	}
	
	public void Without_charAt() {
		countT=0;
		char s1[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (s1[i] == 't') {
				countT++;
			}
		}
		System.out.println("The Number of times t occures " + countT);
	}

	public void noOfSmallandCaps() {
		int smallCount=0;
		int capsCount=0;
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if(c>='A' && c<='Z') {
				capsCount++;
			}else {
				if(c>='a' && c<='z') {
					smallCount++;
				}
			}
			
		}
		System.out.println("No. of capital letters :"+capsCount);
		System.out.println("No. of small letters :"+smallCount);
	}

	public static void main(String[] args) {
		StringExamples se = new StringExamples();
		se.countOccurrencesofaCharInString();
		se.noOfSmallandCaps();
		se.Without_charAt();
	}
}
