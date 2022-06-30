package Zadznie1;

import java.util.*;

public class MainClass {
    public static List<String> List = Arrays.asList("Дом", "Работа", "Забор", "Машина","Кирпич",
            "Кирпич", "Завод", "Машина","Кирпич", "Ключ");

    public static void main(String[] args) {

        System.out.println(List);
        System.out.println("Колличество слов = " + List.size() + '\n');

        Set<String> set = new HashSet<>(List);
        System.out.println(set);

        HashSet<String> targetSet = new HashSet<>(List) ;
        System.out.println("Колличесто не повторяющихся слов = " + targetSet.size());


        HashMap<String, Integer> result = new HashMap<>();
        for (String str : targetSet) {
            result.put(str, count(str));
        }

        System.out.println(result);
    }
    public static Integer count(String str){
        Integer result = 0;
        for(String strThis : List){
            if(strThis.equals(str)) result++;
        }
        return result;
    }
}