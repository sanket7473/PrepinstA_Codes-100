package com.prepinsta;

public class Vowel_Or_Consonant {
    public static void main(String[] args) {
        String s1="s";
        if(s1.charAt(0)=='a' || s1.charAt(0)=='A' ||s1.charAt(0)=='e' ||s1.charAt(0)=='E' ||
                s1.charAt(0)=='i' ||s1.charAt(0)=='I' || s1.charAt(0)=='o' ||s1.charAt(0)=='O' ||
                s1.charAt(0)=='u' ||s1.charAt(0)=='U')
        {
            System.out.println("Character is vowel");
        }
        else
        {
            System.out.println("Character is a Consonants");
        }
    }
}
