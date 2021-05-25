def smallest_window_to_be_sorted(nums: list):
    maximum, minimum = -float("inf"), float("inf")
    length = len(nums)
    left, right = None, None

    for i in range(length):
        maximum = max(maximum, nums[i])
        if nums[i] < maximum:
            right = i

    for i in range(length - 1, -1, -1):
        minimum = min(minimum, nums[i])
        if nums[i] > minimum:
            left = i

    return left, right
