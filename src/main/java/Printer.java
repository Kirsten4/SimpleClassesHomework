public class Printer {

    private int sheetsOfPaperLeft;
    private int tonerVolume = 80;

    public Printer(int sheetsOfPaperLeft){
        this.sheetsOfPaperLeft = sheetsOfPaperLeft;
    }

    public int getSheetsOfPaperLeft(){
        return this.sheetsOfPaperLeft;
    }

    public void print(int pages, int copies){
        int totalPages = pages * copies;
        if (totalPages <= sheetsOfPaperLeft && totalPages <= tonerVolume){
            this.sheetsOfPaperLeft -= totalPages;
            this.tonerVolume -= totalPages;
        }
    }

    public int getToner(){
        return this.tonerVolume;
    }

}
