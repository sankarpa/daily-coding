from unittest import TestCase

from arrays.src.number_of_elements_to_the_right import number_of_smaller_elements_to_right


class NumberOfElementsToTheRightTest(TestCase):
    def test_number_of_smaller_elements_to_right(self):
        array1 = [3,4,9,6,1]
        array2 = [5,4,3,2,1]
        expected_result_one = [1,1,2,1,0]
        expected_result_two = [4,3,2,1,0]

        self.assertEqual(expected_result_one, number_of_smaller_elements_to_right(array1))
        self.assertEqual(expected_result_two, number_of_smaller_elements_to_right(array2))
