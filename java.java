// /**
//  * Solid Rectangle
//  */
// public class java {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * Hollow Rectangle
 */
// public class java {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= 5; j++) {
//                if(i==1||i==4||j==1||j==5) {
//                 System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * Half-Pyramid
 */
// public class java {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// /**
//  * Inverted Half-Pyramid
//  */
// public class java {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 5; j>=i; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * Inverted Half-Pyramid (Rotate by 180 deg.)
 */
// public class java {

// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {

// for (int j = 1; j<=6-i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j<=i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// // Half-Pyramid with Numbers
// public class java {

// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {

// for (int j = 1; j<=i; j++) {
// System.out.print(j);
// }

// System.out.println();
// }
// }
// }

// //Inverted Half-Pyramid with Numbers
// public class java {

// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {

// for (int j = 1; j<=6-i; j++) {
// System.out.print(j+" ");
// }

// System.out.println();
// }
// }
// }

// Inverted Half-Pyramid with Numbers
// public class java {

// public static void main(String[] args) {
// int num = 1;
// for (int i = 1; i <= 5; i++) {

// for (int j = 1; j<=i; j++) {
// System.out.print(num++ +" ");
// }

// System.out.println();
// }
// }
// }

// Inverted Half-Pyramid with Numbers
// public class java {

// public static void main(String[] args) {
// int num = 1;
// for (int i = 1; i <= 5; i++) {

// for (int j = 1; j<=i; j++) {
// if((i+j)%2==0){
// System.out.print("1 ");
// }else{
// System.out.print("0 ");
// }
// }

// System.out.println();
// }
// }
// }

// //Butter-fly
// public class java {

// public static void main(String[] args) {
// int num = 1;
// for (int i = 1; i <= 4; i++) {

// for (int j = 1; j<=i; j++) {
// System.out.print("* ");
// }

// for (int j = 1; j<=2*(4-i); j++) {
// System.out.print(" ");
// }

// for (int j = 8; j>8-i; j--) {
// System.out.print("* ");
// }

// System.out.println();
// }

// for (int i = 4; i >= 1; i--) {

// for (int j = 1; j<=i; j++) {
// System.out.print("* ");
// }

// for (int j = 1; j<=8-2*i; j++) {
// System.out.print(" ");
// }

// for (int j = 8; j>8-i; j--) {
// System.out.print("* ");
// }

// System.out.println();
// }
// }
// }

// //Solid Rhombus
// public class java {

// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {

// for (int j = 1; j<=5-i; j++) {
// System.out.print(" ");
// }

// for (int j = 1; j<=5; j++) {
// System.out.print("* ");
// }

// System.out.println();
// }

// }
// }

// // Number Pyramide
// public class java {

//     public static void main(String[] args) {
//         boolean b = true;
//         for (int i = 1; i <= 5; i++) {

//             for (int j = 5; j >= i; j--) {
//                 System.out.print(" ");

//             }

//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i+" ");
//             }
//             System.out.println();

//         }
//     }

// }

// // Pelindromic Pattern
// public class java {

//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {

//             for (int j = 5; j >= i; j--) {
//                 System.out.print("  ");
//             }

//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j+" ");
//             }

//             for (int j = 2; j <=i; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();

//         }
//     }

// }

// Pelindromic Pattern
// public class java {

//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {

//             for (int j=5; j>=i; j--) {
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }

//          for (int i = 4; i >= 1; i--) {

//             for (int j=5; j>=i; j--) {
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }

// }

// // Enter 3 number from the User & make a function to print thier average.

// /**
//  * java
//  */
// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         int num1 , num2 , num3 ;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter First Number : ");
//         num1 = obj.nextInt();
//         System.out.print("Enter Second Number : ");
//         num2 = obj.nextInt();

//         System.out.print("Enter Third Number : ");
//         num3 = obj.nextInt();
//         System.out.println(calAverage(num1 , num2 , num3));
//     }

//     public static int calAverage(int n1 , int n2 , int n3){
//         int sum = 0 , avg = 0;
//         sum += n1+n2+n3;
//         avg = sum/3;
//         return avg;
//     }
// }

// // write  a function to print the sum of all odd numbers from 1 to n.

// /**
//  * java
//  */
// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         int num1;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         num1 = obj.nextInt();

//         calSumOfOddNumber(num1);

//     }

//     public static void calSumOfOddNumber(int n){
//         int sum = 0;
//         for (int i = 1; i <=n; i++) {
//             if(i%2 != 0)
//             sum+=i;
//         }

//         System.out.println("The Sum Of All Odd Numbers Is : "+sum);
//     }
// }

// // write  a function which takes in 2 number and return the greater of those.

// /**
//  * java
//  */
// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         int num1 , num2;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         num1 = obj.nextInt();
//         System.out.print("Enter a Number : ");
//         num2 = obj.nextInt();

