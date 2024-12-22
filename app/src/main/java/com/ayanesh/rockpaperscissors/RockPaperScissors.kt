package com.ayanesh.rockpaperscissors

fun main() {
  println("Rock, paper or scissors? Enter your choice!")
  var playerChoice = readln()

  while (true) {
    // Validate the input
    if (playerChoice == "Rock" || playerChoice == "Paper" || playerChoice == "Scissors") {
      break // Exit the loop if the choice is valid
    } else {
      println("Invalid choice! Please enter Rock, Paper, or Scissors.")
      playerChoice = readln().replaceFirstChar { it.uppercase() }
    }
  }

  val computerChoice = when((1..3).random()) {
    1 -> "Rock"
    2 -> "Paper"
    3 -> "Scissor"
    else -> ""
  }
  println(computerChoice)

  val winner = when {
    playerChoice == computerChoice -> "Tie"
    playerChoice == "Rock" && computerChoice == "Scissor" -> "Player"
    playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
    playerChoice == "Scissor" && computerChoice == "Paper" -> "Player"
    else -> "Computer"
  }

  if (winner == "Tie") {
    println("It's a tie!")
  } else {
    println("$winner won!")
  }
}