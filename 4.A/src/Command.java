public interface Command {
    void execute(String message);

	String getMessage();
}