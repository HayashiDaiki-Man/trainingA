import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;

public class App {
    public static void main(String[] args) {

        // BufferedImage(width,height,BufferedImage.color)だと思っておく
        var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        // 2Dgraphicsを作成
        var g = image.createGraphics();
        // 変数xやyに応じた場所に〇を書く
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 12; y++) {
                if (x == 3 || x % 2 == 0) {
                    g.setColor(Color.red);
                }else{
                    g.setColor(Color.white);
                }
                g.fillOval(x * 30 + 50, y * 30 + 20, 25, 25);
            }
        }
        var f = new JFrame("格子");
        // 閉じるボタンを押した時にアプリケーションを終了する
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel(new ImageIcon(image)));
        // 設定した
        f.pack();
        // Windowを表示するらしい
        f.setVisible(true);
    }
}
