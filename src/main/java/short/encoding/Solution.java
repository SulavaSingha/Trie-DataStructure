import java.util.HashMap;
import java.util.Map;

public class Solution {
    TrieNode root;
    int count=0;
    Map<TrieNode,Integer> wordCount;
    public Solution(){
        root = new TrieNode();
        wordCount=new HashMap<>();
    }
    public int minimumLengthEncoding(String[] words) {
        for(String word:words) {
            insert(word);
        }
        /*for(String key: wordCount.keySet()){
            key.
        }*/
      return count;
    }

    public void insert(String word){
        TrieNode current = root;
        for(char c: word.toCharArray()){
            if(current.map.get(c) == null){
                current.map.put(c,new TrieNode());
                count++;
            }
        }
        //count++;
        current.specialChar='#';
    }
}
class TrieNode {
    Map<Character,TrieNode> map = new HashMap<>();
    char specialChar;
}

