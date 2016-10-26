import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

        //Validate that it is possible write a word or a part of word with the Pen
        @Test
        @Parameters({"myName","inkContainerValue","sizeLetter","color"})
        public void testWriteWord(String myName,int inkContainerValue,double sizeLetter,String color) {
            Pen mypen = new Pen(inkContainerValue,sizeLetter,color);
            double sizeOfWord = myName.length()*sizeLetter;
            String partOfWord = myName;
            if (inkContainerValue<sizeOfWord) {
                partOfWord = myName.substring(0, inkContainerValue);
            }
            Assert.assertEquals(mypen.write(myName),partOfWord);
        }

}

