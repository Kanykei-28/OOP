package Quiz1;
import java.util.Random;
public class Customer {
    private String firstName = "";
    private String lastName = "";
    private String address = "";
    private String cardNumber = "";
    private int pin;
    private String username = "";
    private String password = "";

    public Customer(String firstName, String lastName, String address, String cardNumber, int pin, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", pin=" + pin +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void generatePassword() {
        String numeric = "1234567890";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "@#$%";
        int length = 12;

        String combined = upperCaseLetters + lowerCaseLetters + symbols + numeric;
        Random randomised = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(randomised.nextInt(lowerCaseLetters.length()));
        password[1] = upperCaseLetters.charAt(randomised.nextInt(upperCaseLetters.length()));
        password[2] = symbols.charAt(randomised.nextInt(symbols.length()));
        password[3] = numeric.charAt(randomised.nextInt(numeric.length()));

        for (int i = 4; i < length; i++) {
            password[i] = combined.charAt(randomised.nextInt(combined.length()));
        }
        String passwordNew = new String(password);
        this.setPassword(passwordNew);

    }
}
