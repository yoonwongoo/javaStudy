package main.java.designPattern.adapter.ex2;

public class FormatAdapter implements MediaPlayer {

    private MediaPackage mediaPackage;

    public FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    @Override
    public void play(String musicName) {
        System.out.println("어댑터를 사용한다.");
        mediaPackage.playMusic(musicName);
    }
}
