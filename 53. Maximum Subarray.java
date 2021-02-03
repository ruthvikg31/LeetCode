class Solution {
    public int maxSubArray(int[] nums) {
       int N = nums.length;
        int s = 0,max = nums[0];
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        if(arr[N-1] < 0){
            return arr[N-1];
        }
        for(int i=0;i<N;i++){
            s+=nums[i];
            if(s<0){
                s=0;
            }
            if(max<s){
                max=s;
            }
        }
        return max;
    }
}
