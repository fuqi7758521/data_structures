package com.hofuqi;

public class LowArray {
	private long[] arr;
	private int nElem = 0;
	
	public LowArray(int size){
		arr = new long[size];
	}
	
	public void setElem(int index, long value){
		arr[index] = value;
	}
	
	public void addElem(long value){
		arr[nElem] = value;
		nElem++;
	}
	public long getElem(int index){
		return arr[index];
	}
	
	public void showArr(){
		for(int i = 0; i < arr.length; i++){
			System.out.print(getElem(i) + " ");
		}
	}
}
