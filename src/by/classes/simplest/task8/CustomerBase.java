package by.classes.simplest.task8;

public class CustomerBase {
    private final int quantity;
    private final Customer [] customers;

    private Customer [] initCustomers() {
        Customer [] customers = new Customer[quantity];
        for (int i = 0; i < customers.length; i++) {
            int id = (int) (Math.random() * 1000);
            String surname = "sur" + id/5;
            String name = "name" + id/10;
            String middleName = "middleName" + id/100;
            String address = "Moscow," + id;
            long cardNo = (long)(10000L * Math.random());
            long bankAccNumber = (long)(10000L * Math.random());
            customers[i] = new Customer(id, surname, name, middleName, address, cardNo, bankAccNumber);
        }
        return customers;
    }

    public CustomerBase(int quantity) {
        this.quantity = quantity;
        customers = initCustomers();
    }

    public void showCustomerBase() {
        System.out.println("id\tsurname\tname\tmiddleName\taddress\t\tcardNo\tbankAccNumber");
        for (int i = 0; i < quantity; i++) {
            System.out.println(customers[i].toString());
        }
    }

    public void findCustomersWithCardNo(long min, long max) {
        System.out.println("searching for customers with card number between " + min + " and " + max);
        for (Customer customer : customers) {
            if (customer.getCardNo() > min && customer.getCardNo() < max) {
                System.out.println(customer.toString());
            }
        }
    }

    public void sortAbc() {
        System.out.println("sorting customer base by abc");
        for (int i = 0; i < customers.length; i++) {
            for (int j = i + 1; j < customers.length; j++) {
                if (customers[i].getSurname().compareToIgnoreCase(customers[j].getSurname()) > 0) {
                    swap(customers, i, j);
                }
            }
        }
    }

    static <T> void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
