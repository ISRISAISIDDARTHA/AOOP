public class Main {
    public static void main(String[] args) {
        BankOperations op = new BankOperations();

        op.viewBalance();

        UserSession.getInstance().login();
  
        op.viewBalance();
        op.deposit();
        op.withdraw();

        UserSession.getInstance().logout();

        op.viewBalance();
        op.deposit();
        op.withdraw();
    }
}