package com.zy.ssm.util.string;

/**
 * @author yu.zou
 * @description
 * @create 2018-03-21
 * @modify by
 */
public class StringUtils {

    public static Boolean startsWithAny(String ... strings){
        int i =0;
        for (String s:strings){
            if(i > 0 && strings[0].startsWith(s)){
                return true;
            }
            i++;
        }
        return false;
    }
    public static Boolean startsWithAny(String method,String[]strings){
        for (String s:strings){
            if(method.startsWith(s)){
                return true;
            }
        }
        return false;
    }
}
