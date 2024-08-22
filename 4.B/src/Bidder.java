class Bidder implements AuctionObserver {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println(name + " received notification: " + event);
    }
}
