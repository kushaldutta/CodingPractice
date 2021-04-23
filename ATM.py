#introduces variables
user, i, password, n, account, pin, option, depo, draw, exit = '', 0, '', 0, '', '', '', '', '', ''

#3 chances to enter username correctly
while user.lower() != 'liltuba' and i < 3:

    #asks for username
    user = input("Enter your username: ")

    #correct username
    if user.lower() == 'liltuba':

        #3 chances to enter password correctly
        while password != '103812cba' and n < 3:

            #asks for password
            password = input("Enter the password: ")

            #correct password
            if password == '103812cba':
                print("Access Granted")

                #asks for account number
                while account != 12345:
                    account = int(input("Enter the account number: "))

                    #correct account number
                    if account == 12345:

                        while pin != 1021:

                            #asks for pin number
                            pin = int(input("Enter Pin: "))

                            #correct pin
                            if pin == 1021:

                                #asks for user's choice
                                while option != 3:
                                    option = int(input("Enter '1' to deposit money, '2' to make a withdrawal, or '3' to exit: "))

                                    #user chooses to deposit money
                                    if option == 1:
                                        depo = input("How much money would you like to deposit: ")
                                        print(depo + ' has been deposited into your account')

                                    #user chooses to withdraw money
                                    elif option == 2:
                                        draw = input("How much money would you like to withdraw from your account")
                                        print(draw + ' has been withdrawn from your account')

                                    #user chooses to exit 
                                    else:
                                        print('Exiting application, thank you!')

                                #incorrect pin
                            else:
                                    print("Wrong Pin")

                    #incorrect account number
                    else:
                        print("Wrong Account Number")

            #incorrect password
            else:
                print("Access Denied")
            n += 1

    #incorrect username
    else:
        print("Denied Access")
    i += 1

