#repeat is set to 'yes' for while loop to start
repeat = 'yes'

while repeat.lower() == 'yes':
    #asks user for amount of money and converts it to cents
    money = float(input("Enter an amount of money(don't include the $ sign): "))*100

    #finds amount of quarters ands sets the value to the quarters variable
    #int() used to remove .00 decimals
    quarters = int(money // 25)

    #takes the value of the quarters away
    money = money % 25

    #finds amount of dimes and sets the value to the dimes variable
    # int() used to remove .00 decimals
    dimes = int(money // 10)

    #takes the value of the dimes away
    money = money % 10

    #finds amount of nickels and sets the value to the nickels variable
    # int() used to remove .00 decimals
    nickels = int(money // 5)

    #takes the value of the nickels away
    money = money % 5

    #finds amount of pennies and sets the value to the pennies variable
    # int() used to remove .00 decimals
    pennies = int(money)

    #prints amount of quarters, dimes, nickels, and pennies
    print(str(quarters) + ' quarters, ' + str(dimes) + ' dimes, ' + str(nickels) + ' nickels, ' + str(pennies) + ' pennies')

    #asks user to repeat
    repeat = input("Enter 'yes' if you would like to repeat: ")