public class Solution {
    public int hammingDistance(int x, int y) {
        int numsDiff = 0;
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);
        String tempX = "";
        String tempY = "";
        for(int j = 0; j < (32-binaryX.length()); j++)
        {
            tempX += "0";
        }
        tempX += binaryX;
        for(int k = 0; k < (32-binaryY.length()); k++)
        {
            tempY += "0";
        }
        tempY += binaryY;
        binaryX = tempX;
        binaryY = tempY;
        System.out.println(binaryX);
        System.out.println(binaryY);
        for(int i = 0; i < binaryX.length(); i++)
        {
            char binX = binaryX.charAt(i);
            char binY = binaryY.charAt(i);
            if(!(binX == binY))
            {
                numsDiff++;
            }
        }
        return numsDiff;
    }
    
}
