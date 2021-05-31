def maximum_subarray_sum(nums):
    max_sum = max_ending_here = 0

    for num in nums:
        max_ending_here = max(num, num+max_ending_here)
        max_sum = max(max_ending_here, max_sum)

    return max_sum


def maximum_circular_subarray_sum(nums):
    maximum_subarray_sum_wrap_around = sum(nums) - minimum_subarray_sum(nums)

    return  max(maximum_subarray_sum_wrap_around, maximum_subarray_sum(nums))


def minimum_subarray_sum(nums):
    min_sum = min_ending_here = 0;

    for num in nums:
        min_ending_here = min(num, min_ending_here+num)
        min_sum = min(min_ending_here, min_sum)

    return min_sum
