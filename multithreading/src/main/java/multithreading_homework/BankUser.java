package multithreading_homework;

import java.util.Objects;

public class BankUser{

    static int allTakesMoney = 0;

    private String name;

    public BankUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankUser bankUser = (BankUser) o;
        return Objects.equals(name, bankUser.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
