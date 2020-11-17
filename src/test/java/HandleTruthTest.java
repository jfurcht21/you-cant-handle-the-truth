import org.junit.Test;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        HandleTruth.wordCount();
    }

    @Test
    void realTest(){
        //Make wordcount have an output of type TreeMap<Integer, Set<String>>
        actual = HandleTruth.wordCount();
        expected = ;
        assert(expected, actual);
    }
}