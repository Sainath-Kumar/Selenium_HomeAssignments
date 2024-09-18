package week1assignments;

public class Chrome {

	
public void browserVersion () {
System.out.println("Browser Version is : 91.0");
}
	void developer () {
	System.out.println("Developer of the Browser is : Google");
	}
	
private int year() {
	return 2008;
}
	
	
public static void main(String[] args) {
	char shortcutKey ='C';
		Chrome ChrBwsr =new Chrome ();
		boolean isbeta = false;
		//int year = 2008;
					//		System.out.println("Release Year : "+ year);
		System.out.println("isBeta : "+isbeta);
					ChrBwsr.browserVersion();
		ChrBwsr.developer();
		System.out.println("ShortcutKey is :"+shortcutKey);
		int year = ChrBwsr.year();
				System.out.println("Release Year : " + year);
		
	}
}