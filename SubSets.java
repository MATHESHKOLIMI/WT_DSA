//https://leetcode.com/problems/subsets/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listOfListOfInteger= new ArrayList();
        listOfListOfInteger.add(new ArrayList());
        // List<Integer> listOfInteger= new ArrayList();
        for(int i=0;i<nums.length; i++){
            
            int n=listOfListOfInteger.size();
            for(int j=0;j<n;j++){
                List<Integer> listOfInteger=new ArrayList(listOfListOfInteger.get(j));
                listOfInteger.add(nums[i]);
                listOfListOfInteger.add(listOfInteger);
            }
        }
        return listOfListOfInteger;
    }
}