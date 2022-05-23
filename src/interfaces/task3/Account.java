package interfaces.task3;

public class Account {
    private long id;
    private long balance;
    private User owner;
    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }
    public long getId() {
        return id;
    }
    public long getBalance() {
        return balance;
    }
    public User getOwner() {
        return owner;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", owner={" + owner.getId() +
                ", firstName=" + owner.getFirstName() +
                ", lastName=" + owner.getLastName() +
                '}';
    }
}
