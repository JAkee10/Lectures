package java_course;
import java_course.methods;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        String[][] arr = new String[][] {{"100 = 0", "56*x^1", "0"}, 
                                         {"16 = 0", "41*x^1", "43*x^2"}};
        int k = 2;

        int[] digits = new int[k + 1];

        for (int j = k; j >= 0; j--) {
                int sum = 0;
            for (int i = 0; i != arr.length; i++) {
                    
                String sumString = "0";
                int sumInt = 0;

                for (int j2 = 0; j2 < arr[i][j].length(); j2++) {               // Поиск числа посимвольно + запись в sumString 
                    if (j2 == arr[i][j].length() - 1) {
                        sumString = arr[i][j];
                    }
                    else if (!Character.isDigit(arr[i][j].charAt(j2))) {
                        sumString = arr[i][j].substring(0, j2);
                        break;
                    }
                }
                sumInt = Integer.parseInt(sumString);
                sum += sumInt;
                // System.out.print(sumInt + "");
                
            }

            digits[arr.length - j] = sum;

        }
        

        System.out.println(methods.getPolynomial(k, false, digits, 101));
    }
}





// String[][] polynomial = new String[filesCount][k + 1];
//         String[][] tempPolynomial = new String[filesCount][];

//         String str;

//         for (int i = 0; i < filesCount; i++) {
//             BufferedReader br = new BufferedReader(new FileReader(String.format("file_%d.txt", i)));
//             tempPolynomial[i] = br.readLine().split(" \\+ ");
//             for (int j = 0; j < tempPolynomial[i].length; j++) {
//                 if (tempPolynomial[i][j] != null) {
//                     polynomial[i][Integer.parseInt(tempPolynomial[i][j].substring(tempPolynomial[i][j].length() - 1))] = tempPolynomial[i][j];
//                 }
//                 else {
//                     polynomial[i][j] = "0";
//                     System.out.println(polynomial[i][j]);
//                     System.out.println("YES");
//                 }
//                 // System.out.println(tempPolynomial[i][j]);
//                 // int ind = tempPolynomial[i][j];
//             }
//         }
//         System.out.println(tempPolynomial[0][0]);
//         System.out.println(tempPolynomial[0][1]);
//         // tempPolynomial[0][2] = "323 = 0";
//         // // System.out.println(tempPolynomial[0][2]);
//         System.out.println(tempPolynomial[1][0]);
//         System.out.println(tempPolynomial[1][1]);
//         System.out.println(tempPolynomial[1][2]);




