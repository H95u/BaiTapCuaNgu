package phone;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhoneBookManage extends Phone implements PhoneInterface {
    private Contact[] phoneList;
    private Scanner scanner;

    public PhoneBookManage() {
        Contact[] newPhoneList = new Contact[2];
        newPhoneList[0] = new Contact("hieu", "0123");
        newPhoneList[1] = new Contact("minh", "999");
        phoneList = newPhoneList;
        scanner = new Scanner(System.in);
    }

    @Override
    public void insertPhone() {
        Contact[] newPhoneList = new Contact[phoneList.length + 1];
        System.arraycopy(phoneList, 0, newPhoneList, 0, phoneList.length);
        newPhoneList[newPhoneList.length - 1] = createNewContact();
        phoneList = newPhoneList;
        displayAll();
    }

    @Override
    public void removePhone(String name) {
        Contact[] newPhoneList = new Contact[phoneList.length - 1];
        int index = 0;
        for (int i = 0; i < phoneList.length; i++) {
            if (!phoneList[i].getName().equalsIgnoreCase(name)) {
                newPhoneList[index] = phoneList[i];
                index++;
            }
        }
        phoneList = newPhoneList;
        displayAll();
    }

    @Override
    public void updatePhone(int index, String name, String newPhone) {
        phoneList[index].setName(name);
        phoneList[index].setPhoneNumber(newPhone);
    }

    public void displayAll() {
        for (Contact contact : phoneList) {
            System.out.println(contact);
        }
    }

    public Contact createNewContact() {
        System.out.println("mời nhập vào name");
        String name = scanner.nextLine();
        System.out.println("mời nhập vào phonenumber");
        String phone = scanner.nextLine();
        return new Contact(name, phone);
    }

    @Override
    public void searchPhone(String name) {

        for (Contact contact : phoneList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
            }
        }
    }

    @Override
    public void sort() {
        Arrays.sort(phoneList, new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
