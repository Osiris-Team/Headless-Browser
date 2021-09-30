package com.osiris.headlessbrowser;

import org.junit.jupiter.api.Test;

class NodeWindowTest {

    public static void main(String[] args) throws Exception {
        HBrowser hBrowser = new HBrowser();
        try (NodeWindow window = hBrowser.openCustomWindow().debugOutputStream(System.out).buildNodeJSWindow()) {
            window.load("https://github.com/Osiris-Team");
            System.out.println(window.getBrowserType());
            window.printCookiesAsJsonArray();
            //TODO window.download("https://github.com/Osiris-Team/AutoPlug-Releases/raw/master/stable-builds/AutoPlug-Client.jar",
            //       new File("AutoPlug-Client.jar"));
        }
    }

    @Test
    void testMethods() throws Exception {

    }
}