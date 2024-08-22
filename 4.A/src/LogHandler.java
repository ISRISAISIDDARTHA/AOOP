public abstract class LogHandler {
    protected LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(LogCommand command) {
        if (nextHandler != null) {
            nextHandler.handle(command);
        }
    }
}
