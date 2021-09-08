package com.missloverexception.project.interview.test;

public class TestTryCatch {

    public int testStart() {
        int i = 0;
        try {
            throw new Exception();
//           return i++;
        } catch (Exception e) {
            return i += 2;
        } finally {
            return i + 3;
        }
    }

    public static void main(String[] args) {
        TestTryCatch test = new TestTryCatch();
        System.out.println(test.testStart());
    }
}
