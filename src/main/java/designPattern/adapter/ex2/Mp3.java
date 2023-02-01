package main.java.designPattern.adapter.ex2;

public class Mp3 implements MediaPlayer{


    @Override
    public void play(String musicName) {
        System.out.println("mp3::실행::노래제목::"+musicName);
    }
}
