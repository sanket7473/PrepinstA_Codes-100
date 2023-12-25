package com.prepinsta;

public class Check_alphabet_is {
    public static void main(String[] args) {
        String s1="/";
        if(s1.charAt(0)>='A'&& s1.charAt(0)<='Z' || s1.charAt(0)>='a' && s1.charAt(0)<='z')
        {
            System.out.println("Character is a alphabet");
        }
        else
        {
            System.out.println("Character is not a alphabet");
        }
    }
}
