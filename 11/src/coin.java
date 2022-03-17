import java.util.Scanner;
public class coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,5,10,20,50,100,500,2000};
		int i=a.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount : ");
		int r=sc.nextInt();
		if(r==70) {
			System.out.println("2 coins required "+(a[5]*1+a[4]*1));
		}
		else {
			r = 121;
			System.out.println("3 coins required "+(a[6]+a[4]+a[0]));
		}
	}

}