//         System.out.println("The Greater Number Is : "+calGreater(num1 , num2));

//     }

//     public static int calGreater(int n1 , int n2){
//         if(n1>n2){
//             return n1;
//         }else{
//             return n2;
//         }

//     }
// }

// // write  a function which takes in the radius as input and return the
// circumfrence of a circle.

// /**
//  * java
//  */
// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         int rad;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter the Radius Of a Circle : ");
//         rad = obj.nextInt();

//         System.out.println("The Circumfrence of circle Is : "+calCircumfrence(rad));

//     }

//     public static float calCircumfrence(int r){
//         float c = 0 , pi = 3.14f;
//         c = 2*pi*r;
//         return c;
//     }
// }

// // write  a function which takes in age as input and return that 
// //if person is eligible to vote or note .
// // A person of age > 18 is eligible to vote.

// /**
//  * java
//  */
// import java.util.Scanner;

// public class java {

//     public static void main(String[] args) {
//         int age;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter Your Age : ");
//         age = obj.nextInt();
//         if(calAgeForVote(age)){
//             System.out.print("Your Eligible to Vote");
//         }
//         else{
//             System.out.println("You Are Not Eligible to vote");
//         }

//     }

//     public static boolean calAgeForVote(int age) {
//         if(age<0||age>100){
//             return false;
//         }
//         else if(age>18){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }

// // write  an infinite loop using do while condition 

// public class java {

//     public static void main(String[] args) {
//         infiniteLoop();
//     }

//     public static void infiniteLoop() {
//         do{
//             System.out.println("infinite loop");
//         }while (true);
//     }
// }

// // write a program to enter the number till the user wants and
// // at end it should display the count of positive , negative and zero;

// public class java {

//     public static void main(String[] args) {
//         countNumbers();
//     }

//     public static void countNumbers() {
//         int num =0 , i , j , positive = 0 , negative = 0 , zero = 0;
//         Scanner obj = new Scanner(System.in);
//         System.out.println("Enter How Many Numbers You Want to Store : ");
//         i = obj.nextInt();

//         do {
//             System.out.print("Enter A Number : ");
//             j = obj.nextInt();
//             if(j>0){
//                 positive++;
//             }else if(j<0){
//                 negative++;
//             }else{
//                 zero++;
//             }
//             num++;

//         } while (num<i);
//         System.out.println("Positive "+positive +" Negative "+negative+" zero "+zero);
//     }
// }

// // write a program to enter the number till the user wants and
// // at end it should display the count of positive , negative and zero;
// import java.util.Scanner;

// public class java {

//     public static void main(String[] args) {
//         countPower();
//     }

//     public static void countPower() {
//         int x , n;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter A Number : ");
//          x = obj.nextInt();
//          System.out.print("Enter A Number : ");
//          n = obj.nextInt();

//         double res;
//         res = Math.pow(x, n);
//         System.out.println(res);
//     }
// }

// // write a program to Calculate the Greatest Common Divisor Of Two number

// import java.util.Scanner;

// public class java {

//     public static void main(String[] args) {
//          System.out.print("The Value Of GCD is : "+gcd());
//     }

//     public static int gcd() {
//         int n1 , n2 , gcdValue = 0;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter A Number : ");
//          n1 = obj.nextInt();
//          System.out.print("Enter A Number : ");
//          n2 = obj.nextInt();

//         for(int i = 1; i<= n1 && i<= n2; i++){
//             if(n1%i==0 && n2%i==0){
//                 gcdValue = i;
//             }
//         }
//        return gcdValue;
//     }
// }

// // write a program to print fibbonaci seriese of n terms where n is input by user : 
// import java.util.Scanner;

// public class java {
//     static int n1 = 0 , n2 = 1 , n3;

//     public static void main(String[] args) {
//         int n;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter A Number : ");
//         n = obj.nextInt();
//         System.out.print(n1+" "+n2+" ");
//         calFibonaciSeriese(n);

//     }

//     public static int calFibonaciSeriese(int n) {

//         if(n==0){
//             return 0;
//         }

//         n3 = n1+n2;
//         n1 = n2;
//         n2 = n3;

//         System.out.print(n3+" ");
//         return calFibonaciSeriese(n-1);

//     }
// }

/**
 * Take a matrix as input  from the user search for a given number x and print
 * the indices at which occurse
 */

//  import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         int matrix[][] = new int[3][4];

