package com.hofuqi;

import java.util.HashMap;
import java.util.Map;

public class OrderArray {
	private int arr[];
	private int nElems;
	
	public OrderArray(int max){
		arr = new int[max];
	}
	
	public void insert(int value){
		int i;
		for(i = 0; i < nElems; i++){
			if(value <= arr[i]){
				break;
			}
		}
		int k;
		for(k = nElems; k > i; k--){
			arr[k] = arr[k-1];
		}
		arr[i] = value;
		nElems++;
	}
	
	public Map<String,Object> binarySearch(int searchKey){
		Map<String,Object> result = new HashMap<String, Object>();
		int startIndex = 0, endIndex = nElems - 1;
		int middleIndex;
		int compareCount = 0;
		while(true){
			compareCount++;
			middleIndex = (startIndex + endIndex)/2;
			if(arr[middleIndex] == searchKey){
				result.put("compareCount", compareCount);
				result.put("pos", middleIndex);
				return result;
			}else{
				
				if(startIndex > endIndex){
					result.put("compareCount", compareCount);
					result.put("pos", -1);
					return result;
				}else{
					if(arr[middleIndex] < searchKey){
						startIndex = middleIndex + 1;
					}else{
						endIndex = middleIndex - 1;
					}
				}
			}
		}
		
	}
	
	public int linearSearch(int searchKey){
		return -1;
	}
	
	public void show(){
		for(int i = 0; i < nElems; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
