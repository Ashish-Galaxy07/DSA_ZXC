class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        boolean allEven = true; //if all even true then answer is true i.e even parity

        for(int i = 0; i < nums1.length; i++){
            int n = nums1[i];
            min = Math.min(min, n);

            if(n%2 != 0){
                allEven = false; //mixed parity (even + odd)
            }
        }

        if(min%2 != 0){
            return true; //if min is odd, then all odd parity can be done
        }
        return allEven;
    }
}