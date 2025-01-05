package lesson13.account;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingAccount savingAccount = new SavingAccount(1000, 1.25);
        System.out.println("===== Сберегательный счёт =====\nПервоначальный депотиз: $" + savingAccount.getBalance() + "\nПроцентная ставка: " + savingAccount.getInterestRate() + "%\n");

        CurrentAccount currentAccount = new CurrentAccount(5000, 1000);
        System.out.println("===== Текущий счёт =====\nПервоначальный депотиз: $" + currentAccount.getBalance() + "\nЛимит овердрафта: $" + currentAccount.getOverdraftLimit() + "\n");

        bank.addAccount(savingAccount);
        bank.addAccount(currentAccount);

        System.out.println("Вносим 100 долларов на сберегательный счёт.");
        bank.deposit(savingAccount, 100);

        System.out.println("Вносим 500 долларов на текущий счёт.");
        bank.deposit(currentAccount, 500);

        System.out.println("Снимаем 150 долларов со сберегательного счёта.");
        bank.withdraw(savingAccount, 150);

        System.out.println("\n===== Сберегательный счёт и текущий счёт =====");
        bank.printAccountBalances();

        savingAccount.applyInterest();

        System.out.println("\nПосле начисления процентов");
        System.out.println("\n===== Сберегательный счёт и текущий счёт =====");
        bank.printAccountBalances();
    }
}