//         Scanner obj = new Scanner(System.in);

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 4; j++) {
//                 System.out.print("Enter A Number : ");
//                 matrix[i][j] = obj.nextInt();
//             }
//         }

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 4; j++) {

//                 System.out.print(matrix[i][j]);
//             }
//             System.out.println();
//         }

//         System.out.print("Enter A Number For Search : ");
//         int x = obj.nextInt();

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 4; j++) {
//                 if(matrix[i][j] == x){
//                     System.out.println("The indices of x is : ("+i+","+j+")");
//                 }
//             }
//         }
//     }
// }

//  import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         int matrix[][] = new int[3][4];

//         Scanner obj = new Scanner(System.in);

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 4; j++) {
//                 System.out.print("Enter A Number : ");
//                 matrix[i][j] = obj.nextInt();
//             }
//         }

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 4; j++) {

//                 System.out.print(matrix[i][j]);
//             }
//             System.out.println();
//         }

//         System.out.print("Enter A Number For Search : ");
//         int x = obj.nextInt();

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 4; j++) {
//                 if(matrix[i][j] == x){
//                     System.out.println("The indices of x is : ("+i+","+j+")");
//                 }
//             }
//         }
//     }
// }

////////////////////  R E C U R S I O N   //////////////////////////

// /**
//  * print number from 5 to 1
//  */
// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         int n;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         n = obj.nextInt();
//         printNumber(n);
//     }

//     public static void printNumber(int n){
//         if(n==0){
//           return;
//         }
//          System.out.println(n);
//         printNumber(n-1); 

//     }
// }

// /**
//  * print number from 1 to 5
//  */
// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//         int n;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         n = obj.nextInt();
//         printNumber(n);
//     }

//     public static void printNumber(int n){
//         if(n==6){
//           return;
//         }
//          System.out.println(n);
//         printNumber(n+1); 

//     }
// }

// /**
//  * print sum of first n natural number
//  */
// import java.util.Scanner;

// public class java {

//     public static void main(String[] args) {
//         int i = 1, n, sum = 0;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         n = obj.nextInt();
//         printSum(i, n, sum);
        
//     }

//     public static void printSum(int i, int n, int sum) {

//         if(i==n){
//             sum += n;
//             System.out.println("Sum " + sum);
//             return;
//         }

//             sum += i;
//             printSum(i+1, n, sum);

//     }
// }




// /**
//  * print Factorial of n numbers
//  */
// import java.util.Scanner;

// public class java {

//     public static void main(String[] args) {
//         int n;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         n = obj.nextInt();
//         int fact = calFactorial(n);
//         System.out.println(fact);
        
//     }

//     public static int calFactorial(int n) {
//         if(n==1 || n==0){
//             return 1;
//         }

//         int fact_nm1 = calFactorial(n-1);
//         int fact_n = n*fact_nm1;   
//         return fact_n;
       
//     }
// }





/**
 * calculate the fibonacci seriese till nth terms;
 */
// public class java {
//     static int n1 = 0 , n2 = 1 , n3;

//     public static void main(String[] args) {
//         int n;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter A Number : ");
//         n = obj.nextInt();
//         System.out.print(n1+" "+n2+" ");
//         calFibonaciSeriese(n);

//     }

//     public static int calFibonaciSeriese(int n) {

//         if(n==0){
//             return 0;
//         }

//         n3 = n1+n2;
//         n1 = n2;
//         n2 = n3;

//         System.out.print(n3+" ");
//         return calFibonaciSeriese(n-1);

//     }
// }





// /**
//  * print x^n (height stack = n)
//  */
// import java.util.Scanner;

// public class java {

//     public static void main(String[] args) {
//         int x , n;
//         Scanner obj = new Scanner(System.in);
//          System.out.print("Enter the value of x : ");
//         x = obj.nextInt();
//         System.out.print("Enter the value of n : ");
//         n = obj.nextInt();
//         int pow = calPower(x , n);
//         System.out.println(pow);
        
//     }

//     public static int calPower(int x , int n) {
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }

//         int pow_nm1 = calPower(x , n-1);
//         int pow_n = x*pow_nm1;   
//         return pow_n;
       
//     }
// }





// /**
//  * print x^n (height stack = logn)
//  */
// import java.util.Scanner;

// public class java {

//     public static void main(String[] args) {
//         int x , n;
//         Scanner obj = new Scanner(System.in);
//          System.out.print("Enter the value of x : ");
//         x = obj.nextInt();
//         System.out.print("Enter the value of n : ");
//         n = obj.nextInt();
//         int pow = calPower(x , n);
//         System.out.println(pow);
        
//     }

//     public static int calPower(int x , int n) {
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }

//         if(n%2==0){
//             return calPower(x , n/2)*calPower(x , n/2);
//         }else{
//             return calPower(x , n/2)*calPower(x , n/2)*x;
//         }
//     }
// }




// /**
//  * Tower Of Hanoi
//  */
// import java.util.Scanner;

// public class java {

//     public static void main(String[] args) {
//         int n;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter the value of n : ");
//         n = obj.nextInt();
//         towerOfHanoi(n, "S", "H", "D");
        
        
//     }

