package by.classes.aggregation.task4;

//  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//  всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.ArrayList;

public class Client {
    private final String name;
    private int quantity;
    private ArrayList<Account> listOfAccounts;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setListOfAccounts(ArrayList<Account> accounts) {
        listOfAccounts = accounts;
    }

    public ArrayList<Account> getListOfAccounts() {
        return listOfAccounts;
    }

    public String getInAccount(int i) {
        return getListOfAccounts().get(i).toString();
    }
}
