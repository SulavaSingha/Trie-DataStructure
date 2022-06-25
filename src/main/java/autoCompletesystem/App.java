package main.java.autoCompletesystem;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        String[] sentences = new String[]{"i love you", "island", "iroman", "i love leetcode"};
        int[] times = new int[]{5, 3, 2, 2};
        AutocompleteSystem autocompleteSystem = new AutocompleteSystem(sentences,times);
        List<String> res = new ArrayList<>();
        res=autocompleteSystem.input('i');
        res.forEach(l->{
            System.out.println(l);
                });
       autocompleteSystem.input(' ').forEach(l->{
                   System.out.println(l);
               }
               );
    autocompleteSystem.input('a').forEach(l->{
        System.out.println(l);
    });
     autocompleteSystem.input('#').forEach(l->{
         System.out.println(l);
     });
    }
}
