package Zadanie2;

public class MainClass {

    public static void main(String[] args) {
        PhoneTableClass phoneTableClass = new PhoneTableClass();
        phoneTableClass.add("+9149112233","Громов");
        phoneTableClass.add("+9149554499","Дрозд");
        phoneTableClass.add("+9149439966","Бабушкин");
        phoneTableClass.add("+9149778866","Бабушкин");
        phoneTableClass.add("+9999886375","Абрамов");
        phoneTableClass.add("+9998877442","Шпет");
        phoneTableClass.add("+5566444655","Васильев");
        phoneTableClass.add("+9926863785","Петров" );
        phoneTableClass.add("+9997877442","Шпет");
        phoneTableClass.add("+9958877442","Шпет");
        phoneTableClass.add("+9726863785","Петров" );
        phoneTableClass.add("+9626863785","Петров" );


        System.out.println(phoneTableClass.getFio("Шпет"));
    }
}