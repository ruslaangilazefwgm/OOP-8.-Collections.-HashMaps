import java.util.HashMap;

public class Map1 {        ////////////// Домашняя работа 1. Задание 3
    private final HashMap<String, Integer > map = new HashMap<>();
    public void addMap(String s, int i) {
        if (map.containsKey(s) && map.containsValue(i)) {
            throw new AddException("Значения совпадают");
        }
        else {
            this.map.put(s, i);
        }
    }

    @Override
    public String toString() {
        return String.format("Map1: " + map);

    }
}

