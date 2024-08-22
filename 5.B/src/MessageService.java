// MessageService interface
interface MessageService {
    void sendMessage(String message, String recipient);
}

// EmailService class
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

// SMSService class
class SMSService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}

// MyApplication class
class MyApplication {
    private MessageService messageService;

    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient) {
        messageService.sendMessage(message, recipient);
    }
}

// Demonstration
 class DIPMain {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MyApplication app = new MyApplication(emailService);
        app.processMessage("Hello, Alice!", "alice@gmail.com");

        MessageService smsService = new SMSService();
        app = new MyApplication(smsService);
        app.processMessage("Hello, Bob!", "123-456-789");
    }
}
