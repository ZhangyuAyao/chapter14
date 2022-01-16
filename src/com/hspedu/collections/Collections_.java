package com.hspedu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("tom");

        Collections.reverse(list);
        System.out.println("list" + list);

        Collections.shuffle(list);
        System.out.println("list" + list);

        Collections.sort(list);
        System.out.println("自然排序后" + list);

        // 按照字符串的长度大小来排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(!(o1 instanceof String && o2 instanceof String))
                    return 0;
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        System.out.println("按照字符串长度大小排序=" + list);

        Collections.swap(list, 0, 1);
        System.out.println("交换后的情况");
        System.out.println(list);

        System.out.println("最大元素"+ Collections.max(list));
        Object maxObject = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("长度最大的元素是" + maxObject);


        System.out.println("tom出现次数"+ Collections.frequency(list, "tom"));

        ArrayList dest = new ArrayList();
        Collections.copy(dest, list);
    }
}
