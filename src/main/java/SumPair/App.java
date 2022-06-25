package main.java.SumPair;

public class App {
    /*
    ["MapSum", "insert", "sum", "insert", "sum"]
[[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]

["MapSum","insert","sum","insert","sum"]
[[],["apple",3],["apple"],["app",2],["ap"]]
     */
    public static void main(String[] args){
        MapSum mapSum = new MapSum();
        mapSum.insert("apple",3);
       int score= mapSum.sum("apple");
        mapSum.insert("app",2);
        mapSum.insert("apple",2);
       score= mapSum.sum("ap");
       System.out.println(score);
    }
}
