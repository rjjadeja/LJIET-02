package arrayofobject;
import java.util.Scanner;

public class arrayexample {
    String name;
    int roll_num;
    int marks;
    Scanner sc = new Scanner(System.in);
    public void setdetails()
    {
        System.out.println("Enter your name :");
        name=sc.next();
        System.out.println("Enter your Roll_num :");
        roll_num=sc.nextInt();
        System.out.println("Enter Marks :");
        marks=sc.nextInt();
        System.out.println();
    }

    public void show()
    {
        System.out.printf("Roll number : %d \n Student name : %s \n Marks : %d \n\n",roll_num,name,marks);
    }

    public static void main(String[] args) {
        arrayexample s[] = new arrayexample[5];



        for(int i=0;i<5;i++)
        {
            s[i]=new arrayexample();
            s[i].setdetails();
        }

        for(int i=0;i<5;i++)
        {
            s[i].show();
        }
    }
}