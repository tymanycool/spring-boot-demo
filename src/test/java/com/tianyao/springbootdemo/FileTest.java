package com.tianyao.springbootdemo;

import sun.misc.IOUtils;

import java.io.File;
import java.io.FileInputStream;

public class FileTest {
    public static void main(String[] args) throws Exception{
        File file = new File("src/main/resources/test.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] b = new byte[fis.available()];
        fis.read(b);
        System.out.println(b[0]);
        String s = new String(b);
        System.out.println(s);
    }
}
