package thirdBarbaraLiskedSubstitusion.instance1;

/**
 Принцип подстановки Барбары Лискед, мы всегда должны името возможность подменить объектом класса ребенка - класс
 Родителя, без изменения работы родителя!. Здесь это реализовано не правильно - Объектом К.AIMplayer нельзя заменить
 объект родителя MediaPlayer,- т.к. меняется работа методов.
 Правильный пример смотри в instance2
 */
public class MediaPlayer {


    public void playMusic() {
        System.out.println("playmusic");
    }



    public void playVideo() {
        System.out.println("playVideo");
    }

}
