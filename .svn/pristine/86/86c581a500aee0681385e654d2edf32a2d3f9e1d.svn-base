package com.missloverexception.project.utils.dataStructure.LinkedList;

/**
 * @Auther: Chang.hy
 * @Description:
 * @Date: Create in 19:59 2018/8/8
 * @Modified By:
 */
public class SinglyLinkedList<T> {

    private class Node<T>{

        //数据
        private T data;

        //下一个
        private Node<T> next;

        public Node() {
            data = null;
        }

        public Node(T data) {
            this.data =  data;
        }
    }
    private Node head;
    private Node rear;
    private Node pointer;
    private int length;

    public SinglyLinkedList() {
        head = new Node();
        rear = head;
        length = 0;
    }

    public void add(T data) {
        //指针对象指向最后一个
        pointer = new Node(data);
        //
        rear.next = pointer;
        rear = pointer;
        length++;
    }

    public void clear() {
        //相当于遍历了一遍
        while (null != head.next) {
            head.next = head.next.next;
        }
        rear = head;
        pointer = null;
        length = 0;
        System.gc();
    }

    /**
     * 将
     * @param index
     * @return
     */
    private Node movePointer(int index) {
        if (index > 0 && index <= length) {
            pointer = head;
            while (null != pointer.next) {
                if (index == 0) {
                    break;
                }
                index--;
                pointer = pointer.next;
            }
        }
        return pointer;
    }

    public void insert(int index, T data) {
        //和length相等的时候是在尾部插入
        if (index > 0 && index <= length) {
            pointer = movePointer(index);
            //单链表，只需要考虑当前和下一个结点就行了
            Node temp = new Node(data);
            temp.next = pointer.next;
            pointer.next = temp;
            length++;
        } else {
            System.out.println("没有指定的位置");
        }
    }

    public void remove(int index) {
        if (index > 0 && index <= length) {
            //这是我要删除的元素
            pointer = movePointer(index);
            //将中间的引用变量指向
            Node temp = pointer.next;
            pointer.next = temp.next;

        }
    }

    public void set(int index, T data) {
        if (index > 0 && index <= length) {
            pointer = movePointer(index);
            pointer.next.data = data;
        }
    }

    public T find(int index) {
        if (index > 0 && index <= length) {
             pointer = movePointer(index);
             return (T) pointer.next.data;
        }
        return null;
    }

    public int search(T data) {
        pointer = head;
        int index = 0;
        while (null != pointer.next) {
            if (pointer.next == data) {
                break;
            }
            index++;
            pointer = pointer.next;
        }
        return index;
    }

    public void print() {
        pointer = head;
        if (null != head) {
            System.out.print("[" + head.data + "]");
        }
        while (null != pointer.next) {
            System.out.print("➜[" + pointer.next.data + "]");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public int getLength() {
        return this.length;
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add("111");
        list.add("222");
        list.insert(1, "ii1");
        list.insert(2, "ii2");
        list.add("do you");
        System.out.println(list.find(2));
        list.print();
    }
}