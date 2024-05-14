import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        float pi = 3.14f, radius, area, pramiter;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        radius = ob.nextFloat();

        area = pi * radius * radius;
        pramiter = 2 * (pi * radius);

        System.out.println(" The Area Of Circle  : " + area);
        System.out.println(" The Pramiter Of Circle  : " + pramiter);

    }
}
