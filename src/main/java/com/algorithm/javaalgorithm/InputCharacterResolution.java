package com.algorithm.javaalgorithm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InputCharacterResolution {
    /*问题描述
    * 字符串a = abcabc   b = aaabbbbcccc
    * 输出 c = a:3,b:3,c:3   */
    public static void main(String[] args) {
        String a = "abcabc";
        String b = "aaabbbccc";
        char[] chara = a.toCharArray();
        char[] charb = b.toCharArray();
        Set<Character> aset = new HashSet();
        for(char i:chara){
            aset.add(i);
        }
        System.out.println(aset.toString());
        StringBuffer result = new StringBuffer();
       for(Character j:aset){
           int num =0;
           for(char g:charb){
               if(j==g){
                   num++;
               }
           }
           result.append(j+":"+num+",");
       }
       System.out.println(result.toString().substring(0,result.length()-1));
    }
}
