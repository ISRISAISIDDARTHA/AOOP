public class MusicApp {
    public static void main(String[] args) {
        Music localFile = new LocalFileAdapter();
        Music onlineStreaming = new OnlineStreamingAdapter();
        Music radioStation = new RadioStationAdapter();

        Music LocalFile = new Equalizer(new Volume(localFile));
        Music OnlineStreaming = new Volume(new Equalizer(onlineStreaming));
        Music RadioStation = new Equalizer(new Volume(radioStation));

        LocalFile.play();
        OnlineStreaming.play();
        RadioStation.play();
    }
}
