import java.util.Scanner;

public class AvarageOfThreeNumber {
    public static void main(String[] args) {
        float num1, num2, num3;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Three Numbers");
        num1 = ob.nextFloat();
        num2 = ob.nextFloat();
        num3 = ob.nextFloat();

        float avarage = (num1 + num2 + num3) / 3;
        System.out.print("The Avarage Is : " + avarage);

    }
}
