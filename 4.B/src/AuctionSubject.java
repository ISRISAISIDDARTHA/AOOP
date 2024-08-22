import java.util.ArrayList;
import java.util.List;

interface AuctionSubject {
    void attach(AuctionObserver observer);
    void detach(AuctionObserver observer);
    void notifyObservers(String event);
}
