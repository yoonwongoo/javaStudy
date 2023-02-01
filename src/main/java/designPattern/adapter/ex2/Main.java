package main.java.designPattern.adapter.ex2;

public class Main {


    /*전체적인 내용을 보면 MediaPlayer와 MediaPackage는 전혀다른 인터페이스.
    * 어댑터를 추가 하므로써 연결사용.
    * */
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new Mp3();
        mediaPlayer.play("이별노래");
        
        /*전혀 다른 인터페이스이다.*/
        MediaPackage mediaPackage = new Mp4();
        mediaPackage.playMusic("사랑노래");
        
        /*어댑터 추가*/
        MediaPlayer formatAdapter = new FormatAdapter(mediaPackage);
        formatAdapter.play("즐거운노래");

        /*MediaPlayer가 MediaPackage를 사용했다...*/
    }
}
