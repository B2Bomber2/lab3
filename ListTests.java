import java.beans.Transient;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> str = new ArrayList<String>();
        str.add("a");
        str.add("bbc news");
        str.add("pin");
        str.add("t");

        List<String> result = new ArrayList<String>();
        result.add("a");
        result.add("t");

        ListExamples sc = new ListExamples();
        
        assertArrayEquals(result.toArray(), ListExamples.filter(str, sc).toArray());
    }
}
