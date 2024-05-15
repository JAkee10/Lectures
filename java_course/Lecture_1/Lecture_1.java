package java_course.Lecture_1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

import javax.swing.plaf.synth.SynthScrollBarUI;

import java_course.methods;
/**
 * Lecture_1
 */
public class Lecture_1 {

    public static void main(String[] args) throws Exception {

// ---------------------------------------------СОЗДАНИЕ_МАССИВА----------------------------------

        // int[] array = new int[10];
        // int[] array;
        // int array[];

        // array = new int[]{1, 2, 4};
        // System.out.println(array[1]);

// ---------------------------------------------СОЗДАНИЕ_И_ВЫВОД_МНОГОМЕРНОГО_МАССИВА----------------------------------

        // int[] arr[] = new int[3][5];
        // for (int[] line : arr){
        //     for (int el : line) {
        //         System.out.printf("%d", el);
        //     }
        //     System.out.println();
        // }

// --------------------------------------------СОЗДАНИЕ_И_ВЫВОД_МНОГОМЕРНОГО_МАССИВА----------------------------------
        
        // int[][] arr = new int[][]{{1, 2, 3}, {1, 2, 3}};
        
        // int[][] arr = new int[3][5];
        // for (int i = 0; i < arr.length; i++){
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.printf("%d", arr[i][j]);
        //     }
        //     System.out.println();
        // }

// ---------------------------------------------СОЗДАНИЕ_МАССИВА_МАССИВОВ----------------------------------------------------

        //     // Массив массивов
        // int[][] arrayOfArrays = new int[3][];

        //     // Инициализация каждого вложенного массива с разным размером
        // arrayOfArrays[0] = new int[] {1, 2};
        // arrayOfArrays[1] = new int[4];
        // arrayOfArrays[2] = new int[3];

        //     // Заполнение значений
        // arrayOfArrays[1][0] = 3;
        // arrayOfArrays[1][1] = 4;
        // arrayOfArrays[1][2] = 5;
        // arrayOfArrays[1][3] = 6;

        // arrayOfArrays[2][0] = 7;
        // arrayOfArrays[2][1] = 8;
        // arrayOfArrays[2][2] = 9;

        //    //  Вывод массива 
        // for (int i = 0; i < arrayOfArrays.length; i++){
        //     for (int j = 0; j < arrayOfArrays[i].length; j++) {
        //         System.out.printf("%d", arrayOfArrays[i][j]);
        //     }
        //     System.out.println();
        // }

// ----------------------------------------СОЗДАНИЕ_МНОГОМЕРНОГО_МАССИВА----------------------------------------------------

        //     // Многомерный массив
        // int[][] multiDimensionalArray = new int[3][4];

        //     // Заполнение значений
        // for (int i = 0; i < multiDimensionalArray.length; i++) {
        //     for (int j = 0; j < multiDimensionalArray[i].length; j++) {
        //         multiDimensionalArray[i][j] = i * 4 + j + 1;
        //     }
        // }

        //    //  Вывод массива 
        // for (int[] line : multiDimensionalArray){
        //     for (int el : line) {
        //         System.out.printf("%d", el);
        //     }
        //     System.out.println();
        // }

// -----------------------------------------ПРЕОБРАЗОВАНИЕ_ТИПОВ_ДАННЫХ----------------------------------------------------

        //     // Неявная конвертация
        // int i = 5; 
        // double d = i;
        // System.out.println(d);

        //     // Явная конвертация (числа в число)
        // double d1 = 2.3;
        // int i1 = (int) d1;
        // System.out.println(i1);
        
        //     //  Явная конвертация (текст в число и наоборот)
        // String s = "127"; // "1234" - выдаст ошибку
        // byte b = Byte.parseByte(s);
        // System.out.println(b);
        
// -----------------------------------------РАБОТА_С_ТЕРМИНАЛОМ_И_ФОРМАТИРОВАНИЕ----------------------------------------------------

        // import java.util.Scanner (ОБЯЗАТЕЛЬНО!)
        
        //     // Получение данных из терминала (строка)
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Name: ");
        // String name = iScanner.nextLine();
        // System.out.println("Hello " + name + "!");
        // System.out.printf("Hello %s!", name);

        //     // Получение данных из терминала (числовое значение)
        // System.out.println();
        // System.out.printf("Integer: ");
        //     // Проверка на соответствие получаемого типа (с помощью метода hasNext)
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int num = iScanner.nextInt();
        // System.out.println(num);

        //     // Немного форматирования
        // System.out.printf("Double: ");
        // double d = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f %s %b", num, d, num + d, "it's", true);

        //     // Закрытие экземпляра (ОБЯЗАТЕЛЬНО!)
        // iScanner.close();
        
// -----------------------------------------_----------------------------------------------------

        // int a = 7;
        // int b = 9;
        // int c;
        // if (a>b) c = a;
        // else c = b;
        // System.out.println(c);

        // int min = a < b ? a : b;
        // System.out.println(min);

        // int val = 321;
        // int count = 0;
        // while (val != 0){
        //     val /= 10;
        //     count++;
        // }
        // System.out.println(count + " " + val);
    
// -----------------------------------------КОНКАТЕНАЦИЯ_СТРОК----------------------------------------------------
    
        //     // Не очень хороший вариант
        // String str = "123";
        // int num = 456;
        // String result = str + num;
        // System.out.printf("%s", result);
            
            // Хороший вариант
        // StringBuilder strBuilder = new StringBuilder();
        // for (int i = 0; i < 25; i++) {
        //     strBuilder.append(Integer.toString(i)).append(" ");
        // }
        // System.out.println(strBuilder);

                // ЛОМАНАЯ СТРОКА(((((((
        // System.out.println(methods.getType("dsds"));

// -----------------------------------------ПРОСТОЙ_КАЛЬКУЛЯТОР----------------------------------------------------
    
// Введите первое число: 10
// Введите второе число: 5
// Выберите операцию (+, -, *, /): +
// Результат: 15
        


        // methods.clear();
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Number 1 is : ");
        // boolean isDouble = iScanner.hasNextDouble();
        // double num1 = isDouble ? iScanner.nextDouble() : 0;
        // System.out.printf("Operation (+, -, *, /) : ");
        // String operator = iScanner.next();
        // System.out.printf("Number 2 is : ");
        // isDouble = iScanner.hasNextDouble();
        // double num2 = isDouble ? iScanner.nextDouble() : 0;
        // iScanner.close();
        // switch (operator) {
        //     case "+":
        //     case "-":
        //     case "*":
        //     case "/":
        //         System.out.printf("%.0f %s %.0f = ", num1, operator, num2);
        //         switch (operator) {
        //             case "+":
        //                 System.out.println(num1 + num2);
        //                 break;
        //             case "-":
        //                 System.out.println(num1 - num2);
        //                 break;
        //             case "*":
        //                 System.out.println(num1 * num2);
        //                 break;
        //             case "/":
        //                 if (num2 != 0) 
        //                     System.out.println(num1 / num2);
        //                 else 
        //                     System.out.println("Devision by zero!");
        //                 break;
        //         }
        //         break;
        //     default:
        //         System.out.println("Incorrect operator!");
        //         break;
        // }
        


// -----------------------------------------РАБОТА_С_ФАЙЛАМИ----------------------------------------------------

// -------------------------------------СОЗДАНИЕ_И_ЗАПИСЬ/ДОЗАПИСЬ----------------------------------------------------

                // import java.io.* (ОБЯЗАТЕЛЬНО!)(Можно java.io.выборочно)
        
        //     try (FileWriter fw = new FileWriter("testFile.txt", false)) {
        //     PrintWriter fw = new PrintWriter(System.out, false);
        //     FileWriter fw = new FileWriter("testFile.txt", false);
        //     fw.write("Line 1");
        //     fw.append("\n");
        //     fw.append("Line 2");
        //     fw.write("Line 3");
        //     fw.write(" Hello");
        //     fw.flush();
        //     fw.close();

        // } catch (IOException ex) {
        //     System.out.println(ex.getMessage());
        // }


                    // Вывод содержимого файла в терминал 

        // try {
        //     List<String> lines = Files.readAllLines(Paths.get("testFile.txt"));
        //     for (String line : lines) {
        //         System.out.println(line);
        //     }
        // } catch (IOException ex) {
        //     System.out.println(ex.getMessage());
        // }

// -----------------------------------------ЧТЕНИЕ_ФАЙЛА_ПОСИМВОЛЬНО----------------------------------------------------

        // FileReader fr = new FileReader("testFile.txt");
        // int c;  // c будет равен индексу char
        // while ((c = fr.read()) != -1) {
        //     char ch = (char)c;
        //     System.out.print(ch);
        // }
        // fr.close();

        // // System.out.printf("%s%s%s%s", (char)76, (char)105, (char)110, (char)101);


// -----------------------------------------ЧТЕНИЕ_ФАЙЛА_ПОСТРОЧНО----------------------------------------------------

        // System.out.println("\n");

        // BufferedReader br = new BufferedReader(new FileReader("testFile.txt"));
        // String str;
        // while ((str = br.readLine()) != null) {
        //     System.out.printf("== %s ==%n", str);            
        // }
        // br.close();





// -----------------------------------------САМОСТОЯТЕЛЬНАЯ_РАБОТА_1----------------------------------------------------

//         methods.clear();
        
//         int k = 10;                                                                                      // Коэфицент
//         int filesCount = k; // TODO: исправить корреляцию!
//         String textResult = "123456";
//         for (int j = 0; j < filesCount; j++){
//         // while (true){
//             textResult = methods.getPolynomial(k, true, null, 101);
//             System.out.println(textResult);
           
        

// // -----------------------------------------САМОСТОЯТЕЛЬНАЯ_РАБОТА_2----------------------------------------------------

//                 // Запись многочленов в файлы
//             FileWriter fw = new FileWriter(String.format("file_%d.txt", j));
//             fw.write(textResult);
//             fw.close();
//         }

//         String[][] polynomial = new String[filesCount][k + 1];
//         String[][] tempPolynomial = new String[filesCount][];

//         String str = "";

//         for (int i = 0; i < filesCount; i++) {
//             BufferedReader br = new BufferedReader(new FileReader(String.format("file_%d.txt", i)));
//             tempPolynomial[i] = br.readLine().split(" \\+ ");
//             for (int j = 0; j < tempPolynomial[i].length; j++) {
//                 polynomial[i][Integer.parseInt(tempPolynomial[i][j].substring(tempPolynomial[i][j].length() - 1))] = tempPolynomial[i][j];
//             }
//             for (int j = 0; j < polynomial[i].length; j++) {
//                 if (polynomial[i][j] == null) {
//                     polynomial[i][j] = "0";                    
//                 }
//                 // System.out.println(polynomial[i][j]);
//             }
//             if (polynomial[i][0].contains("x")) {
//                 String cutted = polynomial[i][0].substring(0, polynomial[i][0].length() - 4);
//                 polynomial[i][Integer.parseInt(cutted.substring(cutted.length() - 1))] = cutted;
//                 polynomial[i][0] = "0";
//             }
//         }

//         int[] digits = new int[k + 1];

//         for (int j = k; j >= 0; j--) {
//                 int sum = 0;
//             for (int i = 0; i != polynomial.length; i++) {
                    
//                 String sumString = "0";
//                 int sumInt = 0;

//                 for (int j2 = 0; j2 < polynomial[i][j].length(); j2++) {               // Поиск числа посимвольно + запись в sumString 
//                     if (j2 == polynomial[i][j].length() - 1) {
//                         sumString = polynomial[i][j];
//                     }
//                     else if (!Character.isDigit(polynomial[i][j].charAt(j2))) {
//                         sumString = polynomial[i][j].substring(0, j2);
//                         break;
//                     }
//                 }
//                 sumInt = Integer.parseInt(sumString);
//                 sum += sumInt;
//             }
//             digits[polynomial.length - j] = sum;
//         }



//         System.out.println("            =");
//         String result = methods.getPolynomial(k, false, digits, 0);

//         FileWriter fw = new FileWriter("summary.txt", false);
//         fw.write(result);
//         fw.close();


    
//=======================================================================================================================================================
//============================================================LECTURE_2==================================================================================
//=======================================================================================================================================================

        // methods.clear();
        // long startTime = System.currentTimeMillis();
        // StringBuilder strBuilder = new StringBuilder();
        // for (int i = 0; i < 1_000_000; i++) {
        //     strBuilder.append("+");
        // }
        // String str = strBuilder.toString();
        // // System.out.println(str);
        // System.out.println(System.currentTimeMillis() - startTime);

        
        // String str1 = "abc";        
        // String str2 = "abe";
        // int result = str1.compareTo(str2);      // Сравнивает строки по-символьно. a = 1, b = 2, c = 3... "abc".compareTo("abe") => -2 (c = 3, e = 5) => 3-5 = -2
        // System.out.println(result);

    }
}