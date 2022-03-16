import java.util.*;
public class shuffel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc";
  		List<String> f = Arrays.asList(a.split(""));
//  		System.out.println(f);
  		
  		String b="def";
  		List<String> s  = Arrays.asList(b.split(""));
//  		System.out.println(s);
  		ArrayList t = new ArrayList();
  		String c=(f.get(0)+s.get(0)+f.get(1)+s.get(1)+f.get(2)+s.get(2));
  		System.out.println(c);
  		if(c=="adbecf"){
  			System.out.println("true : third string is valid shuffle of first and second string.");
  		}
  		
	}
}