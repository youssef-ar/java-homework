import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result =new int[2];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int i=0;
        for(int num:nums){
            hm.put(num,i);
            i++;
        }
        for(int j=0;j<i;j++){
            if(hm.get(target-nums[j])!=null && hm.get(target-nums[j])!=j){
                result[0]=j;
                result[1]=hm.get(target-nums[j]);
                break;
            }
        }
        return result;
    }
}