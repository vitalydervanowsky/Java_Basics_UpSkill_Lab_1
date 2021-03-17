package by.classes.aggregation.task4;

//  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//  всем счетам, имеющим положительный и отрицательный балансы отдельно.

public class Account implements Comparable<Account> {
    private int current;
    private boolean blocked;

    public Account(int current) {
        this.current = current;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void block() {
        blocked = true;
    }

    public void unblock() {
        blocked = false;
    }

    public boolean isBlocked() {
        return blocked;
    }

    @Override
    public String toString() {
        String blocked = isBlocked() ? " blocked" : " unblocked";
        return getCurrent() + blocked;
    }

    @Override
    public int compareTo(Account o) {
        return o.getCurrent() - this.getCurrent();
    }
}
