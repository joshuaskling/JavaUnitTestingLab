import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;

public class LargestTest extends TestCase {

public void test() {
    
    int[] arr = new int[3];
    arr[0] = 8;
    arr[1] = 9;
    arr[2] = 7;

    assertEquals(9, Largest.largest(arr));
   }

}