from unittest import TestCase

from arrays.src.smallest_window_to_be_sorted import smallest_window_to_be_sorted


class SmallestWindowToBeSortedTest(TestCase):
    def test_smallest_window_to_be_sorted(self):
        nums = [3,7,5,6,9]
        left, right = smallest_window_to_be_sorted(nums)
        self.assertEqual(left, 1)
        self.assertEqual(right,3)
