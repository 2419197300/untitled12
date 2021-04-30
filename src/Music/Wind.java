package Music;

class Wind extends Instrument {
    //重写接口方法
    public void play(Note n){
        System.out.println("Music.Wind.play()"+n);
    }
    String what() {
        return "Music.Wind"; }
    void adjust() {
        System.out.println("Adjusting Music.Wind"); }
}