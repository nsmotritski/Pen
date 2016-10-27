import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

        //Validate that the Pen writes words correctly
        @Test
        @Parameters({"myName","inkContainerValue","sizeLetter","expected"})
        public void testWriteWord(String myName,int inkContainerValue,double sizeLetter,String expected) {
            Pen mypen = new Pen(inkContainerValue,sizeLetter);
            Assert.assertEquals(mypen.write(myName),expected);
        }

}

