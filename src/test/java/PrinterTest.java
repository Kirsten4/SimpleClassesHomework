import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void printTestHasPaper(){
        printer.print(3, 25);
        assertEquals(25, printer.getSheetsOfPaperLeft());
    }

    @Test
    public void printTestHasNoPaper(){
        printer.print(5, 25);
        assertEquals(100, printer.getSheetsOfPaperLeft());
    }

    @Test
    public void printTestHasToner(){
        printer.print(3, 25);
        assertEquals(5, printer.getToner());
    }

    @Test
    public void printTestHasNoToner(){
        printer.print(4, 25);
        assertEquals(80, printer.getToner());
    }
}
