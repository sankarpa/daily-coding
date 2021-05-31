from unittest import TestCase

from arrays.src.maximum_subarray_sum import maximum_subarray_sum

from arrays.src.maximum_subarray_sum import maximum_circular_subarray_sum


class MaximumSubArrayTest(TestCase):
    def test_maximum_subarray_sum(self):
        array = [34,-50,42,14,-5,86]
        self.assertEqual(137, maximum_subarray_sum(array))

    def test_maximum_circular_subarray_sum(self):
        array = [8,-1, 3, 4]
        self.assertEqual(15, maximum_circular_subarray_sum(array))
