import org.junit.* ;
import static org.junit.Assert.* ;

public class SpellCheckTest {

   @Test
   public void test_returnDollar() {
      System.out.println("Test if \"word\" exists") ;
      SpellCheck S = new SpellCheck() ;
      assertTrue(S.Check("word") == true) ;
   }
}