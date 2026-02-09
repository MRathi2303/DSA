class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count = 0
        candidate = nums[0]

        for i in range(0,len(nums)):
            if count == 0:
                candidate = nums[i]
        
            if candidate == nums[i]:
                count += 1

            if candidate != nums[i]:
                count -= 1

        return candidate            