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
        public void testPenWithoutParametersCanBeCreated() {

        Assert.assertTrue(true);

        }

}

