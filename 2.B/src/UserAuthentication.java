public class UserAuthentication {
    private static UserAuthentication user;
    private String userId;
    private UserAuthentication() {}

    public static synchronized UserAuthentication getInstance() {
        if (user == null) {
            user = new UserAuthentication();
        }
        return user;
    }
    public void login(String userId) {
        this.userId = userId;
    }
    public void logout() {
        this.userId = null;
    }
}
