import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionSubject {
    private List<AuctionObserver> observers = new ArrayList<>();

    @Override
    public void attach(AuctionObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(AuctionObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (AuctionObserver observer : observers) {
            observer.update(event);
        }
    }

    public void startAuction() {
        notifyObservers("Auction starts at 8:00");
    }

    public void endAuction() {
        notifyObservers("Auction ends at 10:00");
    }

    public void newItemAvailable(String item) {
        notifyObservers("New item available: " + item);
    }
}
