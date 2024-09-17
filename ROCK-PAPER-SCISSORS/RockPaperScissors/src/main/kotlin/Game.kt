fun main(){
    val options = arrayOf("Rock","Paper","Scissors")
    val gameChoice = getGameChoice(options)
    val UserChoice = getUserChoice(options)
    val resul = printResult(UserChoice, gameChoice)
}
fun getGameChoice(OptionParam: Array<String>) = OptionParam[(Math.random() * OptionParam.size).toInt()]
fun getUserChoice(OptionParam: Array<String>): String{
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice){
        print("Please enter your answer from the following: ")
        for(item in OptionParam){
            print(" ${item}")

        }
        println("")
        val userInput = readLine()
        if (userInput !=null && userInput in OptionParam){
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice){
            println("You must enter a valid choice")
        }
    }
    return userChoice

}
fun printResult(userChoice: String, gameChoice: String){
    val result: String
    if (userChoice == gameChoice) {
        result = "Tie!"
    }
    else if ((userChoice == "Rock" && gameChoice == "Scissors")|| (userChoice == "Paper"  && gameChoice =="Rock")||
            (userChoice == "Scissors" && gameChoice == "Paper")){
            result = "You win!"
    }
    else{
        result = "You lose!"
    }
    println("You chose ${userChoice} and  i chose ${gameChoice} sooooo, ${result}")
}

