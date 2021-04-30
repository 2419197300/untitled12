package Music;

public class Instrument {
    void play(Note n){
        System.out.print("Music.Music.Instrument.play()"+n);
    }
    String What() {
        return "Music.Music.Instrument"; }
    void adjust() {
        System.out.println("Adjusting Music.Music.Instrument");
    }
    public String toString(){
        return What();
    }
}
