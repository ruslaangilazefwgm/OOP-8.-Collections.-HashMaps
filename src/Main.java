import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneMap phoneMap = new PhoneMap();
        phoneMap.addInfo(new Name("Травкина А.А"), new PhoneNumber("5452525422"));
        phoneMap.addInfo(new Name("Травкин А.А"), new PhoneNumber("697235752"));
        phoneMap.addInfo(new Name("Почвина А.А"), new PhoneNumber("77537525725"));
        phoneMap.addInfo(new Name("Почвин А.А"), new PhoneNumber("46456545"));
        phoneMap.addInfo(new Name("Грунтова А.А"), new PhoneNumber("8757875"));
        phoneMap.addInfo(new Name("Грунтов А.А"), new PhoneNumber("2542452454"));
        phoneMap.addInfo(new Name("Землероева А.А"), new PhoneNumber("363664"));
        phoneMap.addInfo(new Name("Землероев А.А"), new PhoneNumber("5785587"));
        phoneMap.addInfo(new Name("Червякова А.А"), new PhoneNumber("245245"));
        phoneMap.addInfo(new Name("Червяков А.А"), new PhoneNumber("5785"));
        phoneMap.addInfo(new Name("Бананова А.А"), new PhoneNumber("38863"));
        phoneMap.addInfo(new Name("Бананов А.А"), new PhoneNumber("54245"));
        phoneMap.addInfo(new Name("Огурцова А.А"), new PhoneNumber("78578"));
        phoneMap.addInfo(new Name("гурцов А.АО"), new PhoneNumber("24524"));
        phoneMap.addInfo(new Name("Помидорова А.А"), new PhoneNumber("27527"));
        phoneMap.addInfo(new Name("Помидоров А.А"), new PhoneNumber("25775275"));


        Map1 map1 = new Map1();     ////////////// Домашняя работа 1. Задание 3
        map1.addMap("str1", 2);
        map1.addMap("str2", 1);
        map1.addMap("str1", 5);
        System.out.println(map1);

        Map2 map2 = new Map2();     /////////////// Домашняя работа 2. Задание 1
        List list1 = new List();
        List list2 = new List();
        List list3 = new List();
        List list4 = new List();
        List list5 = new List();

        list1.addList();
        list2.addList();
        list3.addList();
        list4.addList();
        list5.addList();

        map2.addMap2("s1", list1);
        map2.addMap2("s2", list2);
        map2.addMap2("s3", list3);
        map2.addMap2("s4", list4);
        map2.addMap2("s5", list5);
        System.out.println(map2);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("s1", list1.getSum());
        map3.put("s2", list2.getSum());
        map3.put("s3", list3.getSum());
        map3.put("s4", list4.getSum());
        map3.put("s5", list5.getSum());
        System.out.println(map3);


        Map<Integer, String> map4 = new LinkedHashMap<>();   //////////Домашнее Задание 2. Задача 2
        map4.put(1, "str1");
        map4.put(2, "str2");
        map4.put(3, "str3");
        map4.put(4, "str4");
        map4.put(5, "str5");
        map4.put(6, "str6");
        map4.put(7, "str7");
        map4.put(8, "str8");
        map4.put(9, "str9");
        map4.put(10, "str10");
        System.out.println(map4);

    }
}