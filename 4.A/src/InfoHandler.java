public class InfoHandler extends LogHandler {
    @Override
    public void handle(LogCommand command) {
        if (command.getLevel() == LogLevel.INFO) {
            command.execute(command.getMessage());
        } else {
            super.handle(command);
        }
    }
}

 class DebugHandler extends LogHandler {
    @Override
    public void handle(LogCommand command) {
        if (command.getLevel() == LogLevel.DEBUG) {
            command.execute(command.getMessage());
        } else {
            super.handle(command);
        }
    }
}

 class ErrorHandler extends LogHandler {
    @Override
    public void handle(LogCommand command) {
        if (command.getLevel() == LogLevel.ERROR) {
            command.execute(command.getMessage());
        } else {
            super.handle(command);
        }
    }
}
