package java_course;
import java_course.*;
/**
 * Lecture_1
 */
public class Lecture_1 {

    public static void main(String[] args) {

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
        System.out.println(methods.getType("dsds"));
    }
}