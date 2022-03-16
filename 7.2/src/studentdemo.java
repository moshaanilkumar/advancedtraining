
import java.io.*;
public class studentdemo
{
     public static void main(String args[])throws Exception
     {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

          System.out.print("Enter roll number: ");
          int roll = Integer.parseInt(br.readLine());
          System.out.print("\nEnter name: ");
          String name = br.readLine();
          System.out.print("\nEnter age: ");
          int age = Integer.parseInt(br.readLine());
          System.out.print("\nEnter course: ");
          String course = br.readLine();
          student s = new student(roll,name,age,course);
          s.display();
     }
}