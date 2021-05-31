import bisect


def number_of_smaller_elements_to_right(nums):
    seen = []
    result = []

    for num in reversed(nums):
        i = bisect.bisect(seen, num)
        result.append(i)
        bisect.insort(seen, num)

    return list(reversed(result))
