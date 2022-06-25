package main.java.SumPair;

import java.util.HashMap;
import java.util.Map;

class MapSum {
    TrieNode root;
    Map<String,Integer> wordScore ;
    public MapSum() {
        root = new TrieNode();
        wordScore =  new HashMap<>();
    }

    public void insert(String key, int val) {
        TrieNode current = root;
        int existingValue = wordScore.getOrDefault(key,0);
        wordScore.put(key,val);
        for(char c: key.toCharArray()){
            if(current.map.get(c)==null){
                current.map.put(c,new TrieNode());
            }
            current.score=Math.abs(current.score-existingValue)+val;
            current = current.map.get(c);
        }
        current.score=Math.abs(current.score-existingValue)+val;
    }

    public int sum(String prefix) {
        TrieNode current = root;
        for(char c: prefix.toCharArray()){
            current = current.map.get(c);
            if(current==null)
                return 0;
        }
        return current.score;
    }
}
class TrieNode{
    Map<Character,TrieNode> map = new HashMap<>();
    int score;
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */