
import transaction.Account;
import reports.TransactionReport;

public class MainApplication {

    public static void main(String[] args) {

        // Create account object
        Account acc = new Account(1001, 5000);

        // Perform transactions
        acc.deposit(2000);

        acc.withdraw(1000);

        // Generate transaction report
        TransactionReport report =
                new TransactionReport();

        report.generateReport(acc);
    }
}
