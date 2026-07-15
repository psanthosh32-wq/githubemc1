balance = 10000

print("Welcome to the Bank!")
print("==========================================================================================================================================")
print("Welcome to the  indian ATM") 
print("===================================================================================================================================================")
pin = input("Please enter your 4-digit PIN: ")

if pin == "1234":
    print("Access granted.")
    print("Please select an option:")
    print("1. Check balance")
    print("2. Deposit funds")
    print("3. Withdraw funds")
    print("4. Exit")

    option = input("Enter your choice (1-4): ")

    if option == "1":
        print(f"Your current balance is: ${balance}")
    elif option == "2":
        deposit_amount = float(input("Enter the amount to deposit: "))
        balance += deposit_amount
        print(f"Deposit successful. Your new balance is: ${balance}")
    elif option == "3":
        withdraw_amount = float(input("Enter the amount to withdraw: "))
        if withdraw_amount <= balance:
            balance -= withdraw_amount
            print(f"Withdrawal successful. Your new balance is: ${balance}")
        else:
            print("Insufficient funds.")
    elif option == "4":
        print("Thank you for using the ATM. Goodbye!")
    else:
        print("Invalid option selected.")
        