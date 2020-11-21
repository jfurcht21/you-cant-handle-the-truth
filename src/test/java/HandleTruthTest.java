import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        //HandleTruth.wordCount();
    }

    @Test
    public void realTest() {
        String[] testInputs = {
                "son we live in a world that has walls and those walls have to be guarded by men with guns whos gonna do it you you lieutenant weinberg i have a greater responsibility than you can possibly fathom you weep for santiago and you curse the marines you have that luxury you have the luxury of not knowing what i know that santiagos death while tragic probably saved lives and my existence while grotesque and incomprehensible to you saves lives you dont want the truth because deep down in places you dont talk about at parties you want me on that wall you need me on that wall we use words like honor code loyalty we use these words as the backbone of a life spent defending something you use them as a punchline i have neither the time nor the inclination to explain myself to a man who rises and sleeps under the blanket of the very freedom that i provide and then questions the manner in which i provide it i would rather you just said thank you and went on your way otherwise i suggest you pick up a weapon and stand a post either way i dont give a damn what you think you are entitled to",
                "Lets lets Test test Capital capital Letters letters",
                "Lets Test test lets test",
                ""
        };

        TreeMap<Integer, Set<String>> expected1 = new TreeMap<>();
        Set<String> set1 = new HashSet<>(Arrays.asList("you"));
        expected1.put(18, set1);
        Set<String> set2 = new HashSet<>(Arrays.asList("the"));
        expected1.put(9, set2);
        Set<String> set3 = new HashSet<>(Arrays.asList("a","and","i"));
        expected1.put(8, set3);
        Set<String> set4 = new HashSet<>(Arrays.asList("that"));
        expected1.put(6, set4);
        Set<String> set5 = new HashSet<>(Arrays.asList("have","to"));
        expected1.put(5, set5);
        Set<String> set6 = new HashSet<>(Arrays.asList("in", "use", "of", "dont", "we", "on"));
        expected1.put(3, set6);
        Set<String> set7 = new HashSet<>(Arrays.asList("lives", "want", "words", "it", "while", "way", "as", "walls", "what", "provide", "me", "luxury", "wall"));
        expected1.put(2, set7);
        Set<String> set8 = new HashSet<>(Arrays.asList("explain", "very", "guns", "saved", "lieutenant", "about", "your", "these", "saves", "would", "pick", "fathom", "grotesque", "incomprehensible", "because", "greater", "give", "sleeps", "went", "loyalty", "myself", "them", "then", "something", "at", "knowing", "santiago", "curse", "weinberg", "entitled", "whos", "be", "probably", "world", "freedom", "responsibility", "are", "by", "tragic", "backbone", "man", "stand", "inclination", "think", "gonna", "suggest", "places", "thank", "under", "punchline", "honor", "existence", "defending", "questions", "do", "manner", "down", "either", "son", "post", "than", "talk", "has", "up", "those", "possibly", "which", "otherwise", "need", "like", "my", "parties", "know", "santiagos", "rises", "who", "deep", "code", "death", "rather", "for", "weep", "life", "nor", "guarded", "can", "weapon", "not", "men", "said", "just", "live", "spent", "damn", "with", "truth", "marines", "neither", "time", "blanket"));
        expected1.put(1, set8);

        TreeMap<Integer, Set<String>> expected2 = new TreeMap<>();
        Set<String> set9 = new HashSet<>(Arrays.asList("capital", "test", "lets", "letters"));
        expected2.put(2, set9);

        TreeMap<Integer, Set<String>> expected3 = new TreeMap<>();
        Set<String> set10 = new HashSet<>(Arrays.asList("test"));
        expected3.put(3, set10);
        Set<String> set11 = new HashSet<>(Arrays.asList("lets"));
        expected3.put(2, set11);

        TreeMap<Integer, Set<String>> expected4 = new TreeMap<>();

        TreeMap<Integer, Set<String>>[] expectedResults = new TreeMap[4];
        expectedResults[0] = expected1;
        expectedResults[1] = expected2;
        expectedResults[2] = expected3;
        expectedResults[3] = expected4;

        //assertEquals(HandleTruth.wordCount(testInputs[1]),expected1);
        for (int i = 0; i < testInputs.length; i++) {
            TreeMap<Integer, Set<String>> result = HandleTruth.wordCount(testInputs[i]);
            assertEquals(result, expectedResults[i]);
        }
    }
}
