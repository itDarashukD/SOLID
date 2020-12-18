package thirdBarbaraLiskedSubstitusion.instance1;

public class App {
    public static void main(String[] args) {
        AIMplayer aiMplayer = new AIMplayer();
        MediaPlayer mediaPlayer = new MBFplayer();

        aiMplayer.playMusic();
        aiMplayer.playVideo();// aiMplayer.playVideo()  !=  mediaPlayer.playVideo()

        mediaPlayer.playMusic();
        mediaPlayer.playVideo();
    }
}
