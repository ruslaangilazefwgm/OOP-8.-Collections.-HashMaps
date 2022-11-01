public class PhineNumber {
    private final String phoneNumber;

    public PhineNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return " Номер: " +
                  phoneNumber  +
                '}';
    }
}
