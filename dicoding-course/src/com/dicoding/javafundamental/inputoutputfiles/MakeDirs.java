package com.dicoding.javafundamental.inputoutputfiles;

import java.io.File;

public class MakeDirs {
    public static void main(String[] args) {
        String dirName = "/home/pratama/WeLoveJava/WeBornInJava";
        String dirName2 = dirName + "/tes";
        File file = new File(dirName);
        File file2 = new File(dirName2);

        // Buat directory
        // file.mkdirs(); // mkdir -p
        file2.mkdir(); // mkdir
    }
}
