package java_homework_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task_1 {
    
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Pechkov", 12385646, bookPhone);
        addNumber("Pechkov", 1234, bookPhone);
        addNumber("Mask", 1324546, bookPhone);
        addNumber("Bezos", 448654222, bookPhone);
        addNumber("Pechkov", 875432121, bookPhone);
        addNumber("Mask", 999554842, bookPhone);
        printBook(bookPhone);
       }
    
}
