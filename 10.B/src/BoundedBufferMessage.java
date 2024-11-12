import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class BoundedBufferMessage {
    private final String content;

    public BoundedBufferMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class BoundedBufferProducer implements Runnable {
    private final BlockingQueue<BoundedBufferMessage> sharedBuffer;

    public BoundedBufferProducer(BlockingQueue<BoundedBufferMessage> sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            int messageCount = 0;
            while (true) {
                String messageContent = "Message " + messageCount;
                BoundedBufferMessage message = new BoundedBufferMessage(messageContent);
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

class BoundedBufferConsumer implements Runnable {
    private final BlockingQueue<BoundedBufferMessage> sharedBuffer;

    public BoundedBufferConsumer(BlockingQueue<BoundedBufferMessage> sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                BoundedBufferMessage message = sharedBuffer.take();
                System.out.println("Consumed: " + message.getContent());
                Thread.sleep(1500); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

 class BoundedBufferApp {
    public static void main(String[] args) {
        BlockingQueue<BoundedBufferMessage> sharedBuffer = new ArrayBlockingQueue<>(10);
        Thread producerThread = new Thread(new BoundedBufferProducer(sharedBuffer));
        Thread consumerThread = new Thread(new BoundedBufferConsumer(sharedBuffer));
        
        producerThread.start();
        consumerThread.start();
    }
}
