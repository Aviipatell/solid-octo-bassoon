import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {

    private static HashMap<String, String> credentials = new HashMap<String, String>();
    private static ArrayList<Classroom> classes = new ArrayList<Classroom>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        loadCredentials();

        createTitle("Welcome to the School Board Database!");

        if (!userAuth()) {
            System.out.println("Access Restricted.");
            return;
        }

        int classroomChoice = presentClassroomOptions(in);

        classroomAction(in, classroomChoice);

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

        System.out.print("Username: ");
        String user = in.nextLine();

        delay(1000);

        if (!userExists(user)) {
            // sorry, user does not exist;
            return false;
        }

        System.out.print("Password: ");
        String pass = in.nextLine();

        int attemptCounter = 3;
        while (attemptCounter > 0) {
            if (credentials.get(user).equals(pass)) {
                return true;
            } else {
                attemptCounter--;
                delay(1000);
                System.out.println("Password was incorrect. You have " + attemptCounter + " more attempt(s).");
                delay(1000);
                System.out.print("Password: ");
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

    public static int presentClassroomOptions(Scanner in) {

        System.out.println("Welcome! What would you like to do today?");
        System.out.println("1. Add Classroom\n2. Remove Classroom\n3. View Classrooms");
        System.out.print("> ");
        int classroomChoice = in.nextInt();

        while (!(classroomChoice > 0 && classroomChoice < 4)) {
            delay(1000);
            System.out.println("Invalid option. Please try again!");
            delay(1000);
            System.out.println("1. Add Classroom\n2. Remove Classroom\n3. View Classrooms");
            System.out.print("> ");
            classroomChoice = in.nextInt();
        }

        return classroomChoice;
    }

    public static void classroomAction(Scanner in, int classroomChoice) {

        if (classroomChoice == 1) {
            addClassroom(in);
        } else if (classroomChoice == 2) {
            removeClassroom(in);
        } else {
            viewClassrooms();
        }

    }

    public static void addClassroom(Scanner in) {

    }

    public static void removeClassroom(Scanner in) {
        if (!classes.size() > 1) {
            System.out.println("There are no classrooms to remove!");
            return;
        }
    }

    public static void viewClassrooms() {
        if (!classes.size() > 1) {
            System.out.println("There are no classrooms to remove!");
            return;
        }

    }

}