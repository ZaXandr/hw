package interfaces.task3;

public class AccountServiceImpl implements AccountService {

    private final Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account[] findAccountByOwnerId(long id) {
        Account[] result = new Account[accounts.length];

        for (Account a : accounts) {
            int rid = 0;
            if (a.getOwner().getId() == id) {
                result[rid++] = new Account(a.getId(),a.getBalance(),a.getOwner());
            }
        }
        return result;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        int count = 0;
        for (Account a : accounts) {
            if (a.getBalance() > value) {
                count++;
            }
        }
        return count;
    }
}
