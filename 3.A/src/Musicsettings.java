abstract class Musicsettings implements Music {
    protected Music source;

    public Musicsettings(Music source) {
        this.source = source;
    }

    public void play() {
        source.play();
    }
}

class Equalizer extends Musicsettings {
    public Equalizer(Music source) {
        super(source);
    }

    public void play() {
        super.play();
        System.out.println("Setting up equalizer");
    }
}

class Volume extends Musicsettings {
    public Volume(Music source) {
        super(source);
    }

    public void play() {
        super.play();
        System.out.println("increasing volume");
    }
}
