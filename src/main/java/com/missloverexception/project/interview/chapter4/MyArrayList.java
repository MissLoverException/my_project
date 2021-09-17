package com.missloverexception.project.interview.chapter4;

public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] EMPTY_ELEMENT_DATA = {};

    private transient Object[] elementData;

    private int size;

    public MyArrayList() {
        elementData = EMPTY_ELEMENT_DATA;
    }

    public MyArrayList(int capacity) {
        elementData = new Object[capacity];
//        size =
    }

    public void add(Object o) {
        //确保容量，扩容
        ensureCapacity(size + 1);
        //添加
        elementData[size++] = o;
    }

    private void ensureCapacity(int minCapacity) {
        if (elementData == EMPTY_ELEMENT_DATA) {
            minCapacity = Math.max(minCapacity, DEFAULT_CAPACITY);
            elementData = new Object[minCapacity];
        }
        if (minCapacity - elementData.length > 0) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if (minCapacity - newCapacity > 0) {
                newCapacity = minCapacity;
            }
            Object[] newObject = new Object[newCapacity];
            System.arraycopy(elementData, 0, newObject, 0, elementData.length);
            elementData = newObject;
        }
        System.out.println("elementData length is " + elementData.length);
    }

    public int size() {
        return size;
    }

    public Object get(int i) {
        rangeCheck(i);
        return elementData[i];
    }

    public int indexOf(Object o) {
        if (null == o) {
            for (int i = 0; i < elementData.length; i++) {
                if (null == elementData[i]) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < elementData.length; i++) {
                if (o.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public Object set(int i, Object o) {
        rangeCheck(i);
        Object oldO = elementData[i];
        elementData[i] = o;
        return oldO;
    }

    public void remove(Object o) {
        int i = indexOf(o);
        if (i > 0) {
            int moveNum = size - i - 1;
            System.arraycopy(elementData, i + 1, elementData, i, moveNum);
            elementData[--size] = null;
        }
    }

    public void rangeCheck(int i) {
        if (i < 0 || i > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                sb.append(elementData[i].toString()).append(", ");
            }
        }
        if (sb.length() > 1) {
            return sb.substring(0, sb.length() - 2) + "]";
        } else {
            return sb.append("]").toString();
        }
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 65; i < 91; i++) {
            myArrayList.add((char) i);
        }
        System.out.println("size is " + myArrayList.size());
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.set(5, "update"));
        System.out.println(myArrayList.indexOf("update"));
        myArrayList.remove('K');
        myArrayList.remove("M");
        System.out.println(myArrayList.toString());
        System.out.println("size is " + myArrayList.size());

    }


}
