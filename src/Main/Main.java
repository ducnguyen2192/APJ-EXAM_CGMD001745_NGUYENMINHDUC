package Main;

import Entities.PhoneBook;
import Entities.PhoneBookItem;
import Method.Menu;
import Method.Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<PhoneBookItem> phoneBookItems = new ArrayList<>();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setPhoneBookItems(phoneBookItems);
        Methods methods = new Methods();
        Menu menu = new Menu();


        do{
            System.out.println("---- PHONE BOOK MANAGEMENT ----");
            System.out.println("choose a function");
            System.out.println("1. Show all phone numbers");
            System.out.println("2. Add new");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. Read file");
            System.out.println("7. Write file");
            System.out.println("8. exit");

            int choice = Integer.parseInt(input.nextLine());
            switch(choice) {
                case 1:
                    methods.showAllPhoneBookItems(phoneBook);
                    break;
                case 2:
                    PhoneBookItem PBI = new PhoneBookItem();
                    methods.addPhoneBookItem(PBI, menu, phoneBook);
                    break;
                case 3:
                    System.out.println("input phone number to update: ");
                    int phoneNumber = Integer.parseInt(input.nextLine());
                    methods.updatePhoneBookItem(phoneBook,phoneNumber,menu);
                    break;
                case 4:
                    System.out.println("input phone number to delete: ");
                    int phoneNumber1 = Integer.parseInt(input.nextLine());
                    methods.deletePhoneBookItem(phoneNumber1, phoneBook);
                    System.out.println("you have successfully deleted the above phone number from our phone book");
                    break;
                case 5:
                    System.out.println("input phone number to search: ");
                    int phoneNumber2 = Integer.parseInt(input.nextLine());
                    PhoneBookItem PBI1 = methods.searchByIdPhoneNum(phoneBook, phoneNumber2);
                    System.out.println(PBI1.toString());
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("there are no such option");
                    break;
            }
        } while (true);

    }
}
