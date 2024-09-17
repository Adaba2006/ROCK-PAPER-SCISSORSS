import random
class RockPaperScissors:
    def __init__(self):
        self.Options = ["Rock", "Paper", "Scissors"]
    def getGameChoice(self):
        options = self.Options[int(random.random()*len(self.Options))]
        return options
    def getUserChoice(self):
        isValid = False
        userinput = ""
        while not isValid:
            print("Choose from the following: ",end=" ")
            for i in self.Options:
                print(i, end=" ")
            print()
            userChoice =  input("Pick: ")
            if userChoice !=None and userChoice in self.Options: # type: ignore
                isValid = True
                userinput = userChoice
            if userChoice not in self.Options:
                print("Note a valid choice try again")
            
        return userinput
    def result(self):
            game = self.getGameChoice()
            user = self.getUserChoice()
            if game == user:
                resul = "it's a tie"

            elif (user == "Paper" and game == "Rock") or (user == "Rock" and game == "Scissors") or (user == "Scissors" and game == "Paper"):
                resul = "You win"
            else:
                resul = "You lose"
            
            print(f"You chose {user}, and I chose {game}, so {resul}")
            
            return resul 
    def play(self):
        while True:
            self.result()
            start = input("Do u want to play again?  ")
            if start.upper() == "YES" or start.upper() =="Y":
                self.result()
            else:
                print("So soon, Byeeee, i'll win u next time")
                break

start = RockPaperScissors()
start.play()

        