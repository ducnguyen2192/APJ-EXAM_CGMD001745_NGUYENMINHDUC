package Entities;

import java.util.ArrayList;

public class PhoneBook {

    ArrayList<PhoneBookItem> phoneBookItems;

    public PhoneBook(){}


    public ArrayList<PhoneBookItem> getPhoneBookItemList() {
        return phoneBookItems;
    }

    public void setPhoneBookItems(ArrayList<PhoneBookItem> phoneBookItems) {
        this.phoneBookItems = phoneBookItems;
    }


}
