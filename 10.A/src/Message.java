import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Message {
    private final String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Producer implements Runnable {
    private final BlockingQueue<Message> sharedBuffer;

    public Producer(BlockingQueue<Message> sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            int messageCount = 0;
            while (true) {
                String messageContent = "Message " + messageCount;
                Message message = new Message(messageContent);
                sharedBuffer.put(message);
                System.out.println("Produced: " + message.getContent());
                messageCount++;
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final BlockingQueue<Message> sharedBuffer;

    public Consumer(BlockingQueue<Message> sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Message message = sharedBuffer.take();
                System.out.println("Consumed: " + message.getContent());
                Thread.sleep(1500); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
 class MessagingApp {
    public static void main(String[] args) {
        BlockingQueue<Message> sharedBuffer = new LinkedBlockingQueue<>();
        Thread producerThread = new Thread(new Producer(sharedBuffer));
        Thread consumerThread = new Thread(new Consumer(sharedBuffer));
        
        producerThread.start();
        consumerThread.start();
    }
}
