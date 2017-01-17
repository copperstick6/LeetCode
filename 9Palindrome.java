public class Solution {
    public boolean isPalindrome(int x) {
        String result = Integer.toString(x);
        boolean found = true;
        int curPos = 0;
        int end = result.length() - 1;
        int middle = result.length()/2;
        while(found && curPos <= middle)
        {
            char beginningLetter = result.charAt(curPos);
            char endLetter = result.charAt(end);
            if(!(beginningLetter == endLetter))
            {
                found = false;
                return found;
            }
            curPos++;
            end--;
        }
        return found;
    }
}
