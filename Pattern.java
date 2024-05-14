// public class Pattern {
//     public static void main(String[] args) {
//         int numRows = 7;

//         // Loop for upper part of the pattern
//         for (int i = 1; i <= numRows; i++) {
//             // Print spaces for indentation
//             for (int j = numRows - i; j > 0; j--) {
//                 System.out.print("  ");
//             }

//             // Print increasing numbers
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }

//             // Print decreasing numbers
//             for (int j = i - 1; j >= 1; j--) {
//                 System.out.print(j + " ");
//             }

//             // Move to the next line
//             System.out.println();
//         }

//         // Loop for lower part of the pattern
//         for (int i = numRows - 1; i >= 1; i--) {
//             // Print spaces for indentation
//             for (int j = numRows - i; j > 0; j--) {
//                 System.out.print("  ");
//             }

//             // Print increasing numbers
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }

//             // Print decreasing numbers
//             for (int j = i - 1; j >= 1; j--) {
//                 System.out.print(j + " ");
//             }

//             // Move to the next line
//             System.out.println();
//         }
//     }
// }

// public class Pattern
// {
// 	public static void main(String[] args) {
// 		for(int i=1; i<=5; i++){
// 		    for(int j=1; j<=i; j++){
// 		        System.out.print("*");
// 		    }

// 		    for(int l=1; l<=9; l++){
// 		        if(l>=i&&l<10-i)
// 		        System.out.print(" ");
// 		    }

// 		    for(int k=9; k>=10-i; k--){
// 		        System.out.print("*");
// 		    }
// 		    System.out.println();
// 		}
// 	}
// }

// public class Pattern
// {
// 	public static void main(String[] args) {
// 		for(int i=1; i<=5; i++){
// 		    for(int j=1; j<=5-i; j++){
// 		        System.out.print("  ");
// 		    }
// 		     for(int k=5; k>=6-i; k--){
// 		        System.out.print(" *");
// 		    }

// 		    for(int l=5; l<=3+i; l++){

// 		        System.out.print(" *");
// 		    }

// 		    System.out.println();
// 		}
// 		for(int i=1; i<=4; i++){
// 		    for(int j=1; j<=i; j++){
// 		        System.out.print("  ");
// 		    }
// 		     for(int k=5; k>=i; k--){
// 		        System.out.print(" *");
// 		    }

// 		    for(int l=1; l<=3-i; l++){

// 		        System.out.print(" *");
// 		    }

// 		    System.out.println();
// 		}
// 	}
// }

/*        *                 * 
          * *             * * 
          * * *         * * * 
          * * * *     * * * * 
          * * * * * * * * * * 
          * * * *     * * * * 
          * * *         * * *
          * *             * *
          *                 *           */

// public class Pattern
// {
// 	public static void main(String[] args) {
// 		for(int i=1; i<=5; i++){
// 		    for(int j=1; j<=i; j++){
// 		        System.out.print("* ");
// 		    }
// 		    for(int k=1; k<=9; k++){
// 		        if(k>=i&&k<=9-i){ 
// 		        System.out.print("  ");

// 		        }
// 		    }
// 		    for(int l=9; l>=10-i; l--){
// 		        System.out.print("* ");
// 		    }
// 		    System.out.println();
// 		}
// 		for(int i=1; i<=4; i++){
// 		    for(int j=1; j<=5-i; j++){
// 		        System.out.print("* ");
// 		    }
// 		    for(int k=1; k<=9; k++){
// 		        if(k<=4+i&&k>=5-i){
// 		        System.out.print("  ");

// 		        }
// 		    }
// 		    for(int l=9; l>=5+i; l--){
// 		        System.out.print("* ");
// 		    }
// 		    System.out.println();
// 		}
// 	}
// }

public class Pattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j <= 6 - i || j >= 4 + i) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j <= i || j >= 10 - i) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}