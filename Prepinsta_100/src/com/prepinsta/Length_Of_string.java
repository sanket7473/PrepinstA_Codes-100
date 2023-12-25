package com.prepinsta;

public class Length_Of_string {
    public static void main(String[] args) {
        String s1=" hello avvashj";
        int count=0;
        for (char c:s1.toCharArray()) {
            count++;
        }
        System.out.println(count);
    }
}
