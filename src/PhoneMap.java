import java.util.HashMap;

public class PhoneMap {
    private final HashMap<Name, PhineNumber> phoneMap = new HashMap<>();

    public void addInfo(Name name, PhineNumber phineNumber) {
        this.phoneMap.put(name, phineNumber);
    }

    @Override
    public String toString() {
        return "Телефонный справочник: " +
                 phoneMap +
                '}';
    }

}
