package BentlyShowroom;

import java.util.Objects;

public class BankInfo {
    Integer id;
    String bankName;
    String accountNumber;
    Float salary;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankInfo bankInfo = (BankInfo) o;
        return Objects.equals(id, bankInfo.id) && Objects.equals(bankName, bankInfo.bankName) && Objects.equals(salary, bankInfo.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bankName);
    }

    @Override
    public String toString() {
        return "BankInfo{" +
                "bankName='" + bankName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", salary=" + salary +
                '}';
    }
}
