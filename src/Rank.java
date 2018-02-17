/* Name : William Xu
 * ID   : 23208616
 * Class: 335 FA15 001
 * HW   : Project 2
 * Goal : The Rank program is to identifiy the different value of each card.
 */
public enum Rank {
	Deuce("2", 2), Three("3", 3), Four("4", 4), Five("5", 5), Six("6", 6), Seven("7", 7), Eight("8", 8), Nine("9", 9), Ten("10", 10), Jack("J", 11), Queen("Q", 12), King("K", 13), Ace("A", 14);

	private int rankValue;
	private String rankName;
	
	Rank(String rankName, int value){
		rankValue = value;
		this.rankName = rankName;
	}
	
	Rank(int value){
		rankValue = value;
	}
	
	Rank(String name){
		rankName = name;
	}
	
	public int getValue(){
		return rankValue;
	}
	
	public String getName(){
		return rankName;
	}
	
}
