package Method;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    public ArrayList<java.io.Serializable> inputInfo(){
        ArrayList<java.io.Serializable> inputInfo = new ArrayList<java.io.Serializable>();
        System.out.println("input number group: ");
        int group = Integer.parseInt(input.nextLine());
        System.out.println("input name: ");
        String name = input.nextLine();
        System.out.println("input gender: ");
        String gender = input.nextLine();
        System.out.println("input address: ");
        String address = input.nextLine();
        System.out.println("input DOB: ");
        int DOB = Integer.parseInt(input.nextLine());
        System.out.println("input email: ");
        String email = input.nextLine();
        System.out.println("input phone number: ");
        int phoneNumber = Integer.parseInt(input.nextLine());
        inputInfo.add(group);
        inputInfo.add(name);
        inputInfo.add(gender);
        inputInfo.add(address);
        inputInfo.add(DOB);
        inputInfo.add(email);
        inputInfo.add(phoneNumber);
        return inputInfo;
    }

}
