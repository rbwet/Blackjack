# Blackjack Odds Simulator

The **Blackjack Odds Simulator** is a Java-based application that models the classic game of Blackjack. It provides functionality for simulating hands, evaluating the probabilities of winning, drawing, or losing, and understanding the statistical odds of different plays.

---

## 📌 Features

* **Hand Simulation:** Simulate Blackjack hands for multiple players.
* **Deck Management:** Manages shuffling, drawing, and resetting of a deck of cards.
* **Hand Evaluation:** Calculate the best possible score for each hand.
* **Player Logic:** Simulate player strategies for hitting, standing, and doubling down.
* **Odds Calculation:** Compute win/loss probabilities for different scenarios.

---

## 🚀 Getting Started

### Prerequisites

Ensure you have Java installed:

```bash
sudo apt-get update
sudo apt-get install openjdk-17-jdk
```

---

## 📂 Directory Structure

```
.
├── BlackJackOdds.java       # Main simulation logic
├── BlackJackBasicTest.java  # Unit tests for Blackjack logic
├── Card.java                # Card representation
├── Deck.java                # Deck implementation and management
├── Hand.java                # Hand representation and logic
└── Player.java              # Player decision logic
```

---

## 💡 Usage

To compile the program:

```bash
javac *.java
```

To run the Blackjack simulation:

```bash
java BlackJackOdds
```

---

### Example:

```plaintext
Player 1: Hand [10♦, 7♠] → Total: 17
Player 2: Hand [A♣, 5♠, 2♥] → Total: 18

Outcome:
- Player 1: Stand → Loss
- Player 2: Hit → Win
```

---

## 🛠️ Error Handling and Debugging

* **Card Not Found:** Ensure all cards are properly initialized in the deck.
* **Array Index Out of Bounds:** This may occur if the deck runs out of cards—check deck reshuffling logic.
* **Null Pointer Exception:** Verify all objects are instantiated before usage.

---

## 🚀 Future Improvements

* [ ] Add multiplayer networking support.
* [ ] Implement advanced AI strategies.
* [ ] Support for split hands and insurance bets.

---

## 🤝 Contributing

Feel free to fork the repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

---

## 📄 License

This project is licensed under the MIT License.
