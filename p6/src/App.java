import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = List.of("yamato","banana","takeru");
        // 拡張for文でやってみる
        for(String n: names){
            // 大文字にしてみる
            System.out.println(n.toUpperCase() + "ゲットだぜ");
        }
    }
}
