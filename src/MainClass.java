
/**
 * Lesson_2 JAVACORE
 * @version 8.01 2019
 * @author KYURKCHU ALEKSANDR
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MainClass {
    public static void main(String[] arg){

        testString();
       System.out.println();
       System.out.println();
       testBook();
    }


    public static void testBook(){

        LinkedHashMap<String,String> testbook = new LinkedHashMap<>();

        TelephonBook book = new TelephonBook(testbook);

        book.add("Петров","079556678");
        book.add("Петров","079556679");
        book.add("Иванов","079556671");
        book.add("Сидоров","0795566713");

        book.display();

        System.out.println();
        System.out.println();

        book.get("Петров");

    }
    public static void testString(){

        ArrayList<String> str1 = new ArrayList<>();
        HashMap<String,Integer>  str3 = new HashMap<>() ;

        str1.add("Альфа");
        str1.add("Бера");
        str1.add("Альфа");
        str1.add("Гамма");
        str1.add("Гера");
        str1.add("Вера");
        str1.add("Алоэ");
        str1.add("Блаон");
        str1.add("Сигма");
        str1.add("Альфа");
        str1.add("Плуан");
        str1.add("Остер");
        str1.add("Блаон");
        str1.add("Карэт");
        str1.add("Гера");
        str1.add("Плуан");
        str1.add("Гамма");
        str1.add("Гамма");
        str1.add("Алоэ");

        System.out.println("Начальное состояние массива:  ");
        System.out.println(str1);

        for(int i = 0; i < str1.size();i++){
            String temp;
            int count = 0;

            temp  = str1.get(i);

            for(int k = 0; k < str1.size();k++){

                if (str1.get(k).equals(temp))
                    count++;
            }
            str3.put(temp,count);
        }
        System.out.println();
        System.out.println();
        System.out.println("Уникальные значения и сколько раз встречаются:");
        System.out.println((str3));

    }
}

