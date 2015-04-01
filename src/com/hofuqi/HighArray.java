package com.hofuqi;

public class HighArray {
	private long[] arr;
	private int nElems;
	
	public HighArray(int max){
		arr = new long[max];
		nElems = 0;
	}
	
	public void insert(long value){
		arr[nElems] = value;
		nElems++;
	}
	
	public long find(long searchKey){
		int i;
		for(i = 0; i < nElems; i++){
			if(searchKey == arr[i]){
				break;
			}
		}
		if(i == nElems){
			return  -1;
		}else{
			return i;
		}
	}
	
	public void show(){
		for(int i = 0; i < nElems; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public Boolean delete(long searchKey){
		int i;
		for(i = 0; i < nElems; i++){
			if(arr[i] == searchKey){
				break;
			}
		}
		if(i == nElems){
			return false;
		}else{
			int k;
			for(k = i; k < nElems - 1; k++){
				arr[k] = arr[k + 1];
			}
			nElems--;
			return true;
		}
	}
}
