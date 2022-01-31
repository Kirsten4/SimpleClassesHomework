public class WaterBottle {
    private int volume = 100;

    public int getVolume(){
        return this.volume;
    }

    public void drink(){
        if (this.volume >= 10) {
            this.volume -= 10;
        }
    }

    public void empty(){
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }
}
