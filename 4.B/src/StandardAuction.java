class StandardAuction extends AuctionTemplate {
    @Override
    protected void initializeAuction() {
        System.out.println("Initializing standard auction...");
    }

    @Override
    protected void startBidding() {
        System.out.println("Starting bidding for standard auction...");
    }

    @Override
    protected void endBidding() {
        System.out.println("Ending bidding for standard auction...");
    }

    @Override
    protected void finalizeAuction() {
        System.out.println("Finalizing standard auction...");
    }
}

class ReserveAuction extends AuctionTemplate {
    @Override
    protected void initializeAuction() {
        System.out.println("Initializing reserve auction...");
    }

    @Override
    protected void startBidding() {
        System.out.println("Starting bidding for reserve auction...");
    }

    @Override
    protected void endBidding() {
        System.out.println("Ending bidding for reserve auction...");
    }

    @Override
    protected void finalizeAuction() {
        System.out.println("Finalizing reserve auction...");
    }
}
