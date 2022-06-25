package main.java.replace.words.trie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    TrieNode root;
    StringBuilder result;
    public String replaceWords(List<String> dictionary, String sentence) {
        root = new TrieNode();
        this.result= new StringBuilder();
        String[] words = sentence.split(" ");
        for(String dict:dictionary){
            insert(dict);
        }

        for(String word:words){
           if(result.length()>0){
               result.append(" ");
           }
           build(word);
        }
        return result.toString();
    }
    public void insert(String dict){
        TrieNode curr=root;
        for(char c: dict.toCharArray()){
            curr.map.putIfAbsent(c,new TrieNode());
            curr=curr.map.get(c);
        }
        curr.word=dict;
    }
    public void build(String prefix){
        TrieNode curr = root;

        for(char c: prefix.toCharArray()) {
            if(curr.map.get(c)==null||curr.word!=null){
                break;
            }
            curr=curr.map.get(c);
        }
        result.append(curr.word==null?prefix:curr.word);
    }
}
class TrieNode {
    Map<Character,TrieNode> map= new HashMap<>();
    String word;
}
