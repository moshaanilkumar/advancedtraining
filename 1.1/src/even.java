import java.util.Scanner;
public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		System.out.println(" even numbers in the number :"+num);
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		
		}
	}

}
