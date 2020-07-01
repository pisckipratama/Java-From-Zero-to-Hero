package com.dicoding.javafundamental.inputoutputfiles;

import java.io.File;

public class ListFolders {
    public static void main(String[] args) {
        String dirName = "/home/pratama";
        File file = null;
        String[] paths;

        try {
            // intansiasi object file
            file = new File(dirName);

            // ambil list files dan masukkan ke string path
            paths = file.list();

            // tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
