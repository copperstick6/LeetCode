class Solution(object):
    # @return a tuple, (index1, index2)
    def twoSum(self, num, target):
        mp={}
        #construct the dict, with multiple values
        for idx, val in enumerate(num):
            mp.setdefault(val,[]).append(idx)

        for idx,val in enumerate(num):
            if (target-val!=val and mp.has_key(target-val)):
                return sorted((mp[target-val][0],mp[val][0]))
            if (target-val==val and len(mp[val])>1):
                return (mp[val][0],mp[val][1])
