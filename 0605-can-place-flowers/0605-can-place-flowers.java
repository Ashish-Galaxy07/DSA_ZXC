class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int i = 0;

        while(i < len && n > 0){
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) &&
               (i == len-1 || flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                n--;
            }
            i++;
        }
        if(n == 0){
            return true;
        }
        else{
            return false;
        }
    }
}