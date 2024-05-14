import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int breath, hiegth;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Breath And hiegth : ");
        breath = ob.nextInt();
        hiegth = ob.nextInt();

        int area = breath * hiegth;
        int pramiter = 2 * (breath + hiegth);

        System.out.println("The Area Is : " + area);
        System.out.println("The Pramiter Is : " + pramiter);

    }
}
