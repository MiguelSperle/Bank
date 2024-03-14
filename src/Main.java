//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account = new Account("0001", "3282", "Miguel", 20000);

        account.currentBalance("3282"); // verifica saldo atual através da conta

        account.drawBalance(5000); // saca x valor
        account.drawBalance(2500); // saca x valor

        account.depositBalance(1000); // deposita x valor
        account.depositBalance(500); // deposita x valor

        System.out.println(account);
    }
}