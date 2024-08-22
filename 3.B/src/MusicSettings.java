// Component interface
interface MusicPlayback {
    void play();
}

// Concrete component
class BasicMusicPlayback implements MusicPlayback {
    @Override
    public void play() {
        System.out.println("Playing music...");
    }
}

// Decorator base class
abstract class MusicPlaybackDecorator implements MusicPlayback {
    protected MusicPlayback decoratedPlayback;

    public MusicPlaybackDecorator(MusicPlayback decoratedPlayback) {
        this.decoratedPlayback = decoratedPlayback;
    }

    public void play() {
        decoratedPlayback.play();
    }
}

// Concrete decorator for equalizer
class EqualizerDecorator extends MusicPlaybackDecorator {

    public EqualizerDecorator(MusicPlayback decoratedPlayback) {
        super(decoratedPlayback);
    }

    @Override
    public void play() {
        decoratedPlayback.play();
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Setting equalizer...");
    }
}

// Concrete decorator for volume control
class VolumeControlDecorator extends MusicPlaybackDecorator implements Music {

    public VolumeControlDecorator(Music playback) {
        super(playback);
    }

    @Override
    public void play() {
        decoratedPlayback.play();
        setVolume();
    }

    private void setVolume() {
        System.out.println("Setting volume...");
    }
}
