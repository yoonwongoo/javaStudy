package main.java.designPattern.adapter.ex2;

public class Mp4 implements MediaPackage{


    @Override
    public void playMusic(String musicName) {
        System.out.println("mp4::실행::노래제목::"+musicName);

    }
}
