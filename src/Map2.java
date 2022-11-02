import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Map2 {
    private final HashMap<String, List> map = new HashMap<>();

    public void addMap2(String s, List list) {
            this.map.put(s, list );
    }

    @Override
    public String toString() {
        return String.format("Map2: " + map);

    }

}
