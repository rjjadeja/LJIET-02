package arrayofobject;
import java.util.*;
class Employee1
{
    int rollno;
    String name;
    int marks;

    public void setData(int rollno, String name, int marks)
    {
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }

    public void show()
    {
        System.out.println("\nRoll No :"+rollno+"\nName : "+name+"\nMarks : "+marks+"\n");
    }
}
public class Employee
{
    public static void main(String[] args)
    {
        Employee1[] data1=new Employee1[5];
        int count=0;
        do
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter roll no for student "+(count+1)+" : ");
            int srollno=sc.nextInt();
            System.out.println("Enter marks for student "+(count+1)+" : ");
            int smarks=sc.nextInt();
            System.out.println("Enter name for student "+(count+1)+" : ");
            String sname=sc.next();
            data1[count]=new Employee1();
            data1[count].setData(srollno,sname,smarks);
            count++;
        }while(count<5);

        for(int i=0;i<data1.length;i++)
        {
            data1[i].show();
 }
}
}

