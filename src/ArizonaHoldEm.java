/* Name : William Xu
 * ID   : 23208616
 * Class: 335 FA15 001
 * HW   : Project 2
 * Goal : For this ArizonaHoldEm, there are 2 - 10 players and each player first have 2 their own cards and 5 
 * community cards. Each players have 100 dollars balance and each time use 2 for play one round and if one of them win, 
 * they will get back their 2 dollars and the rest of players 2 dollars, if there are more than one player then they will
 * separate the money by equal and take it. First it will ask how many player do you have and it will print out all the 
 * information of our players. At the end of the one round, it will ask you if you want to play another round, enter y or 
 * n. "y" means yes and "n"means no.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArizonaHoldEm {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Card> card = new ArrayList<>();
	static ArrayList<Card> sort = new ArrayList<>();
	static ArrayList<Card> sort1 = new ArrayList<>();
	static ArrayList<PokerHand> bestHand = new ArrayList<>();
	static ArrayList<PokerHand> mostHand = new ArrayList<>();
	static ArrayList<String> HandName = new ArrayList<>(); 
	//Store player's balance
	public static double playerBalance[] = new double[10];
	public static int n;
	public static String YorN;
	static int equalCount = 0;

	
	static Card C2 = new Card(Rank.Deuce, Suit.Clubs);
	static Card C3 = new Card(Rank.Three, Suit.Clubs);
	static Card C4 = new Card(Rank.Four, Suit.Clubs);
	static Card C5 = new Card(Rank.Five, Suit.Clubs);
	static Card C6 = new Card(Rank.Six, Suit.Clubs);
	static Card C7 = new Card(Rank.Seven, Suit.Clubs);
	static Card C8 = new Card(Rank.Eight, Suit.Clubs);
	static Card C9 = new Card(Rank.Nine, Suit.Clubs);
	static Card C10 = new Card(Rank.Ten, Suit.Clubs);
	static Card CJ = new Card(Rank.Jack, Suit.Clubs);
	static Card CQ = new Card(Rank.Queen, Suit.Clubs);
	static Card CK = new Card(Rank.King, Suit.Clubs);
	static Card CA = new Card(Rank.Ace, Suit.Clubs);

	static Card D2 = new Card(Rank.Deuce, Suit.Diamonds);
	static Card D3 = new Card(Rank.Three, Suit.Diamonds);
	static Card D4 = new Card(Rank.Four, Suit.Diamonds);
	static Card D5 = new Card(Rank.Five, Suit.Diamonds);
	static Card D6 = new Card(Rank.Six, Suit.Diamonds);
	static Card D7 = new Card(Rank.Seven, Suit.Diamonds);
	static Card D8 = new Card(Rank.Eight, Suit.Diamonds);
	static Card D9 = new Card(Rank.Nine, Suit.Diamonds);
	static Card D10 = new Card(Rank.Ten, Suit.Diamonds);
	static Card DJ = new Card(Rank.Jack, Suit.Diamonds);
	static Card DQ = new Card(Rank.Queen, Suit.Diamonds);
	static Card DK = new Card(Rank.King, Suit.Diamonds);
	static Card DA = new Card(Rank.Ace, Suit.Diamonds);

	static Card H2 = new Card(Rank.Deuce, Suit.Hearts);
	static Card H3 = new Card(Rank.Three, Suit.Hearts);
	static Card H4 = new Card(Rank.Four, Suit.Hearts);
	static Card H5 = new Card(Rank.Five, Suit.Hearts);
	static Card H6 = new Card(Rank.Six, Suit.Hearts);
	static Card H7 = new Card(Rank.Seven, Suit.Hearts);
	static Card H8 = new Card(Rank.Eight, Suit.Hearts);
	static Card H9 = new Card(Rank.Nine, Suit.Hearts);
	static Card H10 = new Card(Rank.Ten, Suit.Hearts);
	static Card HJ = new Card(Rank.Jack, Suit.Hearts);
	static Card HQ = new Card(Rank.Queen, Suit.Hearts);
	static Card HK = new Card(Rank.King, Suit.Hearts);
	static Card HA = new Card(Rank.Ace, Suit.Hearts);

	static Card S2 = new Card(Rank.Deuce, Suit.Spades);
	static Card S3 = new Card(Rank.Three, Suit.Spades);
	static Card S4 = new Card(Rank.Four, Suit.Spades);
	static Card S5 = new Card(Rank.Five, Suit.Spades);
	static Card S6 = new Card(Rank.Six, Suit.Spades);
	static Card S7 = new Card(Rank.Seven, Suit.Spades);
	static Card S8 = new Card(Rank.Eight, Suit.Spades);
	static Card S9 = new Card(Rank.Nine, Suit.Spades);
	static Card S10 = new Card(Rank.Ten, Suit.Spades);
	static Card SJ = new Card(Rank.Jack, Suit.Spades);
	static Card SQ = new Card(Rank.Queen, Suit.Spades);
	static Card SK = new Card(Rank.King, Suit.Spades);
	static Card SA = new Card(Rank.Ace, Suit.Spades);

	// Create players with 100 dollars in each of them.
	public static void createPlayer() {
		for (int i = 0; i < n; i++) {
			playerBalance[i] = 100.0;
		}
	}

	// Dealer collect 2 doller ant from each player
	public static void inGame() {
		for (int i = 0; i < n; i++) {
			playerBalance[i] = playerBalance[i] - 2;
		}
	}
	
	//Find and sort all the communityCards
	public static PokerHand communityCard(Card c1, Card c2, Card c3, Card c4, Card c5) {
		sort1.clear();
		sort1.add(c1);
		sort1.add(c2);
		sort1.add(c3);
		sort1.add(c4);
		sort1.add(c5);

		Comparator<Card> rankComparator = (Comparator<Card>) new RankComparator();
		Collections.sort(sort1, rankComparator);

		PokerHand T1 = new PokerHand(sort1.get(0), sort1.get(1), sort1.get(2), sort1.get(3), sort1.get(4));
		return T1;

	}

	
	// Create arrayList with 52 different card inside
	public static void deck() {
		card.clear();
		card.add(C2);
		card.add(C3);
		card.add(C4);
		card.add(C5);
		card.add(C6);
		card.add(C7);
		card.add(C8);
		card.add(C9);
		card.add(C10);
		card.add(CJ);
		card.add(CQ);
		card.add(CK);
		card.add(CA);

		card.add(D2);
		card.add(D3);
		card.add(D4);
		card.add(D5);
		card.add(D6);
		card.add(D7);
		card.add(D8);
		card.add(D9);
		card.add(D10);
		card.add(DJ);
		card.add(DQ);
		card.add(DK);
		card.add(DA);

		card.add(H2);
		card.add(H3);
		card.add(H4);
		card.add(H5);
		card.add(H6);
		card.add(H7);
		card.add(H8);
		card.add(H9);
		card.add(H10);
		card.add(HJ);
		card.add(HQ);
		card.add(HK);
		card.add(HA);

		card.add(S2);
		card.add(S3);
		card.add(S4);
		card.add(S5);
		card.add(S6);
		card.add(S7);
		card.add(S8);
		card.add(S9);
		card.add(S10);
		card.add(SJ);
		card.add(SQ);
		card.add(SK);
		card.add(SA);
	}

	// Get the best hand out of 7 card
	public static PokerHand getBestHand(Card c1, Card c2, Card c3, Card c4, Card c5, Card c6, Card c7) {
        
		//store all 7 cards in sort arraylist and sort them
		sort.clear();

		sort.add(c1);
		sort.add(c2);
		sort.add(c3);
		sort.add(c4);
		sort.add(c5);
		sort.add(c6);
		sort.add(c7);

		Comparator<Card> rankComparator = (Comparator<Card>) new RankComparator();
		Collections.sort(sort, rankComparator);

		//all 21 possibilitys
		PokerHand T1 = new PokerHand(sort.get(0), sort.get(1), sort.get(2), sort.get(3), sort.get(4));
		PokerHand T2 = new PokerHand(sort.get(0), sort.get(1), sort.get(2), sort.get(3), sort.get(5));
		PokerHand T3 = new PokerHand(sort.get(0), sort.get(1), sort.get(2), sort.get(3), sort.get(6));
		PokerHand T4 = new PokerHand(sort.get(0), sort.get(1), sort.get(2), sort.get(4), sort.get(5));
		PokerHand T5 = new PokerHand(sort.get(0), sort.get(1), sort.get(2), sort.get(4), sort.get(6));
		PokerHand T6 = new PokerHand(sort.get(0), sort.get(1), sort.get(2), sort.get(5), sort.get(6));
		PokerHand T7 = new PokerHand(sort.get(0), sort.get(1), sort.get(3), sort.get(4), sort.get(5));
		PokerHand T8 = new PokerHand(sort.get(0), sort.get(1), sort.get(3), sort.get(4), sort.get(6));
		PokerHand T9 = new PokerHand(sort.get(0), sort.get(1), sort.get(3), sort.get(5), sort.get(6));
		PokerHand T10 = new PokerHand(sort.get(0), sort.get(1), sort.get(4), sort.get(5), sort.get(6));
		PokerHand T11 = new PokerHand(sort.get(0), sort.get(2), sort.get(3), sort.get(4), sort.get(5));
		PokerHand T12 = new PokerHand(sort.get(0), sort.get(2), sort.get(3), sort.get(4), sort.get(6));
		PokerHand T13 = new PokerHand(sort.get(0), sort.get(2), sort.get(3), sort.get(5), sort.get(6));
		PokerHand T14 = new PokerHand(sort.get(0), sort.get(2), sort.get(4), sort.get(5), sort.get(6));
		PokerHand T15 = new PokerHand(sort.get(0), sort.get(3), sort.get(4), sort.get(5), sort.get(6));
		PokerHand T16 = new PokerHand(sort.get(1), sort.get(2), sort.get(3), sort.get(4), sort.get(5));
		PokerHand T17 = new PokerHand(sort.get(1), sort.get(2), sort.get(3), sort.get(4), sort.get(6));
		PokerHand T18 = new PokerHand(sort.get(1), sort.get(2), sort.get(3), sort.get(5), sort.get(6));
		PokerHand T19 = new PokerHand(sort.get(1), sort.get(2), sort.get(4), sort.get(5), sort.get(6));
		PokerHand T20 = new PokerHand(sort.get(1), sort.get(3), sort.get(4), sort.get(5), sort.get(6));
		PokerHand T21 = new PokerHand(sort.get(2), sort.get(3), sort.get(4), sort.get(5), sort.get(6));

		ArrayList<PokerHand> pokers = new ArrayList<>();
		pokers.clear();
		ArrayList<PokerHand> best = new ArrayList<>();
		best.clear();

		pokers.add(T1);
		pokers.add(T2);
		pokers.add(T3);
		pokers.add(T4);
		pokers.add(T5);
		pokers.add(T6);
		pokers.add(T7);
		pokers.add(T8);
		pokers.add(T9);
		pokers.add(T10);
		pokers.add(T11);
		pokers.add(T12);
		pokers.add(T13);
		pokers.add(T14);
		pokers.add(T15);
		pokers.add(T16);
		pokers.add(T17);
		pokers.add(T18);
		pokers.add(T19);
		pokers.add(T20);
		pokers.add(T21);

		best.add(T1);

		// Using two for loop to compare them all, and store best pokerhand in best
		for (int i = 0; i < pokers.size(); i++) {
			if (pokers.get(i).compareTo(best.get(0)) > 0) {
				best.clear();
				best.add(pokers.get(i));
			}
		}
        //return besthand
		return best.get(0);
	}

	//Start play game
	public static void Play() {
//		deck();
		Collections.shuffle(card);

		//Clear all the arrayList for next 
		HandName.clear();
		bestHand.clear();
		mostHand.clear();

		// Collecting the money
		inGame();

		int j = 0;
		for (int i = 0; i < n; i++) {

			// Get the bestHand and store it in the bestHand arrayList
			bestHand.add(getBestHand(card.get(j), card.get(j + 1), card.get(n * 2), card.get(n * 2 + 1),
					card.get(n * 2 + 2), card.get(n * 2 + 3), card.get(n * 2 + 4)));

			// Identify the Hand type and store it in to HandName arrayList	
			if (bestHand.get(i).PokerHandValue() == 9000)
				HandName.add(" - Straight Flush");
			else if (bestHand.get(i).PokerHandValue() == 8000)
				HandName.add(" - Four of a Kind");
			else if (bestHand.get(i).PokerHandValue() == 7000)
				HandName.add(" - Fullhouse");
			else if (bestHand.get(i).PokerHandValue() == 6000)
				HandName.add(" - Flush");
			else if (bestHand.get(i).PokerHandValue() == 5000)
				HandName.add(" - Straight");
			else if (bestHand.get(i).PokerHandValue() == 4000)
				HandName.add(" - Three of a kind");
			else if (bestHand.get(i).PokerHandValue() == 3000)
				HandName.add(" - Two Pairs");
			else if (bestHand.get(i).PokerHandValue() == 2000)
				HandName.add(" - Pair");
			else
				HandName.add(" - high card");

			j = j + 2;
		}

		j = 0; // reset j;
		int k = 0;

		// Store the first player best in mostHand arrayList
		mostHand.add(bestHand.get(0));
		// Find out which bestHand is higher and store it in the mostHand
		// arrayList
		for (int i = 0; i < n; i++) {
			if (bestHand.get(i).compareTo(mostHand.get(0)) > 0) {
				mostHand.clear();
				mostHand.add(bestHand.get(i));
				k = i;
			}
		}
		// -----------------------------------------------------
		// I store all the value in arrayList
		// ------------------------------------------------------

		//Find out if there have more than one winner
		equalCount = 0;
		for (int i = (bestHand.size() - 1); i >= 0; i--) {
			if (mostHand.get(0).compareTo(bestHand.get(i)) == 0) {
				equalCount++;
			}
		}

		//If there are only one winner then print form 1
		if (equalCount == 1) {

			System.out.println("Community Cards: " + communityCard(card.get(n * 2), card.get(n * 2 + 1),
					card.get(n * 2 + 2), card.get(n * 2 + 3), card.get(n * 2 + 4)).toString());
			System.out.println("++++++++++++++++++++++++++++++++++++");

			for (int i = 0; i < n; i++) {

				System.out.println("Player " + (i + 1) + ": " + " " + playerBalance[i] + " - " + card.get(j).toString()
						+ " " + card.get(j + 1).toString());

				System.out.print("   Best hand:  " + bestHand.get(i).toString());
				System.out.println(HandName.get(i));
				System.out.println("");
				j = j + 2;
			}

			//if player k win the game, then he can get all the money from pot
			playerBalance[k] = playerBalance[k] + (n * 2);

			System.out.println("Winner: Player " + (k + 1) + " " + playerBalance[k]);
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("   Pair " + mostHand.get(0).toString());
			System.out.println("");
		}

		//if there are more than 1 winner, print out by using form 2
		else if (equalCount > 1) {
			System.out.println("");
			System.out.println("Community Cards: " + communityCard(card.get(n * 2), card.get(n * 2 + 1),
					card.get(n * 2 + 2), card.get(n * 2 + 3), card.get(n * 2 + 4)).toString1());
			System.out.println("++++++++++++++++++++++++++++++++++++");

			//For loop to print each players balance and their bestHand
			for (int i = 0; i < n; i++) {
				System.out.println("Player " + (i + 1) + ": " + " " + playerBalance[i] + " - " + card.get(j).toString1()
						+ " " + card.get(j + 1).toString1());

				System.out.print("   Best hand:  " + bestHand.get(i).toString1());
				System.out.println(HandName.get(i));
				System.out.println("");
				j = j + 2;
			}

			System.out.println("Winning hands (tie)");
			System.out.println("++++++++++++++++++++++++++++++++++++");
			

			//Print out those players info when they are hit tie
			int count = equalCount;
			for (int i = (bestHand.size() - 1); i >= 0; i--) {
				if (mostHand.get(0).compareTo(bestHand.get(i)) == 0) {
					count--;
					if (count == 0){
						playerBalance[i] = playerBalance[i] + ((n * 2) - ((equalCount - 1) * (n * 2)/equalCount));
//						playerBalance[i] = playerBalance[i] + ((n * 2.0) - ((equalCount - 1.0) * (n * 2.0)/equalCount));	
					}else
					playerBalance[i] = playerBalance[i] + ((n * 2) / equalCount);
					System.out.print(mostHand.get(0).toString1());
					System.out.println(" " + HandName.get(i) + " - Player " + (i + 1) + " " + playerBalance[i]);
				}
			}

		}

	}

	public static void main(String[] args) {

		// bestHand arraylist store all players best hand
		System.out.print("How many players there will be? "); 
		n = input.nextInt();
		System.out.println("");

		//Create n Players and sign them 100 dollers each
		createPlayer();
		deck();
		Play();
		System.out.println("");
		System.out.print("Play another round? y or n: ");
		
		//Loop if you want to play another round
//		while (true) {
//
//			YorN = input.nextLine();
//			
//			if (YorN.equals("y")) {				
//				System.out.println("");
//				Play();
//				System.out.println("");
//				System.out.print("Play another round? y or n: ");
//				
//
//			} else if (YorN.equals("n"))
//				break;
//		}
//		
		
		int count = 0;
		while (true){
			if (bestHand.get(0).PokerHandValue() == 9000){
				break;
			}
			count++;
			Play();
			System.out.println(count);
		}
		

	}

}
