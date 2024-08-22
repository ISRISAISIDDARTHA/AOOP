public class Client {
    public static void main(String[] args) {
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);
        LogCommand infoCommand = new LogCommand(LogLevel.INFO, "This is an info message.");
        LogCommand debugCommand = new LogCommand(LogLevel.DEBUG, "This is a debug message.");
        LogCommand errorCommand = new LogCommand(LogLevel.ERROR, "This is an error message.");
        Logger logger = new Logger();
        logger.addCommand(infoCommand);
        logger.addCommand(debugCommand);
        logger.addCommand(errorCommand);
        logger.processCommands();
    }
}
