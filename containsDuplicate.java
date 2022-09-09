class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        int count = 1;

        for ( int i = 0; i < len; ++i) {
            if ( count >= 2 ) { // termination
                return true;
            }
            
            for ( int j = i + 1; j < len; ++j ) { // iteration
                if ( nums[j] == nums[i] ) {
                    count++;
                }
            }
        }
        return false;
    }
}
