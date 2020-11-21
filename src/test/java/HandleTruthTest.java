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
                "Lets lets Test test Capital capital Letters letters",
                "son we live in a world that has walls and those walls have to be guarded by men with guns whos gonna do it you you lieutenant weinberg i have a greater responsibility than you can possibly fathom you weep for santiago and you curse the marines you have that luxury you have the luxury of not knowing what i know that santiagos death while tragic probably saved lives and my existence while grotesque and incomprehensible to you saves lives you dont want the truth because deep down in places you dont talk about at parties you want me on that wall you need me on that wall we use words like honor code loyalty we use these words as the backbone of a life spent defending something you use them as a punchline i have neither the time nor the inclination to explain myself to a man who rises and sleeps under the blanket of the very freedom that i provide and then questions the manner in which i provide it i would rather you just said thank you and went on your way otherwise i suggest you pick up a weapon and stand a post either way i dont give a damn what you think you are entitled to",
                "Lets Test test lets test"
        };
/*
        String[] expectedResults = {
                "{2=[capital, test, lets, letters]}",
                "{18=[you],9=[the],8=[a, and, i],6=[that],5=[have, to],3=[in, use, of, dont, we, on],2=[lives, want, words, it, while, way, as, walls, what, provide, me, luxury, wall],1=[explain, very, guns, saved, lieutenant, about, your, these, saves, would, pick, fathom, grotesque, incomprehensible, because, greater, give, sleeps, went, loyalty, myself, them, then, something, at, knowing, santiago, curse, weinberg, entitled, whos, be, probably, world, freedom, responsibility, are, by, tragic, backbone, man, stand, inclination, think, gonna, suggest, places, thank, under, punchline, honor, existence, defending, questions, do, manner, down, either, son, post, than, talk, has, up, those, possibly, which, otherwise, need, like, my, parties, know, santiagos, rises, who, deep, code, death, rather, for, weep, life, nor, guarded, can, weapon, not, men, said, just, live, spent, damn, with, truth, marines, neither, time, blanket]}",
                "{3=[test],2=[lets]}"
        };
*/
        TreeMap<Integer, Set<String>> expect1 = new TreeMap<>(Collections.reverseOrder());
        Set<String> set1 = new HashSet<>(Arrays.asList("you"));
        expect1.put(18, set1);
        Set<String> set2 = new HashSet<>(Arrays.asList("the"));
        expect1.put(9, set2);
        Set<String> set3 = new HashSet<>(Arrays.asList("a","and","i"));
        expect1.put(8, set3);
        Set<String> set4 = new HashSet<>(Arrays.asList("that"));
        expect1.put(6, set4);
        Set<String> set5 = new HashSet<>(Arrays.asList("have","to"));
        expect1.put(5, set5);
        Set<String> set6 = new HashSet<>(Arrays.asList("in", "use", "of", "dont", "we", "on"));
        expect1.put(3, set6);
        Set<String> set7 = new HashSet<>(Arrays.asList("lives", "want", "words", "it", "while", "way", "as", "walls", "what", "provide", "me", "luxury", "wall"));
        expect1.put(2, set7);
        Set<String> set8 = new HashSet<>(Arrays.asList("explain", "very", "guns", "saved", "lieutenant", "about", "your", "these", "saves", "would", "pick", "fathom", "grotesque", "incomprehensible", "because", "greater", "give", "sleeps", "went", "loyalty", "myself", "them", "then", "something", "at", "knowing", "santiago", "curse", "weinberg", "entitled", "whos", "be", "probably", "world", "freedom", "responsibility", "are", "by", "tragic", "backbone", "man", "stand", "inclination", "think", "gonna", "suggest", "places", "thank", "under", "punchline", "honor", "existence", "defending", "questions", "do", "manner", "down", "either", "son", "post", "than", "talk", "has", "up", "those", "possibly", "which", "otherwise", "need", "like", "my", "parties", "know", "santiagos", "rises", "who", "deep", "code", "death", "rather", "for", "weep", "life", "nor", "guarded", "can", "weapon", "not", "men", "said", "just", "live", "spent", "damn", "with", "truth", "marines", "neither", "time", "blanket"));
        expect1.put(1, set8);


        TreeMap<Integer, Set<String>> expect2 = new TreeMap<>(Collections.reverseOrder());
        Set<String> set9 = new HashSet<>(Arrays.asList("capital", "test", "lets", "letters"));
        expect2.put(2, set9);

        TreeMap<Integer, Set<String>>[] expectedResults = new TreeMap[3];


        assertEquals(HandleTruth.wordCount(testInputs[1]),expect1);
        /*for (int i = 0; i < testInputs.length; i++) {
            TreeMap<Integer, Set<String>> result = HandleTruth.wordCount(testInputs[i]);
            assertEquals(result, expectedResults[i]);
        }*/
    }
}

        /*//Make wordcount have an output of type TreeMap<Integer, Set<String>>
        actual = HandleTruth.wordCount().entrySet();
        expected = ;
        assert(expected, actual);
    }*/

        /**
         * output of TreeMap
         * 18=[you]
         * 9=[the]
         * 8=[a, and, i]
         * 6=[that]
         * 5=[have, to]
         * 3=[in, use, of, dont, we, on]
         * 2=[lives, want, words, it, while, way, as, walls, what, provide, me, luxury, wall]
         * 1=[explain, very, guns, saved, lieutenant, about, your, these, saves, would, pick, fathom, grotesque, incomprehensible, because, greater, give, sleeps, went, loyalty, myself, them, then, something, at, knowing, santiago, curse, weinberg, entitled, whos, be, probably, world, freedom, responsibility, are, by, tragic, backbone, man, stand, inclination, think, gonna, suggest, places, thank, under, punchline, honor, existence, defending, questions, do, manner, down, either, son, post, than, talk, has, up, those, possibly, which, otherwise, need, like, my, parties, know, santiagos, rises, who, deep, code, death, rather, for, weep, life, nor, guarded, can, weapon, not, men, said, just, live, spent, damn, with, truth, marines, neither, time, blanket]
         */
