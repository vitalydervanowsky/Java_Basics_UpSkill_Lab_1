package by.classes.aggregation.task4;

//  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//  всем счетам, имеющим положительный и отрицательный балансы отдельно.

public class BankTerminal {
    public static void main(String[] args) {
        Client client = new Client("Alexander");
        client.createBankAccounts(6);
        client.showAllAccounts();
        client.sortAccounts();
        client.showAllAccounts();
        client.showAccount(3);
        client.showTotal();
        client.showTotalPositiveAndNegativeAccounts();
    }
}
