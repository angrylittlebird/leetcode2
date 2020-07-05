package com.learning;

import java.io.*;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/5/22
 * @Description:
 */
public class ListNode implements Serializable {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode createListNode(List<Integer> list) {
        ListNode listNode = new ListNode(list.get(0));
        ListNode cur = listNode;
        for (int i = 1; i < list.size(); i++) {
            cur.next = new ListNode(list.get(i));
            cur = cur.next;
        }

        return listNode;
    }

    public ListNode(List<Integer> list) {
        this(list.get(0));
        ListNode cur = this;
        for (int i = 1; i < list.size(); i++) {
            cur.next = new ListNode(list.get(i));
            cur = cur.next;
        }

    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            sb.append(cur.val).append("->");
            cur = cur.next;
        }
        sb.append("null");
        System.out.println(sb.toString());
    }

    public boolean compare(List<Integer> list) {
//        int count = 0;
//        ListNode cur = this;
//        while (cur != null && count < list.size()) {
//            if (cur.val != list.get(count++)) {
//                return false;
//            }
//            cur = cur.next;
//        }
//        return count == list.size() && cur == null;

        ListNode cur = this;
        for (Integer integer : list) {
            if (cur == null || cur.val != integer) {
                return false;
            }
            cur = cur.next;
        }

        return cur == null;
    }

    public ListNode cloneMyself(){
        ListNode cloneObj = null;
        try {
            //写入字节流
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream obs = new ObjectOutputStream(out);
            obs.writeObject(this);
            obs.close();

            //分配内存，写入原始对象，生成新对象
            ByteArrayInputStream ios = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(ios);
            //返回生成的新对象
            cloneObj = (ListNode)ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cloneObj;
    }

    @Override
    public String toString() {
        Integer nextVal = next == null ? null : next.val;
        return "val=" + val +
                ", next=" + nextVal;
    }
}
