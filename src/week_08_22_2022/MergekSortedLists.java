package week_08_22_2022;

import java.util.HashMap;
import java.util.LinkedList;

public class MergekSortedLists {

	public static void main(String[] args) {
		LinkedList<Integer>[] lists1 = new LinkedList[3];
		lists1[0] = new LinkedList<Integer>();
		lists1[0].add(1);
		lists1[0].add(4);
		lists1[0].add(5);
		lists1[1] = new LinkedList<Integer>();
		lists1[1].add(1);
		lists1[1].add(3);
		lists1[1].add(4);
		lists1[2] = new LinkedList<Integer>();
		lists1[2].add(2);
		lists1[2].add(6);
		System.out.println(mergekLists(lists1));
		
		LinkedList<Integer>[] lists2 = new LinkedList[0];
		System.out.println(mergekLists(lists2));
		
		LinkedList<Integer>[] lists3 = new LinkedList[1];
		lists3[0] = new LinkedList<Integer>();
		System.out.println(mergekLists(lists2));
	}
	
	public static LinkedList<Integer> mergekLists(LinkedList<Integer>[] lists) {
		if (lists.length == 0) {
			return new LinkedList<Integer>();
		}
		
		HashMap<Integer, Integer> indexMap = new HashMap<>();
		int mergedListLength = 0;
		
		for (int i = 0; i < lists.length; i++) {
			indexMap.put(i, 0);
			mergedListLength += lists[i].size();
		}
		
		LinkedList<Integer> result = new LinkedList();
		
		for (int j = 0; j < mergedListLength; j++) {
			int currentLowest = Integer.MAX_VALUE;
			int listIndexOfCurrLowest = -1;
			for (int k = 0; k < indexMap.size(); k++) {
				LinkedList<Integer> currList = lists[k];
				if (indexMap.get(k) >= currList.size()) {
					continue;
				} else {
					int numToCheck = lists[k].get(indexMap.get(k));
					if (numToCheck < currentLowest) {
						currentLowest = numToCheck;
						listIndexOfCurrLowest = k;
					}
				}
			}
			result.add(currentLowest);
			indexMap.put(listIndexOfCurrLowest, indexMap.get(listIndexOfCurrLowest) + 1);
		}
		
		return result;
	}
}