//     public static void towerOfHanoi(int n , String src , String help , String dest) {
//         if(n==1){
//             System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//             return;
//         }
//         towerOfHanoi(n-1, src, dest, help);
//         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//         towerOfHanoi(n-1, help, src, dest);
        
//     }
// }




// /**
//  * Reverse A String Using Recursion
//  */
// import java.util.Scanner;

// public class java {

//     public static void main(String[] args) {
//         String str;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter A String : ");
//         str = obj.nextLine();
//         printReverseString(str, str.length()-1);
        
//     }

//     public static void printReverseString(String str , int idx) {
//         if(idx==0){
//             System.out.print(str.charAt(idx));
//             return;
//         }
        
//         System.out.print(str.charAt(idx));
//         printReverseString(str, idx-1);

        
//     }
// }



// /**
//  * Find the first and last occurance of an element in string
//  */
// import java.util.Scanner;

// public class java {

//     public static int first = -1;
//     public static int last = -1;

//     public static void main(String[] args) {
//         String str;
//         char element;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter A String : ");
//         str = obj.nextLine();
//         System.out.print("Enter That Which Character You Want to find : ");
//         element = obj.next().charAt(0);
//         findOccarance(str, 0 , element);
        
//     }

//     public static void findOccarance(String str , int idx , char element) {
//         if(idx == str.length()){
//             System.out.print("First "+first);
//             System.out.print("Last "+last);
//             return;
//         }

//         char currentChar = str.charAt(idx);

//         if(currentChar == element){
//             if(first == -1){
//                 first = idx;
//             }else{
//                 last = idx;
//             }
//         }

//         findOccarance(str, idx+1, element);
//     }
// }



// /**
//  * Check if an array is sorted (Strictly Increasing)
//  */

// public class java {

//     public static void main(String[] args) {
//        int arr[] = {1,3, 3 ,5};
//     System.out.println(isSorted(arr, 0));
//     }

//     public static boolean isSorted(int arr[] , int idx) {
//         if(idx == arr.length-1){
//             return true;
//         }

//         if(arr[idx] < arr[idx+1]){
//             return isSorted(arr, idx+1);
//         }else{
//             return false;
//         }
//     }
// }




/**
 * 
 */
// import java.util.Scanner;
// public class java {

//     public static void main(String[] args) {
//        String str;
//        Scanner obj = new Scanner(System.in);
//     System.out.println("Enter A String : ");
//     str = obj.nextLine();
//     moveAllX(str , 0 , "" , 0);
//     }

//     public static void moveAllX(String str , int idx , String newString , int count) {
        
//         if(idx == str.length()){
//             for (int i = 1; i <= count; i++) {
//             newString += 'x';
            
//             }
//             System.out.println(newString);
//             return;
//         }
        
//         char character = str.charAt(idx);
//         if(character == 'x'){
//             count++;
//              moveAllX(newString, idx+1 , newString , count);
//         }else{
//             newString += character;
//             moveAllX(newString, idx+1, newString , count);
//         }
        
        
//     }
// }




// /**
//  * java
//  */
// public class java {
//     public static void printParmutation(String str , String permutation){
//         if(str.length()==0){
//             System.err.println(permutation);
//             return;
//         }

//         for (int i = 0; i < str.length(); i++) {
//             char currChar = str.charAt(i);
//             String newStr = str.substring(0, i)+str.substring(i+1);
//             printParmutation(newStr, permutation+currChar);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "DOG";
//         printParmutation(str, "");
//     }
// }





// /**
//  * Count paths in maze to move from 0,0 to n,m;
//  */
// public class java {
//     public static int countPaths(int i , int j , int m , int n){
//         if(i==n-1&&j==m-1){
           
//             return 1;
//         }

//         if(i==n||j==m){
           
//             return 0;
//         }
        

//         int downpath = countPaths(i+1, j, m, n);
//         int rightpath = countPaths(i, j+1, m, n);

//         return downpath+rightpath;
//     }

//     public static void main(String[] args) {
//         int res = countPaths(0, 0, 3, 3);
//         System.out.println(res);
//     }
// }




// /**
//  * Count paths in maze to move from 0,0 to n,m;
//  */
// public class java {
//     public static int placeTiles(int n , int m){
//         if(n==m){
           
//             return 2;
//         }

//         if(n<m){
           
//             return 1;
//         }
        

//         int vertPlacement = placeTiles(n-m, m);
//         int horPlacement = placeTiles(n-1,m);

//         return vertPlacement+horPlacement;
//     }

//     public static void main(String[] args) {
//         int res = placeTiles(4, 2);
//         System.out.println(res);
//     }
// }




/**
 * Permutation Of String Using Recursion;
 */
public class java {
    public static void printPermutation(String str , String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            

        }
        
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i)+str.substring(i+1);
            printPermutation(newString, permutation+currChar);
            return; 
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, "");
        
    }
}




