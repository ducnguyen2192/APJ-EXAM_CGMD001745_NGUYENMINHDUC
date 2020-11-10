package Method;

import Entities.PhoneBook;
import Entities.PhoneBookItem;

import java.util.ArrayList;

public class Methods {
    public PhoneBookItem searchByIdPhoneNum(PhoneBook phoneBook, int phoneNumber){
        PhoneBookItem PBI1 = null;
        for (PhoneBookItem PBI: phoneBook.getPhoneBookItemList()) {
            if(phoneNumber == PBI.getPhoneNum()){
                PBI1 = PBI;
            }
        }
        return PBI1;
    }

    public void updatePhoneBookItem(PhoneBook phoneBook, int phoneNumber, Menu menu){
        PhoneBookItem PBI = searchByIdPhoneNum(phoneBook, phoneNumber);
        if(PBI == null){

            updatePhoneBookItem(phoneBook, phoneNumber, menu);
        } else {
            ArrayList inputInfo = menu.inputInfo();
            PBI.setGroupNum((Integer) inputInfo.get(0));
            PBI.setName((String) inputInfo.get(1));
            PBI.setGender((String) inputInfo.get(2));
            PBI.setAddress((String) inputInfo.get(3));
            PBI.setDOB((int) inputInfo.get(4));
            PBI.setEmail((String) inputInfo.get(5));
            System.out.println(PBI.toString());
        }
    }

    public void showAllPhoneBookItems(PhoneBook phoneBook){
        for (PhoneBookItem PBI: phoneBook.getPhoneBookItemList()) {
            System.out.println(PBI.toString());
        }
    }

    public void addPhoneBookItem(PhoneBookItem PBI, Menu menu, PhoneBook phoneBook){
        ArrayList inputInfo1 = menu.inputInfo();
        PBI.setGroupNum((Integer) inputInfo1.get(0));
        PBI.setName((String) inputInfo1.get(1));
        PBI.setGender((String) inputInfo1.get(2));
        PBI.setAddress((String) inputInfo1.get(3));
        PBI.setDOB((int) inputInfo1.get(4));
        PBI.setEmail((String) inputInfo1.get(5));
        PBI.setPhoneNum((Integer) inputInfo1.get(6));
        phoneBook.getPhoneBookItemList().add(PBI);
        System.out.println(PBI.toString());
    }

    public void deletePhoneBookItem(int phoneNumber, PhoneBook phoneBook){
        PhoneBookItem PBI = searchByIdPhoneNum(phoneBook, phoneNumber);
        if(PBI == null){
            System.out.println("there are no such phone number in our phone book");
            deletePhoneBookItem(phoneNumber, phoneBook);
        } else {
            phoneBook.getPhoneBookItemList().remove(PBI);
        }
    }
}
