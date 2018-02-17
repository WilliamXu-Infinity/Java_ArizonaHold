/* Name : William Xu
 * ID   : 23208616
 * Class: 335 FA15 001
 * HW   : Project 2
 * Goal : For this program, we create Card class so we can use it in other program. It contain's each card element. And we can get all the card elements easily by creating this one. 
 */
public class Card {
	
	Rank rank;
	Suit suit;
	
	Card(Rank cardRank, Suit cardSuit){
		rank = cardRank;
		suit = cardSuit;
	}
	
	public Rank getRank(){
		return rank;	
	}
	
	public Suit getSuit(){
		return suit;
	}
	
	public String toString(){
		return getRank().getName() + getSuit().getChar1();
	}
	
	public String toString1(){
		return getRank().getName() + getSuit().getChar2();
	}
}
