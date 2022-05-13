package com;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Demo {

    Desktop d = Desktop.getDesktop();

    public void openBrows() {
        try {
            d.browse(new URI("https://google.com/"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
