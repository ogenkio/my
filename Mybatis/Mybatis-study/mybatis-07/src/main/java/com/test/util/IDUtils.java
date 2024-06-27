package com.test.util;

import java.util.UUID;

public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void main(String[] args) {
        System.out.println(IDUtils.getId());
    }
}
