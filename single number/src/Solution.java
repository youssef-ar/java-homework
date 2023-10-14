import java.util.HashMap;
public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if(hm.get(num)!=null){
                hm.remove(num);
            }else {
                hm.put(num,num);
            }
        }
        return hm.get(hm.keySet().iterator().next());
    }
}
