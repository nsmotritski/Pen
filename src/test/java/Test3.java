import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {

        //Validate that a Pen can be created with specific parameters
        @Test
        @Parameters({"inkContainerValue","sizeLetter","color","expected"})
        public void testPenCreated(int inkContainerValue,double sizeLetter,String color,boolean expected) {
            Assert.assertEquals((new Pen(inkContainerValue,sizeLetter,color)instanceof Pen),expected);
        }
}
