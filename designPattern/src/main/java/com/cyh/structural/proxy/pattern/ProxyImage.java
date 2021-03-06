package com.cyh.structural.proxy.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class ProxyImage {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
