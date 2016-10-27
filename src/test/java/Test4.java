import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {

    //Validate that a Pen is working if it's inkContainerValue is not empty
    @Test
    @Parameters({"inkContainerValue","expected"})
    public void testIfPenIsWorking(int inkContainerValue,boolean expected) {
        Pen myPen = new Pen(inkContainerValue);
        boolean actual = myPen.isWork();
        Assert.assertEquals(actual,expected);
    }
}