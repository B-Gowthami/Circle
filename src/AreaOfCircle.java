import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[]) {
        int radius;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ::");
        radius = sc.nextInt();
        area = (22*radius*radius)/7;
        System.out.println("Area of the circle is ::" + area);
    }
}
