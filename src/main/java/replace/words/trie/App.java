package main.java.replace.words.trie;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Solution sol=new Solution();
        List<String> dictionary = Arrays.asList(new String[]{"cat", "bat", "rat"});
        String sentence = "the cattle was rattled by the battery";
        String result=sol.replaceWords(dictionary,sentence);
        System.out.println(result);
    }
}
