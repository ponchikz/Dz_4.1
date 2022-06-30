package Zadanie2;

import java.util.HashMap;

public class PhoneTableClass {

    private HashMap<String,String> stringStringHashMap = new HashMap<>();

    public void add(String phone, String fio){
        stringStringHashMap.put(phone,fio);
    }
    public String getFio(String fio){
        if(stringStringHashMap.containsValue(fio)){
            String result = "Телефонный номер - ";
            for(String key: stringStringHashMap.keySet()){
                if(stringStringHashMap.get(key).equals(fio)) result += key + "; ";
            }
            return result;
        } else return "Такого нет";
    }

}
