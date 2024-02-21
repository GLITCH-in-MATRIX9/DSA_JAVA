import java.util.Scanner;

//calculate area from the radius
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your radius");
        double r = sc.nextDouble();
        double area = 2 * 3.14 * r;
        System.out.println("The area is " + area);

    }

}