package com.hofuqi;

public class LowArrayApp {

	public static void main(String[] args) {
		LowArray la = new LowArray(10);
		long nElem = 0;
		int j;
		la.setElem(0, 77);
		la.setElem(1, 99);
		la.setElem(2, 44);
		la.setElem(3, 55);
		la.setElem(4, 22);
		la.setElem(5, 88);
		la.setElem(6, 11);
		la.setElem(7, 00);
		la.setElem(8, 66);
		la.setElem(9, 33);
		nElem = 10;
		la.showArr();
		System.out.println("");
		int searchKey = 88;
		for(j = 0; j < nElem; j++){
			if(la.getElem(j) == searchKey){
				break;
			}
		}
		if(j == nElem){
			System.out.println("can't find " + searchKey);
		}else{
			System.out.println("find " + searchKey);
		}
		
		searchKey = 22;
		for(j = 0; j < nElem; j++){
			if(la.getElem(j) == searchKey){
				break;
			}
		}
		for(int k = j; k < nElem - 1; k++){
			la.setElem(k, la.getElem(k + 1));
		}
		nElem--;
//		la.showArr();
		for(j = 0; j < nElem; j++){
			System.out.print(la.getElem(j) + " ");
		}
	}

}
