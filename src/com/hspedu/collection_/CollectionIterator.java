package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中", 10.1));
        col.add(new Book("小李飞刀","古龙", 5.1));
        col.add(new Book("红楼梦","曹雪芹", 34.6));

        //1. 调用迭代器
        Iterator iterator = col.iterator();

        //2. 使用 while 遍历迭代器
        //快速实现 while => itit
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj=" + obj);
        }

        //3. 当退出while循环后，这是Iterator迭代器指向最后的元素
        //iterator.next();//NoSuchElementException

        //4. 如果希望再次遍历，则需要重新调用iterator方法重新获取迭代器
        iterator = col.iterator();

    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}