class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        int low = 0;
        int high = k;
        int n = arr.length;

        for(int i = 0; i < k; i++){ //first window
            sum += arr[i];
        }
        if(sum/k >= threshold){
            count++;
        }
        while(high < n){ //slide window
            sum -= arr[low];
            sum += arr[high];
            int avg = sum/k;
            if(avg >= threshold){
                count++;
            }
            low++;
            high++;
        }
        return count;
    }
}