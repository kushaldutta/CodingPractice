# repeat is set to 'yes' for while loop to start
repeat = 'yes'

while repeat.lower() == 'yes':
    # asks user for amount of gallons
    gal = float(input("Enter the amount of water in gallons: "))

    # converts gallons to pounds
    weight = gal * 8.34

    # prints the weight of the water in pounds
    print(str(weight))

    # asks user to repeat
    repeat = input("Enter 'yes' if you would like to repeat: ")