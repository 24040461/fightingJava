The Boxing Fighting Simulator

** What is the main functionality of the boxers game? **

The boxers game involves the user/users picking 2 boxer characters at the start of the game, then the Boxers will take turns in dealing power or light blows to the opponents character. The game finishes when either characters HP (Health Points) reaches 0. The boxers are pre-defined within the game and the users have a choice of selecting which one they would like to be.

The main functions and functionality
The fighting game consists of two classes, which are the Boxers and boxers class. The Boxers class is where all of the main functionality occurs and the boxers class is the "main" class where the program runs.

Each boxer has several stats, as follows:

Name - String Light - Int Power - Int Block - Int Attack - Int Defence - Int Health 

When a user does either a light or power attack, their light or power attack number compares against the opponents block, if the users attack is a higher value than their block, the attack is successful. Because the attack is successful, the user that tried to block loses 10 HP. If the attack is successfully blocked, the user will lose 0 HP.

The users attack and defence values are what you would normally find on a TopTrump card, these are meant to multiply the boxers light/power attack and block depending on how high the attack and defence values are, but this hasn't been implemented yet.