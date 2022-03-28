import javax.swing.*;

public class App {
    public static void main(String[] args) {
        var f = new JFrame("test");
        f.setVisible(true);
        f.setSize(600, 400);
        f.setLocation(200, 200);
        f.getLocation();
        var t = new JTextField();
        f.add("North", t);
        f.validate();
        t.setText("hey");
        var a = t.getText();
        System.out.println(a);
        var t2 = new JTextField("second");
        f.add("South", t2);
        f.validate();
        var b = new JButton("button");
        f.add("Center",b);
        f.validate();
        b.addActionListener(ae -> t.setText(t2.getText().toUpperCase()));
        f.setVisible(true);

    }
}
