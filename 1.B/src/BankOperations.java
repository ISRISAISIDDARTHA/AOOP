public class BankOperations {
    private UserSession userSession;
    public BankOperations() {
        userSession = UserSession.getInstance();
    }
    public void viewBalance() {
        if (userSession.isLoggedIn()) {
            System.out.println("Getting your Account Balance");
        } else {
            System.out.println("Log in to view your account balance... THANK YOU");
        }
    }
    public void deposit() {
        if (userSession.isLoggedIn()) {
            System.out.println("The funds are getting deposited");
        } else {
            System.out.println("Log in to deposit funds...THANK YOU");
        }
    }
    public void withdraw() {
        if (userSession.isLoggedIn()) {
            System.out.println("Funds are getting Withdrawn");
        } else {
            System.out.println("Please log in to withdraw funds...THANK YOU");
        }
    }
}