public class MusicStreamingApp {
    public static void main(String[] args) {
        // Adapting different music sources
        Music localFile = new LocalFileAdapter(new LocalFilePlayer());
        Music onlineStream = new OnlineStreamingAdapter(new OnlineStreamingPlayer());
        Music radioStation = new RadioStationAdapter(new RadioStationPlayer());

        // Using Bridge pattern to decouple playback from source
        Music player = new AdvancedMusicPlayer(localFile);
        player.play();

        // Adding additional features using Decorator pattern
        Music playback = new BasicMusicPlayback();
        playback = new EqualizerDecorator(playback);
        playback = new VolumeControlDecorator(playback);
        playback.play();
    }
}

// Dummy classes for different players
class LocalFilePlayer {
    void playLocalFile() {
        System.out.println("Playing local file...");
    }
}

class OnlineStreamingPlayer {
    void playOnlineStream() {
        System.out.println("Playing online stream...");
    }
}

class RadioStationPlayer {
    void playRadio() {
        System.out.println("Playing radio station...");
    }
}
