from unittest import TestCase

from arrays.src.product_of_all_other_elements import products


class ProductOfAllOtherElementsInArrayTest(TestCase):
    def test_products(self):
        nums_set_one = [1,2,3,4,5]
        nums_set_two = [2,4,6,7]
        expect_result_one = [120,60,40,30,24]
        expect_result_two = [168,84,56,48]

        assert expect_result_one == products(nums_set_one)
        assert expect_result_two == products(nums_set_two)

