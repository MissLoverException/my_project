package com.missloverexception.project.interview.test;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class StreamTest {

    private String name;

    private String desc;

    public static int getMaxLength(List<String> sList) {
        return sList.stream().filter(s -> startWith(s, "a")).mapToInt(s -> length(s)).sum();
    }

    public static boolean startWith(String s, String a) {
        boolean b = s.startsWith(a);
        System.out.println(s + " startWith " + a +" is: " + b);
        return b;
    }

    public static int length(String s) {
        int length = s.length();
        System.out.println(s + " length is: " + s.length());
        return length;
    }

    public static void main(String[] args) {
        String[] ss = new String[] {"abb","abcd","fegc","efe","adfes"};
        System.out.println(getMaxLength(Arrays.asList(ss)));
    }
}
