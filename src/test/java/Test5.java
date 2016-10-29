import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Test5 {

    //Validate that doSomethingElse method prints something to console
    @Test
    @Parameters({"inkContainerValue","sizeLetter","color"})
    public void testDoSomethingElse(int inkContainerValue,double sizeLetter,String color) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Pen myPen = new Pen(inkContainerValue,sizeLetter,color);
        myPen.doSomethingElse();
        Assert.assertTrue(!(outContent.toString().matches("^$")));
    }
}
