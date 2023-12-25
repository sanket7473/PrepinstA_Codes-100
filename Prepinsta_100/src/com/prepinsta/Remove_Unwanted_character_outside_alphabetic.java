package com.prepinsta;

public class Remove_Unwanted_character_outside_alphabetic {
    public static void main(String[] args) {
        String s1="ssahajk__@@$$$AJkdjdskl";
        String alphaBet="";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)>='A' && s1.charAt(i)<='Z' || s1.charAt(i)>='a' && s1.charAt(i)<='z')
            {
              alphaBet=alphaBet+s1.charAt(i);
            }
        }
        System.out.println("After removing all the special character");
        System.out.println(alphaBet);
    }
}
