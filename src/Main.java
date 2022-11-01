import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneMap phoneMap = new PhoneMap();
        phoneMap.addInfo(new Name("Травкина А.А"), new PhineNumber("5452525422"));
        phoneMap.addInfo(new Name("Травкин А.А"), new PhineNumber("697235752"));
        phoneMap.addInfo(new Name("Почвина А.А"), new PhineNumber("77537525725"));
        phoneMap.addInfo(new Name("Почвин А.А"), new PhineNumber("46456545"));
        phoneMap.addInfo(new Name("Грунтова А.А"), new PhineNumber("8757875"));
        phoneMap.addInfo(new Name("Грунтов А.А"), new PhineNumber("2542452454"));
        phoneMap.addInfo(new Name("Землероева А.А"), new PhineNumber("363664"));
        phoneMap.addInfo(new Name("Землероев А.А"), new PhineNumber("5785587"));
        phoneMap.addInfo(new Name("Червякова А.А"), new PhineNumber("245245"));
        phoneMap.addInfo(new Name("Червяков А.А"), new PhineNumber("5785"));
        phoneMap.addInfo(new Name("Бананова А.А"), new PhineNumber("38863"));
        phoneMap.addInfo(new Name("Бананов А.А"), new PhineNumber("54245"));
        phoneMap.addInfo(new Name("Огурцова А.А"), new PhineNumber("78578"));
        phoneMap.addInfo(new Name("гурцов А.АО"), new PhineNumber("24524"));
        phoneMap.addInfo(new Name("Помидорова А.А"), new PhineNumber("27527"));
        phoneMap.addInfo(new Name("Помидоров А.А"), new PhineNumber("25775275"));


        Map1 map1 = new Map1();     ////////////// Домашняя работа 1. Задание 3
        map1.addMap("str1", 2);
        map1.addMap("str2", 1);
        map1.addMap("str1", 5);
        System.out.println(map1);

        Map<String, List<Integer>> map2 = new HashMap<>();     /////////////// Домашняя работа 2. Задание 1
        List<Integer> list1 = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            list1.add(random.nextInt(9));
        }

        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            list2.add(random.nextInt(9));
        }

        List<Integer> list3 = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            list3.add(random.nextInt(9));
        }

        List<Integer> list4 = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            list4.add(random.nextInt(9));
        }

        List<Integer> list5 = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            list5.add(random.nextInt(9));
        }

        map2.put("str1",list1);
        map2.put("str2",list2);
        map2.put("str3",list3);
        map2.put("str4",list4);
        map2.put("str5",list5);
        System.out.println(map2);

        int sum1 = getSum(list1);
        int sum2 = getSum(list2);
        int sum3 = getSum(list3);
        int sum4 = getSum(list4);
        int sum5 = getSum(list5);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("Str1", sum1);
        map3.put("Str2", sum2);
        map3.put("Str3", sum3);
        map3.put("Str4", sum4);
        map3.put("Str5", sum5);
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

    public static int getSum(List<Integer> nums) {   //////// для ДЗ2.1.
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }
}