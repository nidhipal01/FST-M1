# Get input from the user
num = int(input("Enter a number to generate its multiplication table: "))

print(f"\nMultiplication Table for {num}:\n")

# Loop from 1 to 10
for i in range(1, 11):
    result = num * i
    print(f"{num} x {i} = {result}")
