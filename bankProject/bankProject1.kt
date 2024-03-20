import java.util.Scanner

fun main() {
    val sc= Scanner(System.`in`)
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit Account")
    println("2. Credit Account")
    println("3. Checking Account")

    var accountType: String = ""
    var userChoice: Int = 0
    while (accountType == "") {
        println("Choose an option(1,2 or 3)")
        userChoice = sc.nextInt()
        println("The selected option is ${userChoice}.")
        when(userChoice)
        {
            1->accountType="debit"
            2->accountType="credit"
            3->accountType="checking"
            else->continue
        }
        println("You have created a $accountType account.")
    }
    var accountBalance=sc.nextInt()
    println("Your account balance is $accountBalance.")
    val money=sc.nextInt()
    println("The amount of money deposited/withdrawn is $money.")

    var output:Int=0
    fun withdraw(amount:Int):Int
    {   
        accountBalance=accountBalance-amount
        println("The amount of money withdrawn from your account is $amount.")
        println("The updated account balance is $accountBalance")
        return amount
    }
    // output=withdraw(money)
    // println("The amount withdrawn is $output")

    fun debitWithdraw(amount:Int):Int
    {
        if(accountBalance==0)
        {
            println("Cant withdraw, no money on this account!")
            return accountBalance
        }
        else if(amount>accountBalance)
        {
            println("No enough money on this account! The checking balance is $accountBalance dollars.")
            return 0
        }
        else{
            return withdraw(amount)
        }
    }
    output=debitWithdraw(money)
    println("The amount withdrawn is $output")

    fun deposit(amount:Int):Int
    {
        accountBalance=accountBalance+amount
        println("The amount of money deposited in your account is $amount.")
        println("The updated account balance is $accountBalance.")
        return amount
    }

    fun creditDeposit(amount:Int):Int
    {
        if(accountBalance==0)
        {
            println("You don't need to deposit anything in order to pay off the account since it has already been paid off.")
            return accountBalance
        }
        else if(accountBalance+amount>0)
        {
            println("Deposit failed, you tried to pay off  an amount greater than the  credit balance. The checking balance is $accountBalance.")
            return 0
        }
        else if(amount==-accountBalance)
        {
            accountBalance=0
            println("You have paid off this account!")
            return amount
        }
        else{
            return deposit(amount)
        }
    }
    output=creditDeposit(money)
    print(output)
}
