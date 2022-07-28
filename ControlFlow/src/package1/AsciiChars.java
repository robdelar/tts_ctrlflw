package package1;

public class AsciiChars {
	
	public static void printNumbers()
	  {
	    for(int i = 48 ; i < 58; i++) {
	    	System.out.println((char)i + " =" + i);
	    }
	  }

	public static void printLowerCase()
	  {
		for(int i = 97 ; i <= 122; i++) {
	    	System.out.println((char)i + " =" + i);
	    }
	  }
	
	public static void printUpperCase()
	  {
		for(int i = 65 ; i <= 90; i++) {
	    	System.out.println((char)i + " =" + i);
		}
	    
	  }

}
