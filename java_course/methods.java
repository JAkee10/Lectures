package java_course;
import java.io.*;
import java.util.Random;
public class methods {
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }

    static void clear(){
        System.out.print("\033[H\033[2J");
    }

    // static String getPolynomial(int k, int filesCount, boolean isNew, int[] polys) {

    //     Random rand = new Random();
    //     String result = "123456";
    //     for (int j = 0; j < filesCount; j++){
    //         // while (true){
    //         result = "";                                                                                    // Очистка результата
    //         int[] equation = new int[k];                                                                    // Создание массива членов многочлена
            
            
    //         if (isNew) {
    //             for (int i = 0; i < k; i++) {
    //                 equation[i] = rand.nextInt(101);                                                    
    //             }
    //         } else {
    //             equation = polys;
    //         }

            
    //         for (int i = 0; i < k; i++) {                                                               // Заполнение и форматирование текста
    //             int temp;
    //             result += k - i != 1 ?                                                                  
    //                 equation[i] != 0 ?                                                              //T
    //                     String.format("%d*x^%d + ", equation[i], k - i) :                    //TT
    //                 String.format("") :                                                      //TF
    //             equation[i] != 0 ?                                                                  //F
    //                 (temp = rand.nextInt(101)) != 0 ?                                         //FT
    //                     String.format("%d*x^%d + %d = 0", equation[i], k - i, temp) :        //FTT
    //                 String.format("%d*x^%d = 0", equation[i], k - i) :                       //FTF
    //             (temp = rand.nextInt(101)) != 0 ?                                             //FF
    //                 String.format("%d = 0", temp) :                                          //FFT
    //             String.format("= 0");                                                        //FFF
    //         // НЕ ОБРАЩАТЬ ВНИМАНИЕ НА ЭТУ СТРОКУ!!!                               //T               //TT                                                          //TF                       //F                //FT                                  //FTT                                                                    //FTF                                                        //FF                                 //FFT                                  //FFF
    //         }
    //         int index = result.lastIndexOf("+") + 2;                                                // Запись индекса символа, через 1 от последнего знака '+'
    //         if (result.charAt(index) == '=') 
    //             result = result.replace(" + ", " ");                                              // Поиск и замена последовательности " + " на " "
    //         switch (result.charAt(0)) {                                                           // Форматирование некорректного вывода
    //             case '=':                       // Case: = 0
    //                         result = "x " + result;
    //                         break;
    //             case '0':                       // Case: 0 = 0
    //                         result = result.replace('0', 'x');
    //                         break;
    //             default:                        // Case: number(1-100) = 0
    //                         String a = result.split(" ")[0];
    //                         result = a.length() < 5 ? String.format("x = %s", a) : result;
    //                         break;
    //         }
    //         // System.out.printf("%s%n", result);
        

    // // ----------------------------------------САМОСТОЯТЕЛЬНАЯ_РАБОТА_2----------------------------------------------------

    //             // Запись многочленов в файлы
    //         // FileWriter fw = new FileWriter(String.format("file_%d.txt", j));
    //         // fw.write(result);
    //         // fw.close();
    //     }
    //     return result;

    // }
    
    static String getPolynomial(int k, boolean isNew, int[] argPolys, int randomBound) {
        String result = "";
        int size = k + 1;
        int[] polys;

        if (isNew) {
            Random rand = new Random();
            int[] equation = new int[size];
            for (int i = 0; i < equation.length; i++) {
                equation[i] = rand.nextInt(randomBound);
            }

            polys = equation;
        } else {
            polys = argPolys;
        }

        for (int i = 0; i < size; i++) {
            result += 
            (size - i != 1) ? 
                (polys[i] != 0) ? 
                    String.format("%d*x^%d + ", polys[i], k - i) : 
                String.format("") :
            (polys[i] != 0) ?
                (k - i != 0) ?
                    String.format("%d*x^%d = 0", polys[i], k - i) :
                String.format("%d = 0", polys[i]) :
            String.format("= 0");
        }
        
        int index = result.lastIndexOf("+") + 2;                                            
        if (result.charAt(index) == '=') result = result.replace(" + =", " =");
        switch (result.charAt(0)) {                                                       
            case '=':                       // Case: = 0
                        result = "x " + result;
                        break;
            case '0':                       // Case: 0 = 0
                        result = result.replace('0', 'x');
                        break;
            default:                        // Case: number(1-100) = 0
                        String a = result.split(" ")[0];
                        result = a.length() < 5 ? String.format("x = %s", a) : result;
                        break;
        }

        return result;
    }



    public static void main(String[] args) {
        int[] arr = new int[] {43, 97, 116};
        System.out.println(getPolynomial(2, false, arr, 101));
    }

}



 // result = "";                                                                                    // Очистка результата
            // int[] equation = new int[k];                                                                    // Создание массива членов многочлена
                
            //     for (int i = 0; i < k; i++) {                                                               // Заполнение и форматирование текста
            //             int temp;
            //             equation[i] = rand.nextInt(101);                                                    
            //             result += k - i != 1 ?                                                                  
            //                 equation[i] != 0 ?                                                              //T
            //                     String.format("%d*x^%d + ", equation[i], k - i) :                    //TT
            //                 String.format("") :                                                      //TF
            //             equation[i] != 0 ?                                                                  //F
            //                 (temp = rand.nextInt(101)) != 0 ?                                         //FT
            //                     String.format("%d*x^%d + %d = 0", equation[i], k - i, temp) :        //FTT
            //                 String.format("%d*x^%d = 0", equation[i], k - i) :                       //FTF
            //             (temp = rand.nextInt(101)) != 0 ?                                             //FF
            //                 String.format("%d = 0", temp) :                                          //FFT
            //             String.format("= 0");                                                        //FFF
            //     // НЕ ОБРАЩАТЬ ВНИМАНИЕ НА ЭТУ СТРОКУ!!!                               //T               //TT                                                          //TF                       //F                //FT                                  //FTT                                                                    //FTF                                                        //FF                                 //FFT                                  //FFF
            //     }

            //     int index = result.lastIndexOf("+") + 2;                                                // Запись индекса символа, через 1 от последнего знака '+'
            //     if (result.charAt(index) == '=') result = result.replace(" + ", " ");    // Поиск и замена последовательности " + " на " "
            //     switch (result.charAt(0)) {                                                           // Форматирование некорректного вывода
            //         case '=':                       // Case: = 0
            //                     result = "x " + result;
            //                     break;
            //         case '0':                       // Case: 0 = 0
            //                     result = result.replace('0', 'x');
            //                     break;
            //         default:                        // Case: number(1-100) = 0
            //                     String a = result.split(" ")[0];
            //                     result = a.length() < 5 ? String.format("x = %s", a) : result;
            //                     break;
            //     }
            //     System.out.printf("%s%n", result);