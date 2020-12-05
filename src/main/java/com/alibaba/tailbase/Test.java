package com.alibaba.tailbase;

import java.io.*;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        long start = new Date().getTime();
        File file = new File("D:\\Tianchi2020\\trace1.data");
        FileInputStream input = new FileInputStream(file);
        BufferedReader bf = new BufferedReader(new InputStreamReader(input));
        String line;
        while ((line = bf.readLine()) != null) {

        }
        long end = new Date().getTime();
        System.out.println((end - start) * 10);
    }
}
