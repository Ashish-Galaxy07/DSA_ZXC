class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int i = 0; i < n; i++){
            int z = nums[i];
            if(map.get(z) > n/3){
                if(!list.contains(z)){
                    list.add(z);
                }
            }
        }
        return list;
    }
}