import pytest

# Create fixture
@pytest.fixture
def num_list():
      # Returns a list of in range of 0- 10
    int_list = list(range(11))
    return int_list
