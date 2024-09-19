package week1Day2Assignments;

public class Library {

    private String addBook()
    {
        return "IKIGAI";
	    }
    
    public void issueBook()
    {
      System.out.println("Book issued Successfully");
    
    }
   
		public static void main(String[] args) {
		Library Q=new Library();
		String addBook = Q.addBook();
		
		
		System.out.println("Book added successfully - " +addBook);
		Q.issueBook();
	}
	}

