public class split {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		String str = "23  +      45   -(   343   /   12  )";
        String[] splits = str.split(" ");
        //This regEx splits the String on the WhiteSpaces 
        for(String s: splits) {
            System.out.println(s);
        }
 	
	}

}
