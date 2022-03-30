import java.util.HashMap;

/*
import java.util.Map;
*/
public class App {
    public static void main(String[] args) {
        // Mapを使ってみる
        /*
         * var fruits = Map.of("apple", "りんご", "grape", "ぶどう");
         * System.out.println(fruits);
         * 
         * var a = fruits.get("apple");
         * var g = fruits.get("grape");
         * System.out.println(a + g);
         * 
         * // 値がない場合はnullが返ってくる
         * var b = fruits.get("banana");
         * System.out.println(b);
         */
        // 変更可能なMap(HashMap)
        var animals = new HashMap<String, String>();
        animals.put("dog", "いぬ");
        animals.put("cat", "ねこ");
        System.out.println(animals);
        animals.put("fox", "きつね");
        var as = animals.size();
        System.out.println(as);
        animals.put("hose", "うま");
        var asi = animals.size();
        System.out.println(asi);

        if (as == 2) {
            System.out.println("要素数は" + as);
        } else {
            System.out.println("要素数は2ではない");
        }
    }
}
