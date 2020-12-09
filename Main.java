import java.util.Scanner;
import java.util.HashMap;

public class Main {

    private static HashMap<String, String> credentials = new HashMap<String, String>();
    private static ArrayList<Classroom> classes = new ArrayList<Classroom>(); 

    public static void main(String[] args) {

        loadCredentials();

        createTitle("Welcome to the School Board Database!");

        if (userAuth()) {
            System.out.println("voila!");
        } else {
            System.out.println("access restricted");
        }

        // delay(1000);

        // System.out.println("Test");
    }

    public static void delay(int milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void loadCredentials() {
        credentials.put("Avi", "12345");
        credentials.put("Test", "test");
        credentials.put("Admin", "Admin");
        System.out.println(credentials);

    }

    public static void createTitle(String text) {
        int textLen = text.length();

        for (int i = 0; i < textLen; i++) {
            if (i == 0)
                System.out.print("|-");
            System.out.print("-");
            if (i == textLen - 1)
                System.out.print("-|");
        }

        System.out.print("\n| " + text + " |\n");

        for (int i = 0; i < textLen; i++) {
            if (i == 0)
                System.out.print("|-");
            System.out.print("-");
            if (i == textLen - 1)
                System.out.print("-|");
        }
    }

    public static boolean userAuth() {
        System.out.println(
                "To access any of our information, you will need to login. Please enter your Username and Password below.");

        Scanner in = new Scanner(System.in);

        System.out.println("Username: ");
        String user = in.nextLine();

        if (!userExists(user)) {
            // if false:
            // sorry, user does not exist;
            System.out
                    .println("Sorry! You're profile has not been added to our collection yet. Please try again later.");
            return false;
        }

        System.out.println("Password: ");
        String pass = in.nextLine();

        int attemptCounter = 3;
        while (attemptCounter > 0) {
            if (credentials.get(user).equals(pass)) {
                return true;
            } else {
                attemptCounter--;
                System.out.println("Password was incorrect. You have " + attemptCounter + " more attempt(s).");
                delay(1000);
                System.out.println("Password: ");
                pass = in.nextLine();
            }
        }

        return false;

    }

    public static boolean userExists(String inputUser) {
        for (String user : credentials.keySet()) {
            if (inputUser.equalsIgnoreCase(user))
                return true;
        }

        return false;

    }
}