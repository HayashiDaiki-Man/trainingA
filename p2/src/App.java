// import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> prefs = new LinkedHashMap<String, Integer>();
        prefs.put("京都府", 255);
        prefs.put("東京都", 1261);
        prefs.put("熊本県", 181);
        prefs.put("岩手県", 122);
        // キーを指定して値を取得
        int tokyo = prefs.get("東京都");
        int iwate = prefs.get("岩手県");
        System.out.println("東京都の人口は、" + tokyo);
        System.out.println("岩手県の人口は、" + iwate);
        prefs.remove("京都府");
        prefs.put("熊本県", 185);
        int kumamoto = prefs.get("熊本県");
        System.out.println("熊本県の人口は、" + kumamoto);
        prefs.put("岩手県", 555);
        int iwateken = prefs.get("岩手県");
        System.out.println("岩手県の人口は、" + iwateken + "ではないおw");
        System.out.println("格納されているペアの数は" + prefs.size() + "つでござる");
        for(String key : prefs.keySet()){
            int value = prefs.get(key);
            System.out.println(key + "の人口は、" + value + "です");
        }
    }
}
