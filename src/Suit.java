/* Name : William Xu
 * ID   : 23208616
 * Class: 335 FA15 001
 * HW   : Project 1
 * Goal : Suit is to identified each card suit.
 */
public enum Suit {
	Clubs('\u2663', '\u2667'), Diamonds('\u2666', '\u2662'), Hearts('\u2665', '\u2661'), Spades('\u2660', '\u2664' );

	private char char1;
	private char char2;
	
	private Suit(char charName1, char charName2){
		char1 = charName1;
		char2 = charName2;
	}
	
	public char getChar1(){
		return char1;
	}
	
	public char getChar2(){
		return char2;
	}
	
}
