package main.java.autoCompletesystem;

import java.util.*;

public class AutocompleteSystem {
    TrieNode root;
    Map<Character, List<Word>> count = new HashMap<>();

    public AutocompleteSystem(String[] sentences, int[] times) {
        root = new TrieNode();
        int i = 0;
        for (String s : sentences) {
            insert(s, times[i++]);
        }
        for (List<Word> list : count.values()) {
            list.sort((a, b) -> b.time - a.time);
        }

    }

    public void insert(String s, int time) {
        TrieNode current = root;
        count.putIfAbsent(s.charAt(0), new ArrayList<>());
        for (char c : s.toCharArray()) {
            current.map.putIfAbsent(c, new TrieNode());
            current = current.map.get(c);
        }
        count.get(s.charAt(0)).add(new Word(s, time));
    }

    public List<String> input(char c) {
        TrieNode current = root;
        List<String> res = new ArrayList<>();
        if (c == '#') {
            return new ArrayList<>();
        }
        if (current.map.get(c) == null) {
            return new ArrayList<>();
        } else {
            int j = 0;
            for (Word w : count.get(c)) {
                if (j < 3) {
                    res.add(w.s);
                    j++;
                } else break;
            }
            return res;
        }
    }
}
class TrieNode{
Map<Character,TrieNode> map = new HashMap<>();
String word;
}
class Word{
    String s;
    int time;
    public Word(String s, int time){
        this.s=s;
        this.time=time;
    }
}
