package Midterm;
public class AuthorDriver {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
        System.out.println(ahTeck);  // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com");  // Test setter
        System.out.println("name: " + ahTeck.getName());     // Test getter
        System.out.println("email: " + ahTeck.getEmail());   // Test getter
        System.out.println("gender: " + ahTeck.getGender()); // Test gExerciseOOP_MyPolynomial.pngetter
    }
}