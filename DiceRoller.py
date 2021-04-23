import random

# initializes loop
choice = "yes"
while choice.lower() == "yes":
    print(random.randint(1,6))
    choice = input("Type 'yes' to repeat: ")