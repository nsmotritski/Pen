import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

    //Validate that it is possible to find out the color of the Pen
    @Test
    @Parameters({"inkContainerValue","sizeLetter","color"})
    public void testWriteWord(int inkContainerValue,double sizeLetter,String color) {
        Pen mypen = new Pen(inkContainerValue,sizeLetter,color);
        Assert.assertEquals(mypen.getColor(),color);
    }

}
