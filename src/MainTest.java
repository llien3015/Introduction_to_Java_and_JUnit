import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends CoreTestCase
{

   @Before
   public void textStartTest()
   {
        System.out.println("Start test");
   }
   @Test
    public void firstTest()
   {
     int expected = 20;
     int actual = 5*5;

      Assert.assertTrue("5*5 != 25",actual == expected);
   }
}

