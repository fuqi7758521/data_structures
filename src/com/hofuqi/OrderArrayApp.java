package com.hofuqi;

import java.util.Map;

public class OrderArrayApp {

	public static void main(String[] args) {
		OrderArray oa = new OrderArray(100);
		fillOrderArray(oa);
		oa.show();
		int searchKey = 30;
		Map<String, Object> result = oa.binarySearch(searchKey);
		Integer pos = (Integer) result.get("pos");
		Integer compareCount = (Integer) result.get("compareCount");
		if(pos.intValue() == -1){
			System.out.println("can't find the searchKey: " + searchKey);
		}else{
			System.out.println("find the searchKey: " + searchKey);
		}
		System.out.println("compare count is:" + compareCount);
		
	}

	private static void fillOrderArray(OrderArray oa) {
		oa.insert(100);
		oa.insert(10);
		oa.insert(20);
		oa.insert(25);
		oa.insert(30);
		oa.insert(40);
		oa.insert(21);
		oa.insert(111);
		oa.insert(20);
		oa.insert(99);
		oa.insert(98);
	}

}
