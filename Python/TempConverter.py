#assigns value for program to start running
value = "yes"

while value.lower() == "yes":
    #asks user which program to run
    option = int(input("Type '1' to convert Celsius to Fahrenheit or '2' to convert Fahrenheit to Celsius: "))
    if option == 1:
        #asks user for Celsius temperature
        cel = int(input("Enter a temperature in Celsius: "))
        #prints temperature converted to Fahrenheit
        print(cel*(9/5)+32)
    elif option == 2:
        #asks user for Fahrenheit temperature
        fah = int(input("Enter a temperature in Fahrenheit: "))
        #prints temperature converted to Celsius
        print((fah - 32) / (9.0/5.0))
    #if user didn't type '1' or '2' for the first question
    else:
        print("error")
    #asks user to repeat
    value = input("Do you want to do more conversions: ")



