# Get the users names
user1 = input("Player1 - What is your name? ")
user2 = input("Player2 - What is your name? ")

# Get the users choices
user1_answer = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
user2_answer = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()

# Run the algorithm to see who wins
if user1_answer == user2_answer:
    print("It's a tie!")
elif user1_answer == 'rock':
    if user2_answer == 'scissors':
        print(user1 +", Rock wins!")
    else:
        print(user2 +", Paper wins!")
elif user1_answer == 'scissors':
    if user2_answer == 'paper':
        print(user1 +", Scissors win!")
    else:
        print(user2 +", Rock wins!")
elif user1_answer == 'paper':
    if user2_answer == 'rock':
        print(user1 +"Paper wins!")
    else:
        print(user2 +"Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")