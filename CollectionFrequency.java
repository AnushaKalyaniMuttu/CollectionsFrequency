package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFrequency {

  /*Collection.frequency(list,value)
  *return the frequency of the value as an integer in the list 
  */
	public static void main(String[] args) {
		List<String> stringList=new ArrayList<>();
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Cherry");
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Banana");

		int appleFrequency=Collections.frequency(stringList, "Apple");
		int bananaFrequency=Collections.frequency(stringList,"Banana");
		System.out.println("Frequency of 'Apple': "+appleFrequency);
		System.out.println("Frequency of 'Banana': "+bananaFrequency);
		
		}
		
	}
