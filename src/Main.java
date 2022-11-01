import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        Map<String, List<Integer>> map2 = new HashMap<>();
        map2.put("str1",List.of(1,2,3));
        map2.put("str2",List.of(4,5,6));
        map2.put("str3",List.of(7,8,9));
        map2.put("str4",List.of(1,5,8));
        map2.put("str5",List.of(9,3,4));
        System.out.println(map2);


        Map<String, Integer> map3 = new HashMap<>();



    }
}