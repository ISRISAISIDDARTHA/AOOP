// Abstraction for music player
abstract class MusicPlayer {
    protected Music musicSource;

    protected MusicPlayer(Music musicSource) {
        this.musicSource = musicSource;
    }

    public abstract void play();
}

// Refined abstraction for advanced music player
class AdvancedMusicPlayer extends MusicPlayer {

    public AdvancedMusicPlayer(Music musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        System.out.println("Playing music with advanced features...");
        musicSource.play();
    }
}
