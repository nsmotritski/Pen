import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

      /*  @Test()
        public void testPenWithoutParamentersCanBeCreated() {

            Assert.assertTrue(isInstance(Pen(), Pen));

        }*/

        @Test
        @Parameters("myName")
        public void testWriteWord(String myName) {
            Pen mypen = new Pen(100,1.1,"BLUE");
            Assert.assertTrue(mypen.write(myName)== myName);
        }

}

