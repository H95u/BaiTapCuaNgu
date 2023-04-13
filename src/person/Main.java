package person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static Person createNewPerson(Address[] addressArr) {
        System.out.println("Nhập vào tên ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi ");
        int age = Integer.parseInt(scanner.nextLine());
        Address address = getAddress(addressArr);
        return new Person(name, age, address);
    }

    public static Address getAddress(Address[] addressArr) {
        for (Address address : addressArr) {
            System.out.println(address);
        }
        System.out.println("Mời chọn địa chỉ ");
        int choice = Integer.parseInt(scanner.nextLine());
        for (Address address : addressArr) {
            if (address.getId() == choice) {
                return address;
            }
        }
        return null;
    }

    public static void showAllPerson(Person[] personArr) {
        for (Person person : personArr) {
            System.out.println(person);
        }
    }

    public static boolean checkInputID(int id, Person[] personArr) {
        for (Person person : personArr) {
            if (person.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static Person[] deletePerson(int id, Person[] personArr) {
        Person[] newPersonArr = new Person[personArr.length - 1];
        int index = 0;
        for (Person person : personArr) {
            if (person.getId() != id) {
                newPersonArr[index] = person;
                index++;
            }
        }
        return newPersonArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Address[] addressArr = new Address[3];
        addressArr[0] = new Address("Ha Noi");
        addressArr[1] = new Address("TP HCM");
        addressArr[2] = new Address("QN");
        System.out.println("Nhập số lượng người dùng mà bạn muốn thêm ");
        int size = Integer.parseInt(scanner.nextLine());
        Person[] personArr = new Person[size];
        for (int i = 0; i < personArr.length; i++) {
            personArr[i] = createNewPerson(addressArr);
        }
        showAllPerson(personArr);
        int choice;
        do {
            System.out.println("MENU-------------------");
            System.out.println("1. Thêm người dùng mới");
            System.out.println("2. Sửa người dùng theo ID");
            System.out.println("3. Xóa người dùng theo ID");
            System.out.println("4. Sắp xếp tên người dùng theo thứ tự ( a - z )");
            System.out.println("5. Hiển thị người dùng theo address");
            System.out.println("6. Hiển thị tất cả người dùng ");
            System.out.println("7. Sắp xếp người dùng theo ID tăng dần ");
            System.out.println("8. Sửa thông tin địa chỉ theo ID ");
            System.out.println("9. Thêm địa chỉ mới");
            System.out.println("10. Sắp xếp người dùng theo ID giảm dần ");
            System.out.println("0. Thoát");
            System.out.println("Mời nhập vào lựa chọn của bạn");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Person newPerson = createNewPerson(addressArr);
                    Person[] newPersonArr = new Person[personArr.length + 1];
                    System.arraycopy(personArr, 0, newPersonArr, 0, personArr.length);
                    newPersonArr[newPersonArr.length - 1] = newPerson;
                    personArr = newPersonArr;
                    showAllPerson(personArr);
                    break;
                case 2:
                    System.out.println("Mời nhập vào ID");
                    int editID = Integer.parseInt(scanner.nextLine());
                    boolean checkEditID = checkInputID(editID, personArr);
                    if (checkEditID) {
                        for (int i = 0; i < personArr.length; i++) {
                            if (personArr[i].getId() == editID) {
                                System.out.println("Nhập vào tên mới");
                                personArr[i].setName(scanner.nextLine());
                                System.out.println("Nhập vào tuổi mới");
                                personArr[i].setAge(Integer.parseInt(scanner.nextLine()));
                                personArr[i].setAddress(getAddress(addressArr));
                            }
                        }
                        showAllPerson(personArr);
                    } else {
                        System.out.println("Không tìm thấy ID này!!");
                    }
                    break;
                case 3:
                    System.out.println("Mời nhập vào ID");
                    int deleteID = Integer.parseInt(scanner.nextLine());
                    boolean checkDeleteID = checkInputID(deleteID, personArr);
                    if (checkDeleteID) {
                        personArr = deletePerson(deleteID, personArr);
                        showAllPerson(personArr);
                    } else {
                        System.out.println("Không tìm thấy ID này");
                    }
                    break;
                case 4:
                    Arrays.sort(personArr);
                    showAllPerson(personArr);
                    break;
                case 5:
                    Address checkAddress = getAddress(addressArr);
                    Person[] newPersonArrByAddress = new Person[personArr.length];
                    for (int i = 0; i < personArr.length; i++) {
                        if (personArr[i].getAddress() == checkAddress) {
                            newPersonArrByAddress[i] = personArr[i];
                        }
                    }
                    for (Person personArrByAddress : newPersonArrByAddress) {
                        if (personArrByAddress != null) {
                            System.out.println(personArrByAddress);
                        }
                    }
                    break;
                case 6:
                    showAllPerson(personArr);
                    break;
                case 7:
                    Comparator<Person> comparator = new Person();
                    Arrays.sort(personArr, comparator);
                    showAllPerson(personArr);
                    break;
                case 8:
                    System.out.println("Mời nhập vào ID");
                    int editAddressID = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < addressArr.length; i++) {
                        if (addressArr[i].getId() == editAddressID) {
                            System.out.println("Nhập vào địa chỉ mới");
                            addressArr[i].setAddress(scanner.nextLine());
                        }
                    }
                    showAllPerson(personArr);
                    break;
                case 9:
                    Address newAddressName = addNewAddress();
                    Address[] newAddressArr = new Address[addressArr.length + 1];
                    System.arraycopy(addressArr, 0, newAddressArr, 0, addressArr.length);
                    newAddressArr[newAddressArr.length - 1] = newAddressName;
                    addressArr = newAddressArr;
                    break;
                case 10:
                    Arrays.sort(personArr, new Comparator<Person>() {
                        @Override
                        public int compare(Person o1, Person o2) {
                            if (o1.getId() < o2.getId()) return 1;
                            if (o1.getId() > o2.getId()) return -1;
                            else return 0;
                        }
                    });
                    break;
            }

        } while (choice != 0);
    }

    public static Address addNewAddress() {
        System.out.println("Mời nhập vào tên địa chỉ muốn thêm");
        String name = scanner.nextLine();
        return new Address(name);
    }
}
