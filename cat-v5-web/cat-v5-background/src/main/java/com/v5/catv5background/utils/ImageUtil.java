package com.v5.catv5background.utils;


import org.apache.commons.lang3.StringUtils;

public class ImageUtil {
    public static String replace100_100(String str){
        String size="100x100";
        str= StringUtils.replace(str,".jpg",String.format("_%s.jpg",size),1);
        System.out.println(str);
        return str;
    }
}
