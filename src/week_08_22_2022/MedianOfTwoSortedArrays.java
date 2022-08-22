package week_08_22_2022;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1Ex1 = {1, 3};
		int[] nums2Ex1 = {2};
		System.out.println(findMedianOfArrays(nums1Ex1, nums2Ex1));
		
		int[] nums1Ex2 = {1, 2};
		int[] nums2Ex2 = {3, 4};
		System.out.println(findMedianOfArrays(nums1Ex2, nums2Ex2));
	}
	
	public static double findMedianOfArrays(int[] nums1, int[] nums2) {
		int indexOne = 0;
		int indexTwo = 0;
		int nums1Length = nums1.length;
		int nums2Length = nums2.length;
		int[] combinedList = new int[nums1Length + nums2Length];
		
		for (int i = 0; i < combinedList.length; i++) {
			if (indexOne >= nums1Length) {
				combinedList[i] = nums2[indexTwo];
				indexTwo++;
				continue;
			}
			
			if (indexTwo >= nums2Length) {
				combinedList[i] = nums1[indexOne];
				indexOne++;
				continue;
			}
			
			if (nums1[indexOne] < nums2[indexTwo]) {
				combinedList[i] = nums1[indexOne];
				indexOne++;
			} else {
				combinedList[i] = nums2[indexTwo];
				indexTwo++;
			}
		}
		
		double currMedian = 0;
		int length = combinedList.length;
		int halfLength = length / 2;
		if (length % 2 == 0) {
			currMedian = (combinedList[halfLength] + combinedList[halfLength - 1]) / 2.0;
		} else {
			currMedian = combinedList[halfLength];
		}
		
		return currMedian;
	}
}
