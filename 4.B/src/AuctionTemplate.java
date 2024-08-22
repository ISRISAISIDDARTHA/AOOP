abstract class AuctionTemplate {
    public final void conductAuction() {
        initializeAuction();
        startBidding();
        endBidding();
        finalizeAuction();
    }

    protected abstract void initializeAuction();
    protected abstract void startBidding();
    protected abstract void endBidding();
    protected abstract void finalizeAuction();
}
