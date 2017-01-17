public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int index = 0;
        while(index < s.length())
        {
            char curChar = s.charAt(index);
            if(curChar == 'M')
            {
                result += 1000;
                index++;
            }
            else if (curChar == 'D')
            {
                if (index+1 < s.length())
                {
                    char nextChar = s.charAt(index+1);
                    if(nextChar == 'M')
                    {
                        result += 500;
                        index+=2;
                    }
                    else
                    {
                        result += 500;
                        index++;
                    }
                }
                else
                {
                    result += 500;
                    index++;
                }
            }
            else if (curChar == 'C')
            {
                if(index +1 < s.length())
                {
                    char nextChar = s.charAt(index+1);
                    if(nextChar == 'M')
                    {
                        result += 900;
                        index+=2;
                    }
                    else if(nextChar == 'D')
                    {
                        result += 400;
                        index+=2;
                    }
                    else
                    {
                        result += 100;
                        index++;
                    }
                }
                else
                {
                    result += 100;
                    index++;
                }
            }
            else if (curChar == 'L')
            {
                if(index +1 < s.length())
                {
                    char nextChar = s.charAt(index+1);
                    if(nextChar == 'M')
                    {
                        result += 950;
                        index+=2;
                    }
                    else if(nextChar == 'D')
                    {
                        result += 450;
                        index+=2;
                    }
                    else if (nextChar == 'C')
                    {
                        result += 50;
                        index+=2;
                    }
                    else
                    {
                        result += 50;
                        index++;
                    }
                }
                else
                {
                    result += 50;
                    index++;
                }
            }
            else if (curChar == 'X')
            {
                if(index +1 < s.length())
                {
                    char nextChar = s.charAt(index+1);
                    if(nextChar == 'M')
                    {
                        result += 990;
                        index+=2;
                    }
                    else if(nextChar == 'D')
                    {
                        result += 490;
                        index+=2;
                    }
                    else if (nextChar == 'C')
                    {
                        result += 90;
                        index+=2;
                    }
                    else if (nextChar == 'L')
                    {
                        result += 40;
                        index+=2;
                    }
                    else
                    {
                        result += 10;
                        index++;
                    }
                }
                else
                {
                    result += 10;
                    index++;
                }
            }
            else if (curChar == 'V')
            {
                if(index +1 < s.length())
                {
                    char nextChar = s.charAt(index+1);
                    if(nextChar == 'M')
                    {
                        result += 995;
                        index+=2;
                    }
                    else if(nextChar == 'D')
                    {
                        result += 495;
                        index+=2;
                    }
                    else if (nextChar == 'C')
                    {
                        result += 95;
                        index+=2;
                    }
                    else if (nextChar == 'L')
                    {
                        result += 45;
                        index+=2;
                    }
                    else if (nextChar == 'X')
                    {
                        result += 5;
                        index+=2;
                    }
                    else
                    {
                        result += 5;
                        index++;
                    }
                }
                else
                {
                    result += 5;
                    index++;
                }
            }
            else if (curChar == 'I')
            {
                if(index +1 < s.length())
                {
                    char nextChar = s.charAt(index+1);
                    if(nextChar == 'M')
                    {
                        result += 999;
                        index+=2;
                    }
                    else if(nextChar == 'D')
                    {
                        result += 499;
                        index+=2;
                    }
                    else if (nextChar == 'C')
                    {
                        result += 99;
                        index+=2;
                    }
                    else if (nextChar == 'L')
                    {
                        result += 49;
                        index+=2;
                    }
                    else if (nextChar == 'X')
                    {
                        result += 9;
                        index+=2;
                    }
                    else if (nextChar == 'V')
                    {
                        result += 4;
                        index+=2;
                    }
                    else
                    {
                        result += 1;
                        index++;
                    }
                }
                else
                {
                    result += 1;
                    index++;
                }
            }
            
        }
    
        return result;
    }
}
