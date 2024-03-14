//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account = new Account("0001", "3282", "Miguel", 20000);

        account.CurrentBalance("3282"); // verifica saldo atual através da conta

        account.DrawBalance(5000); // saca x valor
        account.DrawBalance(2500); // saca x valor

        account.DepositBalance(1000); // deposita x valor
        account.DepositBalance(500); // deposita x valor

        System.out.println(account);
    }
}