package Practices;

import java.util.StringJoiner;

public class StringJ {
    public static void main(String[] args) {
        StringJoiner str=new StringJoiner(",","[","]");
        str.add("a").add("b").add("c");
        System.out.println(str);

        StringJoiner str1=new StringJoiner(":");
        str1.add("p").add("q");
        System.out.println(str1);

        str1.merge(str);
        System.out.println(str1);

    }}



