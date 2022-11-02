import java.util.HashMap;

public class PhoneMap {
    private final HashMap<Name, PhoneNumber> phoneMap = new HashMap<>();

    public void addInfo(Name name, PhoneNumber phoneNumber) {
        this.phoneMap.put(name, phoneNumber);
    }

    @Override
    public String toString() {
        return "Телефонный справочник: " +
                 phoneMap +
                '}';
    }

}
