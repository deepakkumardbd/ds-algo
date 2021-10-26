package com.sorting;

import java.util.Arrays;

public class SortArrayAndIndex {

    public static void main(String args[]){
        int arr[] = {10,11,9, 1, 15};
        int arr1 [] = {0,1,2,3,4};
        SortArrayAndIndex s = new SortArrayAndIndex();
        s.twoSum(arr,arr1);
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arr1));
    }
        public void twoSum(int[] nums, int arr[]) {
            mergeSort(nums,0, nums.length-1, arr);
        }

        void mergeSort(int nums[], int left, int right, int indexArray[]){
            if(left == right){
                return;
            }else{
                int mid = (left + right)/2;
                mergeSort(nums,left,mid, indexArray);
                mergeSort(nums,mid+1, right, indexArray);
                merge(nums,left, mid, right, indexArray);
            }
        }

        void merge(int nums[], int left, int mid, int right, int indexArray[]) {
            int i, j, k, k1;
            k = 0;
            k1 = 0;
            i = left;
            j = mid + 1;
            int arr[] = new int[right - left + 1];
            int arr1[] = new int[right - left + 1];
            while (i <= mid && j <= right) {
                if (nums[i] <= nums[j]) {
                    arr[k++] = nums[i];
                    arr1[k1++] = indexArray[i];
                    i++;
                } else {
                    arr[k++] = nums[j];
                    arr1[k1++] = indexArray[j];
                    j++;
                }
            }

            while (i <= mid) {
                arr[k++] = nums[i];
                arr1[k1++] = indexArray[i];
                i++;
            }

            while (j <= right) {
                arr[k++] = nums[j];
                arr1[k1++] = indexArray[j];
                j++;
            }
            k = 0;
            k1 = 0;
            for (int p = left; p <= right; p++) {
                nums[p] = arr[k++];
                indexArray[p] = arr1[k1++];
            }
        }
}
