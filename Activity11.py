#Dictionary of Fruit Shop
fruits = {"apple": 40, "banana": 10, "mango": 50, "orange": 30}

fruit = input("Enter fruit name: ").lower()

if fruit in fruits:
    print(f"Available at ₹{fruits[fruit]}")
else:
    print("Not available")