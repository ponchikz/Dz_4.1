package Zadanie2;

public class MainClass {

    public static void main(String[] args) {
        PhoneTableClass phoneTableClass = new PhoneTableClass();
        phoneTableClass.add("+9149112233","������");
        phoneTableClass.add("+9149554499","�����");
        phoneTableClass.add("+9149439966","��������");
        phoneTableClass.add("+9149778866","��������");
        phoneTableClass.add("+9999886375","�������");
        phoneTableClass.add("+9998877442","����");
        phoneTableClass.add("+5566444655","��������");
        phoneTableClass.add("+9926863785","������" );
        phoneTableClass.add("+9997877442","����");
        phoneTableClass.add("+9958877442","����");
        phoneTableClass.add("+9726863785","������" );
        phoneTableClass.add("+9626863785","������" );


        System.out.println(phoneTableClass.getFio("����"));
    }
}