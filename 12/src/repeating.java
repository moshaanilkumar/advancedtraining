import java.util.Scanner;
public class repeating
{
    public static void main(String[] args)  
    { 
        int arr[] = new int[] { 1, 2, 3, 10, 6, 4, 3, 7, 10};
        int n=arr.length;
      
        int temp=0;
        for(int i=0;i<n;i++) // select an element
        for(int j=i+1;j<n;j++) //traverse ahead and check for duplicate
            if(arr[i]==arr[j])
              {
                System.out.println("first repeating number is: "+arr[i]);
                temp=1;
                i=n;j=n;
              }
        if(temp==0)
        System.out.println("No repeating integer found");
    }
}
