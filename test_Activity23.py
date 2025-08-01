import pytest
def test_sum(num_list):
    #initialze a sum variable
    sum = 0
    #calculate the sum of numbers in the list
    for num in num_list:
        sum+=num
    assert sum == 55