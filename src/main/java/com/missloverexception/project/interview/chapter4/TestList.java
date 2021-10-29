package com.missloverexception.project.interview.chapter4;

import java.lang.reflect.Field;
import java.util.*;

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

//        ArrayList<String> list = new ArrayList<>(20);
//        for (int i = 0; i < 20; i++) {
//            list.add(String.valueOf(i));
//        }
//        String s = list.set(10, "update");
//        System.out.println(s);
//        System.out.print(list.toString());

        Map<Integer, Long> map = new LinkedHashMap<>();
        for (int m = 0; m <= 8; m++) {
            int n = (int) Math.pow(10, m);
            List<Integer> resultList = new ArrayList<>();
            long start = System.currentTimeMillis();
            for (int i = 1; i <= n; i += 2) {
                boolean flag = false;
                for (int j = 3; j <= Math.sqrt(i); j ++) {
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
//                System.out.println(i);
                    resultList.add(i);
                }
            }
//            System.out.println(System.currentTimeMillis() - start);
            map.put(n, System.currentTimeMillis() - start);
        }
        System.out.println(map.toString());

//        System.out.println(resultList.toString());
    }
}
