package com.missloverexception.project.interview.chapter4;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) throws Exception {
//        List<String> list = new ArrayList<>();
//        System.out.println(list.size());
////        Field field = list.getClass().getDeclaredField("elementData");
////        Object[] elementData = (Object[]) field.get(list);
////        System.out.println(elementData.length);
//        for (int i = 0; i < 20; i++) {
//            list.add(String.valueOf(i + 1));
//            System.out.println(list.size());
//        }
//        list.add("last");

        ArrayList<String> list = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            list.add(String.valueOf(i));
        }
        String s = list.set(10, "update");
        System.out.println(s);
        System.out.print(list.toString());
    }
}
