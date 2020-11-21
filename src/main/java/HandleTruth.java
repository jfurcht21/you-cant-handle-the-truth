import java.util.*;

public class HandleTruth {
    public static TreeMap<Integer, Set<String>> wordCount(String msg) {
        TreeMap<Integer, Set<String>> sortedMap = new TreeMap<>(Collections.reverseOrder());
        if(msg == null || msg == ""){
            return sortedMap;
        }
        // split the message into word set
        String[] words = msg.split(" ");

        //Ignore Case
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].toLowerCase();
        }

        // use map to count the occurrences of each word
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
                continue;
            }
            wordMap.put(word, 1);
        }

        // sort the map based on number of occurrences
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            int key = entry.getValue();
            Set<String> values = sortedMap.containsKey(key) ?
                    sortedMap.get(key) : new HashSet<>();
            values.add(entry.getKey());
            sortedMap.put(entry.getValue(), values);
        }
        return sortedMap;

    }
}