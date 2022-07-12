package SimpleClassesAndObjects;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Customer {

    private int id;
    private static int ID = 1;
    private String surname;
    private String name;
    private String patronymic;
    private String adress;
    private String cardNumber;
    private String bankNumber;

    public Customer(String surname, String name, String patronymic, String adress, String cardNumber,
                    String bankNumber) {
        super();
        id = ID;
        ID++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.cardNumber = cardNumber;
        this.bankNumber = bankNumber;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public static Customer getNewCustomer() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer("", "", "", "", "", "");
        System.out.println("ââåäèòå ôàìèëèþ");
        customer.setSurname(sc.next());
        System.out.println("ââåäèòå èìÿ");
        customer.setName(sc.next());
        System.out.println("ââåäèòå îò÷åñòâî");
        customer.setPatronymic(sc.next());
        System.out.println("ââåäèòå àäðåñ");
        customer.setAdress(sc.next());
        System.out.println("ââåäèòå íîìåð êàðòû");
        customer.setCardNumber(sc.next());
        System.out.println("ââåäèòå íîìåð áàíêà");
        customer.setBankNumber(sc.next());

        return customer;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
                + ", adress=" + adress + ", cardNumber=" + cardNumber + ", bankNumber=" + bankNumber + "]";
    }

    public static class ByNameComparator implements Comparator<Customer> {

        @Override
        public int compare(Customer c1, Customer c2) {
            if (!Objects.equals(c1.surname, c2.surname))
                return c1.surname.compareTo(c2.surname);
            if (!Objects.equals(c1.name, c2.name))
                return c1.name.compareTo(c2.name);
            return c1.patronymic.compareTo(c2.patronymic);
        }

    }

}