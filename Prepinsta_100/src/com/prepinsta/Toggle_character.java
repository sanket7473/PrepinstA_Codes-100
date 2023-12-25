package com.prepinsta;

public class Toggle_character {
    public static void main(String[] args) {
        String s1="HeLLowOrLD";
        String rev="";

        for(int i=0;i<s1.length();i++)
        {
            /*Character is a wrapper class for converting char into Character objects.
            It provides a different methods like isUpperCase,isLowerCase,isLetter,isDigit.
            */
            if(Character.isUpperCase(s1.charAt(i)))
            {
              rev=rev+Character.toLowerCase(s1.charAt(i));
            }
            else
            {
                rev=rev+Character.toUpperCase(s1.charAt(i));
            }
        }
        System.out.println(rev);
    }
}
