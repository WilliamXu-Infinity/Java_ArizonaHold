/* Name : Tingchao Xu
 * ID   : 23208616
 * Class: 335 FA15 001
 * HW   : Project 2
 * Goal : For each PokerHand has 5 different card. And we need to find different kind of the cards combination and rank these different combination. And it also have the compareto methed so when two different PokerHand. 
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class PokerHand implements Comparable<PokerHand> {

	public Card a;
	public Card b;
	public Card c;
	public Card d;
	public Card e;

	private int cardValue;
	int arrayValue[] = new int[5];
	int arraySort[] = new int[5];

	public PokerHand(Card a, Card b, Card c, Card d, Card e) {

		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;

		/*
		 * if (a.equals(b)&&
		 * a.equals(c)&&a.equals(d)&&a.equals(e)&&b.equals(c)&&b.equals(d)&&b.
		 * equals(e)&&c.equals(d)&&c.equals(e)&&d.equals(e)){ throw new
		 * DuplicateCardException(); }
		 */
	}

	// put all the value in array and sort value from bigger to small left to
	// right.
	public void PokerHandArray() {

		arrayValue[0] = a.getRank().getValue();
		arrayValue[1] = b.getRank().getValue();
		arrayValue[2] = c.getRank().getValue();
		arrayValue[3] = d.getRank().getValue();
		arrayValue[4] = e.getRank().getValue();
		
		Arrays.sort(arrayValue);

	}

	public int getPokerHandValue(int s) {
		return arrayValue[s];
	}

	public int PokerHandValue() {

		PokerHandArray();

		// StraightFlush & Flush type & Royal Flush

		if (((a.getSuit() == b.getSuit()) & (b.getSuit() == c.getSuit())) && ((c.getSuit() == d.getSuit()) & (d.getSuit() == e.getSuit()))) {
			cardValue = 6000;
			if ((arrayValue[4] - arrayValue[3] == 1) && (arrayValue[3] - arrayValue[2] == 1) && (arrayValue[2] - arrayValue[1] == 1) && (arrayValue[1] - arrayValue[0] == 1)) {
				cardValue = 9000;
			}	
			else if (arrayValue[4] == 14 && arrayValue[3] == 5 && arrayValue[2] == 4 && arrayValue[1] == 3 && arrayValue[0] == 2) {
				cardValue = 9000;
				int temp = arrayValue[4];
				arrayValue[3] = arrayValue[4];
				arrayValue[2] = arrayValue[3];
				arrayValue[1] = arrayValue[2];
				arrayValue[0] = temp;
				
			}
			
		}

		// Four of a Kind type
		else if (((arrayValue[0] == arrayValue[1]) && (arrayValue[1] == arrayValue[2]))
				&& (arrayValue[2] == arrayValue[3])) {
			cardValue = 8000;
			int temp = arrayValue[4];
			arrayValue[4] = arrayValue[2];
			arrayValue[0] = temp;
			
		} else if (((arrayValue[1] == arrayValue[2]) && (arrayValue[2] == arrayValue[3]))
				&& (arrayValue[3] == arrayValue[4])) {
			cardValue = 8000;
		}

		// Fullhouse type
		else if (((arrayValue[4] == arrayValue[3]) && (arrayValue[3] == arrayValue[2]))
				&& (arrayValue[1] == arrayValue[0]))
		{
			cardValue = 7000;

		} else if (arrayValue[0] == arrayValue[1] && arrayValue[1] == arrayValue[2] && arrayValue[3] == arrayValue[4])

		{
			cardValue = 7000;
			int temp = arrayValue[4];
			arrayValue[4] = arrayValue[2];
			arrayValue[3] = arrayValue[2];
			arrayValue[0] = temp;
			arrayValue[1] = temp;

		}

		// Straight type
		else if ((arrayValue[4] - arrayValue[3] == 1) && (arrayValue[3] - arrayValue[2] == 1)
				&& (arrayValue[2] - arrayValue[1] == 1) && (arrayValue[1] - arrayValue[0] == 1))

		{
			cardValue = 5000;
		} else if (arrayValue[4] == 14 && arrayValue[3] == 5 && arrayValue[2] == 4 && arrayValue[1] == 3 && arrayValue[0] == 2) {
			cardValue = 5000;
			int temp = arrayValue[4];
			arrayValue[3] = arrayValue[4];
			arrayValue[2] = arrayValue[3];
			arrayValue[1] = arrayValue[2];
			arrayValue[0] = temp;
		}

		// Three of a kind type
		else if ((arrayValue[0] == arrayValue[1]) && (arrayValue[1] == arrayValue[2])) {
			cardValue = 4000;
			int temp1 = arrayValue[4];
			int temp2 = arrayValue[3];
			arrayValue[4] = arrayValue[2];
			arrayValue[3] = arrayValue[2];
			arrayValue[1] = temp1;
			arrayValue[0] = temp2;
			
		} else if ((arrayValue[1] == arrayValue[2]) && (arrayValue[2] == arrayValue[3])) {
			cardValue = 4000;
			arrayValue[1] = arrayValue[4];
			arrayValue[4] = arrayValue[2];
			
		} else if ((arrayValue[2] == arrayValue[3]) && (arrayValue[3] == arrayValue[4])) {
			cardValue = 4000;

		}

		// Two Pairs type
		else if ((arrayValue[0] == arrayValue[1]) && (arrayValue[2] == arrayValue[3])) {
			cardValue = 3000;
			arrayValue[0] = arrayValue [4];
			arrayValue[2] = arrayValue [1];
			arrayValue[4] = arrayValue [3];

		} else if ((arrayValue[0] == arrayValue[1]) && (arrayValue[3] == arrayValue[4]))

		{
			cardValue = 3000;
			arrayValue[0] = arrayValue[2];
			arrayValue[2] = arrayValue[1];

		} else if ((arrayValue[1] == arrayValue[2]) && (arrayValue[3] == arrayValue[4]))

		{
			cardValue = 3000;

		}
		// One Pair type
		else if (arrayValue[0] == arrayValue[1])

		{
			cardValue = 2000;
			int temp = arrayValue[0];
			arrayValue[0] = arrayValue[2];
			arrayValue[1] = arrayValue[3];
			arrayValue[2] = arrayValue[4];
			arrayValue[3] = temp;
			arrayValue[4] = temp;
		} else if (arrayValue[1] == arrayValue[2])

		{
			cardValue = 2000;
			int temp = arrayValue[1];
			arrayValue[1] = arrayValue[3];
			arrayValue[2] = arrayValue[4];
			arrayValue[3] = temp;
			arrayValue[4] = temp;

		} else if (arrayValue[2] == arrayValue[3])

		{
			cardValue = 2000;
			arrayValue[2] = arrayValue[4];
			arrayValue[4] = arrayValue[3];

		} else if (arrayValue[3] == arrayValue[4])

		{
			cardValue = 2000;

		}
		// High Card type
		else
			cardValue = 1000;

		return cardValue;

	}

	// Compare to different PokerHand.
	public int compareTo(PokerHand hand) {
		int equalTime = 0;
		// if both hand duplicate
		/*
		 * if (this.a.equals(hand.a) && this.a.equals(hand.b) &&
		 * this.a.equals(hand.c) && this.a.equals(hand.d) &&
		 * this.a.equals(hand.e) && this.b.equals(hand.b) &&
		 * this.b.equals(hand.c) && this.b.equals(hand.d) &&
		 * this.b.equals(hand.e) && this.c.equals(hand.c) &&
		 * this.c.equals(hand.d) && this.c.equals(hand.e) &&
		 * this.d.equals(hand.d) && this.d.equals(hand.e) &&
		 * this.e.equals(hand.e)) { return 0; }
		 */

		// if both hand are the same type
		if ((int) this.PokerHandValue() == (int) hand.PokerHandValue()) {
			for (int i = 4; i > 0; i--) {
				if (this.getPokerHandValue(i) > hand.getPokerHandValue(i)) {
					return 1;
				} else if (this.getPokerHandValue(i) < hand.getPokerHandValue(i)) {
					return -1;
				} else if (this.getPokerHandValue(i) == hand.getPokerHandValue(i)){
					equalTime++;
				}
			}
			if (equalTime == 5) return 0;
		}
		// different type returen value
		return (int) this.PokerHandValue() - (int) hand.PokerHandValue();

	}

	public String toString() {
		return a.toString() + " " + b.toString() + " " + c.toString() + " " + d.toString() + " " + e.toString();
	}
	
	public String toString1() {
		return a.toString1() + " " + b.toString1() + " " + c.toString1() + " " + d.toString1() + " " + e.toString1();
	}
	
}
