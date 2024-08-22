public class AuctionSystem {
    public static void main(String[] args) {
        Auction auction = new Auction();
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        auction.attach(bidder1);
        auction.attach(bidder2);
        auction.newItemAvailable("Antique Vase");
        auction.startAuction();
        auction.endAuction();
        AuctionTemplate standardAuction = new StandardAuction();
        standardAuction.conductAuction();
        AuctionTemplate reserveAuction = new ReserveAuction();
        reserveAuction.conductAuction();
    }
}
