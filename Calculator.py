#addition function
def add(x, y):
    return x+y

#subtraction function
def sub(x, y):
    return x-y

#multiplication function
def mult(x, y):
    return x*y

#division function
def div(x, y):
    return x/y

def calc(operation, x, y):
    return operation(x, y)

repeat = 'yes'
while repeat.lower() == 'yes':
    operation = int(input("Enter '1' for addition, '2' for subtraction, '3' for multiplication, or '4' for division: "))
    if operation == 1:
        num1 = float(input("Enter the first number in the equation: "))
        num2 = float(input("Enter the second number in the equation: "))
        print(add(num1, num2))
        repeat = input("Would you like to continue using the calculator (Answer 'yes' or 'no'): ")
    elif operation == 2:
        num1 = float(input("Enter the first number in the equation: "))
        num2 = int(input("Enter the second number in the equation: "))
        print(sub(num1, num2))
        repeat = input("Would you like to continue using the calculator (Answer 'yes' or 'no'): ")
    elif operation == 3:
        num1 = float(input("Enter the first number in the equation: "))
        num2 = float(input("Enter the second number in the equation: "))
        print(mult(num1, num2))
        repeat = input("Would you like to continue using the calculator (Answer 'yes' or 'no'): ")
    elif operation == 4:
        num1 = float(input("Enter the first number in the equation: "))
        num2 = float(input("Enter the second number in the equation: "))
        print(div(num1, num2))
        repeat = input("Would you like to continue using the calculator (Answer 'yes' or 'no'): ")
    else:
        repeat = input("Error. Would you like to continue using the calculator (Answer 'yes' or 'no'): ")

