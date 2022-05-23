package interfaces.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User(123456, "Ivanov", "Ivan");
        users[1] = new User(123457, "Petrov", "Petr");
        users[2] = new User(123459, "Unknov", "User");

        Account[] acc = new Account[5];
        acc[0] = new Account(10000123, 555, users[0]);
        acc[1] = new Account(10000124, 655, users[1]);
        acc[2] = new Account(10000125, 755, users[2]);
        acc[3] = new Account(10000126, 855, users[1]);
        acc[4] = new Account(10000127, 955, users[0]);

        AccountServiceImpl imp = new AccountServiceImpl(acc);

        System.out.println(imp.countAccountsWithBalanceGreaterThan(778));
        System.out.println(Arrays.toString(imp.findAccountByOwnerId(123456)));
        System.out.println(imp.countAccountsWithBalanceGreaterThan(980));
        System.out.println(Arrays.toString((imp.findAccountByOwnerId(123457))));
        System.out.println(Arrays.toString((imp.findAccountByOwnerId(12345777))));
    }
}
