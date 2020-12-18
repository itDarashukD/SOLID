package thirdBarbaraLiskedSubstitusion.instance1;

public class AIMplayer extends MediaPlayer{
    @Override
    public void playMusic() {
        System.out.println("aimp");;
    }

    @Override
    public void playVideo() {
        throw new RuntimeException();
    }
}
