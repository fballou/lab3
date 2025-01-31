import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListTests{

    @Test
    public void largeList() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("swag", "weather and stuff", "and", "andy", "sweet"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("weather and stuff", "and", "andy"));

        List<String> test = ListExamples.filter(input, new HasAnAnd());

        assertArrayEquals(expected.toArray(), test.toArray());
    }
    
}

class HasAnAnd implements StringChecker {
    public boolean checkString(String s) {
        if (s.contains("and")) {
            return true;
        }
        return false;
    }
}

