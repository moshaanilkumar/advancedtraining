
public class MainClass {
	
	public void createBooks() {
		book bk[] = new book[2];		 
	      bk[0] = new book("Java Programing ", 350.50);
	      bk[1] = new book("Let Us C", 200.00);
	      for(int i = 0; i<bk.length; i++) {
		         bk[i].display();
		         System.out.println(" ");
	      }
	    
	      }
	
	public void showBooks() {
		  	createBooks();
		
	}
	public static void main(String args[])  {
	    MainClass c1 = new MainClass();  
		c1.showBooks();
	   
	      }
	   }

