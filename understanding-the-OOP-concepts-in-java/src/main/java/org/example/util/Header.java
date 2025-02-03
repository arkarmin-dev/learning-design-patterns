package org.example.util;

public class Header {

    public static void writeHeader(String header) {

        line(header);
        System.out.println(header);
        line(header);
    }

    private static void line(String header) {
        for(int i = 0; i < header.length(); i++){
            System.out.print("=");
        }
        System.out.println();
    }
}
