import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {

        //Validate that in case there is not enough
        @Test
        @Parameters({"myName","inkContainerValue","sizeLetter","color"})
        public void testWriteWord(String myName,int inkContainerValue,double sizeLetter,String color) {
            Pen mypen = new Pen(inkContainerValue,sizeLetter,color);
            Assert.assertEquals(mypen.write(myName),myName);
        }
}
