import java.util.Scanner;

public class Circle {
    private double radius;
    private double area;
    private double circumference;
    final private double PI = 3.14;
    public void setRadius(){
        Scanner sc = new Scanner(System.in);
        this.radius=sc.nextDouble();
    }
    public void getArea(){
        this.area = this.radius*this.radius*this.PI;
        System.out.println("The area is : " + this.area);
    }
    public void getCircumference(){
        this.circumference = 2*this.PI*this.radius;
        System.out.println("The circumference is : " + this.circumference);
    }
    public static void main(String[] args){
        Circle c = new Circle();
        c.setRadius();
        c.getArea();
        c.getCircumference();
    }
}