package by.classes.simplest.task8;

public class Task8 {
    public static void main(String[] args) {
        CustomerBase cb = new CustomerBase(5);
        cb.showCustomerBase();
        cb.findCustomersWithCardNo(1000, 5000);
        cb.sortCustomersByAbc();
        cb.showCustomerBase();
    }
}
