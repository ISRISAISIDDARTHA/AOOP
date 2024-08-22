public class LogCommand implements Command {
    private int level;
    private String message;

    public LogCommand(int level, String message) {
        this.level = level;
        this.message = message;
    }

    @Override
    public void execute(String message) {
        System.out.println("[" + getLevelName(level) + "] " + message);
    }

    public int getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

    private String getLevelName(int level) {
        switch (level) {
            case LogLevel.INFO:
                return "INFO";
            case LogLevel.DEBUG:
                return "DEBUG";
            case LogLevel.ERROR:
                return "ERROR";
            default:
                return "UNKNOWN";
        }
    }
}
