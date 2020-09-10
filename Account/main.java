package Account;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int ch;
        Account acc = new Account(2000);
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Existing Account");
        System.out.println("2.Bank ");
        ch = sc.nextInt();
        if (ch == 1) {
            acc.createexist();
        } else {
            acc.menu();
        }
    }
}
