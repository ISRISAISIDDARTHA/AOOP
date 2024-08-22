public class UserSession {
    private static UserSession instance;
    private boolean isLoggedIn;
    private UserSession() {
        isLoggedIn = false;
    }

    public static UserSession getInstance() {
        if (instance == null) {
            synchronized (UserSession.class) {
                if (instance == null) {
                    instance = new UserSession();
                }
            }
        }
        return instance;
    }
    public void login() {
        isLoggedIn = true;
        System.out.println("User has logged in.");
    }
    public void logout() {
        isLoggedIn = false;
        System.out.println("User has not logged in");
    }
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}