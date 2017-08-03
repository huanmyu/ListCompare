package com.bowen.test;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		List<String> list2 = new ArrayList<String>();
		list2.add("d");
		list2.add("e");
		list2.add("f");
		list2.add("g");
		list2.add("h");
		list2.add("oooo");
		System.out.println("集合1:"+list1);
		System.out.println("集合1:"+list2);
		List<String> lista = new ArrayList<String>(list1);//构建list1的副本
		lista.removeAll(list2);// 去除相同元素
		List<String> listb = new ArrayList<String>(list2);//构建list2的副本
		listb.removeAll(list1);// 去除相同元素
		System.out.println("集合1中与集合2中不相同的元素："+lista);
		System.out.println("集合2中与集合1中不相同的元素："+listb);
	}

}
