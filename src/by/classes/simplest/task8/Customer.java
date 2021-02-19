package by.classes.simplest.task8;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private long cardNo;
    private long bankAccNumber;

    public Customer(int id, String surname, String name, String middleName, String address, long cardNo, long bankAccNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.cardNo = cardNo;
        this.bankAccNumber = bankAccNumber;
    }

    public String toString() {
        return id + "\t" + surname + "\t" + name + "\t" + middleName + "\t" + address + "\t" + cardNo + "\t" + bankAccNumber;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNo() {
        return cardNo;
    }

    public void setCardNo(long cardNo) {
        this.cardNo = cardNo;
    }

    public long getBankAccNumber() {
        return bankAccNumber;
    }

    public void setBankAccNumber(long bankAccNumber) {
        this.bankAccNumber = bankAccNumber;
    }
}
