package a;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Sample {

    public void test() {
        try {
            URL url = new URL("http://qiita.com/kohga/items/dccf135b0af395f69144");

            InputStream is = url.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            int i = isr.read();

            while (i != -1) {
                System.out.println((char) i);
                i = isr.read();
            }
            isr.close();
        } catch (Exception e) {
            e.printStackTrace();
                }
    }

}
