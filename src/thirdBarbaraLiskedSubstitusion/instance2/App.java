package thirdBarbaraLiskedSubstitusion.instance2;

public class App {
    public static void main(String[] args) {
        AIMplayer aiMplayer = new AIMplayer();
        MediaPlayer mediaPlayer = new MBFplayer();

        MBFplayer mbFplayer = new MBFplayer();
        MediatorForMediaPlayer mediatorForMediaPlayer = new MediatorForMediaPlayer();

        aiMplayer.playMusic();
        mediaPlayer.playMusic();

        mbFplayer.playMusic();
        mbFplayer.playVideo();
        mediatorForMediaPlayer.playVideo();
        mediatorForMediaPlayer.playMusic();

    }
}
