import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

        @Test()
        public void testEmailGenerator() {

            Pen obj = new Pen();
            String email = obj.generate();

            Assert.assertNotNull(email);
            Assert.assertEquals(email, "feedback@yoursite.com");

        }

}

