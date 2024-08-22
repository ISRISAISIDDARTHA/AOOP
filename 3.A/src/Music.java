interface Music {
    void play();
}

class LocalFileAdapter implements Music {
    public void play() {
        System.out.println("Playing from local library");
    }
}

class OnlineStreamingAdapter implements Music {
    public void play() {
        System.out.println("Streaming from online");
    }
}

class RadioStationAdapter implements Music {
    public void play() {
        System.out.println("Playing from radio station");
    }
}
