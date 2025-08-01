import pytest

@pytest.fixture
def wallet():	
   amount = 0	
   return amount
	
# Set up the paremeterized test method
@pytest.mark.parametrize("earned,spent,expected",[(30,10,10),(20,2,18)])
def test_balance(wallet,earned,spent,expected):
    #add the earned amount to the wallet
    wallet += earned
    #subtract the spent amount from the wallet
    wallet -= spent
    #assert
    assert wallet == expected
