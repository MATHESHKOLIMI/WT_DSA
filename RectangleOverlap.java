//https://leetcode.com/problems/rectangle-overlap/

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
//         int[] rec1_m= new int[4];
//         int[] rec2_m= new int[4];
//         for(int i=0; i<rec1.length; i++){
//             if(i%2 == 0){
//                 rec1_m[i]=rec1[i];
//                 rec2_m[i]=rec2[i];
//             }
//             else{
//                 int j=(i+2)%4;
//                 rec1_m[i]=rec1[j];
//                 rec2_m[i]=rec2[j];
//             }
            
//         }
        
        // for(int i=0;i< 4; i++){
            if(rec1[0] < rec2[2] && rec2[0] < rec1[2] && rec1[1] < rec2[3] && rec2[1] < rec1[3] ){
                return true;
            }
        // }
        return false;
    }
}