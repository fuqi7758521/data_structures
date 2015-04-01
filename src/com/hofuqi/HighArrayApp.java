package com.hofuqi;

public class HighArrayApp {

	public static void main(String[] args) {
		HighArray ha = new HighArray(10);
		ha.insert(22);
		ha.insert(26);
		ha.insert(33);
		ha.insert(66);
		ha.insert(99);
		ha.insert(12);
		ha.insert(96);
		ha.insert(56);
		ha.insert(36);
		ha.insert(76);
		ha.show();
		
		long searchKey = 12;
		long position = ha.find(searchKey);
		if(position > 0){
			System.out.println("the searchKey:" + searchKey + " be founded in the " + position + "th element");
		}else{
			System.out.println(searchKey + "not found");
		}
		
		long needDeletedkey = 22;
		ha.delete(needDeletedkey);
		ha.show();
	}

}
