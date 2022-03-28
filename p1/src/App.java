// import java.util.ArrayList;
import java.util.HashSet;
// import java.util.Iterator;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        /*
         * ArrayList<String> names = new ArrayList<String>();
         * names.add("はやし");
         * names.add("こばやし");
         * names.add("おおばやし");
         * // Iteratorを用いた場合（順番に取り出す）
         * Iterator<String> it = names.iterator();
         * while(it.hasNext()){
         * String e = it.next();
         * System.out.println(e);
         * }
         * // 拡張for文を用いた場合（順番に取り出す）
         * for(String s : names){
         * System.out.println(s);
         * }
         * ArrayList<Integer> ali = new ArrayList<Integer>();
         * ali.add(23);
         * ali.add(10);
         * ali.add(99);
         * ali.add(33);
         * for(Integer i : ali){
         * System.out.println(i+i);
         * }
         */
        Set<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("bulue");
        colors.add("green");
        // 重複する値は無視される
        colors.add("red");

        System.out.println("色は" + colors.size() + "種類です。");
        for (String s : colors) {
            System.out.println(s);
        }
    }
}
