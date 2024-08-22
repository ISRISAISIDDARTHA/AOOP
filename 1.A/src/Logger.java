public class Logger {
    
    public static class Loggersystem {
        public  static  Logger instance1 = new Logger();
    }
    public static Logger getInstance() {
        return Loggersystem.instance1;
    }
    public void log(String output) {
        System.out.println("Log: " + output);
    }
    
}
