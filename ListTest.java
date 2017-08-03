package com.bowen.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListTest {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");
        list1.add("dd");
        list2.add("bb");
        list2.add("ff");
        list2.add("kk");
        getDiffrent(list1,list2);
	}
	 private static  void getDiffrent(List<String> list1, List<String> list2) {
		     //程序运行的执行效率
	         long st = System.nanoTime();
	         //存放存放list1中不同于list2的集合
	         List<String> diffList1 = new ArrayList<String>();
	         //存放list2中不同于list1的集合
	         List<String> diffList2 = new ArrayList<String>();
	         //当不知道list1集合和list2集合的大小不确定的时候，通过两个集合的大小比较创建大小新的两个集合
	         List<String> maxList = list1;
	         List<String> minList = list2;
	         if(list2.size()>list1.size())
	         {
	             maxList = list2;
	             minList = list1;
	         }
	         Map<String,Integer> map = new HashMap<String,Integer>(maxList.size());
	         //遍历大集合，将元素存入map
	         for (String string : maxList) {
	             map.put(string, 1);
	         }
	         //遍历小集合，如果小集合中存在和大集合相同的元素，则将map中相同的value修改成2
	         for (String string : minList) {
	             if(map.get(string)!=null)
	             {
	            	 //不存的情况下，将不同的元素放入到map中
	                 map.put(string, 2);
	                 //map===>{aa=1, bb=2, cc=1, dd=1}
	                 //System.out.println("map===>"+map);
	                 continue;
	             }
	             //string===>ff
	             //string===>kk
	             //System.out.println("string===>"+string);
	             //将小集合中不同的元素放到diff中
	             diffList2.add(string);
	         }
	         for(Map.Entry<String, Integer> entry:map.entrySet())
	         {
	             if(entry.getValue()==1)
	             {
	                 diffList1.add(entry.getKey());
	             }
	         }
	         System.out.println("集合1不同于集合2的元素是："+diffList1);
	         System.out.println("集合2不同于集合1的元素是："+diffList2);
	         System.out.println("-----------------------------------------------------------------");
	        System.out.println("两个集合进行比较的使用的总时间是"+(System.nanoTime()-st));
	        
	    }
}
