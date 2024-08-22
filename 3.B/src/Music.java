// Common interface for all music sources
interface Music {
    void play();
}

// Adapter for local files
class LocalFileAdapter implements Music {
    private LocalFilePlayer localFilePlayer;

    public LocalFileAdapter(LocalFilePlayer localFilePlayer) {
        this.localFilePlayer = localFilePlayer;
    }

    @Override
    public void play() {
        localFilePlayer.playLocalFile();
    }
}

// Adapter for online streaming services
class OnlineStreamingAdapter implements Music {
    private OnlineStreamingPlayer onlineStreamingPlayer;

    public OnlineStreamingAdapter(OnlineStreamingPlayer onlineStreamingPlayer) {
        this.onlineStreamingPlayer = onlineStreamingPlayer;
    }

    @Override
    public void play() {
        onlineStreamingPlayer.playOnlineStream();
    }
}

// Adapter for radio stations
class RadioStationAdapter implements Music {
    private RadioStationPlayer radioStationPlayer;

    public RadioStationAdapter(RadioStationPlayer radioStationPlayer) {
        this.radioStationPlayer = radioStationPlayer;
    }

    @Override
    public void play() {
        radioStationPlayer.playRadio();
    }
}
