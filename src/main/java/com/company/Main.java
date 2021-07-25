package com.company;

import org.apache.commons.io.FilenameUtils;

public class Main {

    public static String getFileExtension(String fileName)
    {
        return FilenameUtils.getExtension(fileName);
    }

    public static void main(String[] args) {

        System.out.println(getFileExtension("test.txt"));

    }
}
