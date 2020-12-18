package thirdBarbaraLiskedSubstitusion.instance2;

/**
Чтобы правильно организовать работу Классов необходимо ввести Классы посредники, а этот
 родитель урезать и передать часть его методов посреднику.

 ТО К.MediatorForMediaPlayer - посредник с методом из MediaPlayer
 Уже от него наслдеуются плееры.
 Иплееры не урезают , а дополняют функциональность родителей
 MBFplayer расширяет функциональность MediatorForMediaPlayer

 */
public class MediaPlayer {

    public void playMusic() {
        System.out.println("playmusic");
    }

}