/*import java.time.LocalDate;
import java.util.ArrayList;*/
import java.util.List;


public class App {
    public static void main(String[] args) {
        // 変更可能なArrayList
        // ジェネリクス<>はString型
     /*   var authors = new ArrayList<String>();
        // 追加
        authors.add("yamamoto");
        authors.add("hayashi");
        authors.add("higasinisida");
        // 確認
        System.out.println(authors);
        // 要素数の取得
        var si = authors.size();
        System.out.println(si);
        // 上書き
        authors.set(1, "nisimura");
        System.out.println(authors);
        // 練習
        authors.add("hosoya");
        authors.set(1, "kishida");
        var dates = new ArrayList<LocalDate>();
        var d = LocalDate.now();
        dates.add(d);
        System.out.println(dates); */
        var names = List.of("tt","gg","ll");
        var n = names.get(0);
        System.out.println(n.toUpperCase());

    }
}
