import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        HashMap<String, String> userDatabase = loadUserDatabase("tp1/data/user_hashpwd.csv");
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            if (userDatabase.containsKey(username)) {
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                String hashedPassword = Password.hashPassword(password);

                if (hashedPassword.equals(userDatabase.get(username))) {
                    System.out.println("Login successful!");
                    break;
                } else {
                    System.out.println("Invalid password. Try again.");
                }
            } else {
                System.out.println("Username not found. Try again.");
            }
        }
        scanner.close();
    }
        
    

    /**
     * Loads a user database from a CSV file.
     * The CSV file is expected to have two columns: username and hashed password.
     * 
     * @param filename The path to the CSV file containing user data.
     * @return A HashMap where keys are usernames and values are hashed passwords.
     * 
     * @throws IOException If an error occurs while reading the file.
     */
    public static HashMap<String, String> loadUserDatabase(String filename) {
        HashMap<String, String> userDatabase = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    userDatabase.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
        return userDatabase;
    }
}
