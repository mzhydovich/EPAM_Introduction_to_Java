package SimpleClassesAndObjects;

import java.util.Arrays;

public class Customers {

    private Customer[] customers;
    private int capacity;
    private int size;

    public Customers() {
        size = 0;
        capacity = 1;
        customers = new Customer[capacity];
    }

    public void pushCustomer(Customer customer) {

        if (size < capacity) {
            customers[size] = customer;
            size++;
        } else {
            Customer[] tmp = new Customer[capacity];
            System.arraycopy(customers, 0, tmp, 0, size);
            customers = new Customer[capacity * 2];
            System.out.println("customers.length = "+ customers.length);

            if (size >= 0) System.arraycopy(tmp, 0, customers, 0, size);
            customers[size] = customer;
            capacity = capacity*2;
            size++;
        }

    }

    public void showCustomer() {
        for (int i = 0; i < size; i++) {
            customers[i].print();
        }

    }

    public void sortByName() {
        Arrays.sort(customers, new Customer.ByNameComparator());
    }

    public void print_if_card_in(String a, String b) {
        for (int i = 0; i < size; ++i) {
            if (customers[i].getCardNumber().compareTo(a) >= 0 &&
                    customers[i].getCardNumber().compareTo(b) <= 0)
                customers[i].print();
        }
    }

}
