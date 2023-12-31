package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhonebookApplication {

    public static void main(String[] args) {
        // Create a HashMap to store contacts (name -> phone number)
        Map<String, String> phonebook = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Phonebook Application");
            System.out.println("1. Add a contact");
            System.out.println("2. Remove a contact");
            System.out.println("3. Search for a contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phonebook.put(name, phoneNumber);
                    System.out.println("Contact added successfully.");
                    break;
                case 2:
                    System.out.print("Enter contact name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    if (phonebook.containsKey(nameToRemove)) {
                        phonebook.remove(nameToRemove);
                        System.out.println("Contact removed successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter contact name to search: ");
                    String nameToSearch = scanner.nextLine();
                    if (phonebook.containsKey(nameToSearch)) {
                        System.out.println("Phone number: " + phonebook.get(nameToSearch));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Phonebook Application.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
