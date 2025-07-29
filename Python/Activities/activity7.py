# Get input from user and split by comma (with or without spaces)
user_input = input("Enter a sequence of comma-separated numbers (e.g., 1,2,3): ")

# Clean and split input
numbers = [num.strip() for num in user_input.split(",")]

# Initialize total
total = 0

# Sum the numbers
for number in numbers:
    total += int(number)

# Print result
print("Sum:", total)