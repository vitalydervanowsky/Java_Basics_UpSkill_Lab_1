package by.classes.aggregation.task4;

//  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//  всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.ArrayList;
import java.util.Collections;

public class BankTerminal {
    public static void main(String[] args) {
        Client client = createClientWithList("List");
        System.out.println(client.getName() + " has " + client.getListOfAccounts().toString());
        int acc = 0;
        System.out.println(client.getName() + " has " + client.getInAccount(acc) + " in account " + acc);
        sortListOfAccounts(client);
        System.out.println(client.getName() + " has " + client.getListOfAccounts().toString());
        System.out.println(client.getName() + " has total " + totalInAccounts(client));
        System.out.println(client.getName() + " has total in positive accounts " + totalInPositiveAccounts(client));
        System.out.println(client.getName() + " has total in negative accounts " + totalInNegativeAccounts(client));
    }

    private static Account createAccount() {
        Account account = new Account((int)(10000 * Math.random() - 5000));
        if (account.getCurrent() < -2000) {
            account.block();
        }
        return account;
    }

    private static Client createClientWithList(String name) {
        Client client = new Client(name);
        ArrayList<Account> accounts = new ArrayList<>();
        client.setQuantity((int)(10 * Math.random() + 1));
        for (int i = 0; i < client.getQuantity(); i++) {
            Account account = createAccount();
            accounts.add(account);
        }
        client.setListOfAccounts(accounts);
        return client;
    }

    private static void sortListOfAccounts(Client client) {
        System.out.println("> sorting list of accounts...");
        ArrayList<Account> accounts = client.getListOfAccounts();
        Collections.sort(accounts);
        client.setListOfAccounts(accounts);
    }

    private static int totalInAccounts(Client client) {
        int sum = 0;
        ArrayList<Account> accounts = client.getListOfAccounts();
        for (Account account : accounts) {
            sum += account.getCurrent();
        }
        return sum;
    }

    public static int totalInPositiveAccounts(Client client) {
        int sum = 0;
        ArrayList<Account> accounts = client.getListOfAccounts();
        for (Account account : accounts) {
            if (account.getCurrent() > 0) {
                sum += account.getCurrent();
            }
        }
        return sum;
    }

    public static int totalInNegativeAccounts(Client client) {
        int sum = 0;
        ArrayList<Account> accounts = client.getListOfAccounts();
        for (Account account : accounts) {
            if (account.getCurrent() <= 0) {
                sum += account.getCurrent();
            }
        }
        return sum;
    }
}
