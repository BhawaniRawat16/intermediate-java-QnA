import java.util.Scanner;

/**
 * findPrimeNumberFromArray
 */
public class findPrimeNumberFromArray {

    public static void main(String[] args) {
        int count = 0;
        String str;
        Scanner obj = new Scanner(System.in);
        str = obj.nextLine();

        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}