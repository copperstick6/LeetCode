public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length; i++)
        {
            int numOne = nums[i];
            for(int j = i+1; j < nums.length; j++)
            {
                int numTwo = nums[j];
                int Target = 0 - numOne - numTwo;
                for(int k = j+1; k < nums.length; k++)
                {
                    int curResult = numOne + numTwo + nums[k];
                    if (curResult == 0)
                    {
                        List<Integer> foundResult = new ArrayList<Integer>();
                        foundResult.add(numOne);
                        foundResult.add(numTwo);
                        foundResult.add(nums[k]);
                        results.add(foundResult);
                    }
                }
            }
        }
        return results;
    }
}
