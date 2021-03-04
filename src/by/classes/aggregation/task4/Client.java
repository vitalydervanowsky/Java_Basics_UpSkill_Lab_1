package by.classes.aggregation.task4;

//  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//  всем счетам, имеющим положительный и отрицательный балансы отдельно.

public class Client {
    private final String name;
    private int quantityOfBankAccounts;
    private Account[] accounts;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void createBankAccounts(int quantity) {
        quantityOfBankAccounts = quantity;
        accounts = new Account[quantityOfBankAccounts];
        for (int i = 0; i < quantityOfBankAccounts; i++) {
            accounts[i] = new Account(4000 * Math.random() - 2000);
            if (accounts[i].getCurrent() < -1000) {
                accounts[i].block();
            }
        }
    }

    public void showAllAccounts() {
        System.out.println("Bank accounts of " + getName());
        for (int i = 0; i < quantityOfBankAccounts; i++) {
            showAccount(i);
        }
    }

    public void sortAccounts() {
        for (int i = 0; i < quantityOfBankAccounts; i++) {
            for (int j = 0; j < quantityOfBankAccounts; j++) {
                if (accounts[i].getCurrent() > accounts[j].getCurrent()) {
                    swap(accounts, i, j);
                }
            }
        }
    }

    private static <A> void swap(A[] a, int i, int j) {
        A temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void showAccount(int i) {
        System.out.println("Account No" + i + ": " + accounts[i].toString());
    }

    public void showTotal() {
        double sum = 0;
        for (int i = 0; i < quantityOfBankAccounts; i++) {
            sum += accounts[i].getCurrent();
        }
        System.out.println("Total current = " + sum);
    }

    public void showTotalPositiveAndNegativeAccounts() {
        double sumPositive = 0;
        double sumNegative = 0;
        for (int i = 0; i < quantityOfBankAccounts; i++) {
            if (accounts[i].getCurrent() > 0) {
                sumPositive += accounts[i].getCurrent();
            } else {
                sumNegative += accounts[i].getCurrent();
            }
        }
        System.out.println("Total positive = " + sumPositive);
        System.out.println("Total negative = " + sumNegative);
    }
}
