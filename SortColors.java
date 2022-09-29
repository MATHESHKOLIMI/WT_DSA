//https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        int zero_color=0;
        int first_color=0;
        int second_color=0;
        for(int i : nums){
            if(i==0){
                zero_color++;
            }else if(i==1){
                first_color++;
            }else{
                second_color++;
            }
        }
        int val=0;
        for(int i=0; i< zero_color; i++){
            nums[i]=0;
            val++;
        }
        for(int j=val; j< zero_color+first_color; j++){
            nums[j]=1;
            val++;
        }
        for(int k= val; k<nums.length; k++){
            nums[k]=2;
            
        }
//         List<Integer> list0= new ArrayList();
//         List<Integer> list1= new ArrayList();
//         List<Integer> list2= new ArrayList();
//         List<Integer> result= new ArrayList();
//         for(int i: nums){
//             if(i==0){
//                 list0.add(i);
//             }else if(i==1){
//                 list1.add(i);
//             }else{
//                 list2.add(i);
//             }
//         }
        
//         result.addAll(list0);
//         result.addAll(list1);
//         result.addAll(list2);
        
//         nums= Arrays.stream(result.stream().toArray(Integer[]::new)).mapToInt(Integer::intValue).toArray();
        
    }
}