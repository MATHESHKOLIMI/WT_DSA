//https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        int l=k%nums.length;
        int arr[] = new int[nums.length];
        // for(int j=0;j<l;j++){
        //     int temp=nums[nums.length-1];
        //     for(int i=nums.length-1;i>0;i--){
        //         nums[i]= nums[i-1];
        //     }
        //     nums[0]=temp;
        // }
        int j=0;
        for(int i=arr.length-l;i<arr.length;i++){
            arr[j++]=nums[i];
        }
        
        // for(int i=nums.length-1-l;i>0;i--){
        //     nums[i]=nums[i-1];
        // }
        for(int i=0;i<nums.length-l;i++){
            arr[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        // nums=arr;
        
    }
}