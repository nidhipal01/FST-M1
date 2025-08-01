#Using recursion, generate Fibonacci numbers
def fibonacci(num):
    if num <= 1:
        return num
    else:
        return(fibonacci(num-1) + fibonacci(num-2))

Input_Num = int(input("Enter a number: "))

if Input_Num <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(Input_Num):
        print(fibonacci(i))