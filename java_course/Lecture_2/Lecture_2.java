package java_course.Lecture_2;
/*
 * Lecture 2
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        List<Integer> checkList = Arrays.asList(8, 7);
        int index = list.size();
        for (int i = 0; i < 10; i++) {
            list.add(index, i);
        }

        System.err.println(list.toString());
        System.out.println(list.contains(checkList));
        
        getType(checkList);
    }
    static void getType(Object o) {
        System.out.println(o.getClass().getName());
    }
}
