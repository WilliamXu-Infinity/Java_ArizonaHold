/* Name : William Xu
 * ID   : 23208616
 * Class: 335 FA15 001
 * HW   : Quiz 02
 * Date : 8/31/2015
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class RankSuitAndCardTest {

	@Test
	  public void testOneCard() {
	    Card HK = new Card(Rank.King, Suit.Hearts);
	    assertEquals(Suit.Hearts, HK.getSuit());
	    assertEquals(Rank.King, HK.getRank());
	    assertEquals(13, HK.getRank().getValue());
	    assertEquals(14, Rank.Ace.getValue());
	  }
	@Test
	  public void testTwoCard() {
	    Card HK = new Card(Rank.Ace, Suit.Diamonds);
	    assertEquals(Suit.Diamonds, HK.getSuit());
	    assertEquals(Rank.Ace, HK.getRank());
	    assertEquals(14, HK.getRank().getValue());
	  }
	@Test
	  public void testThreeCard() {
	    Card HK = new Card(Rank.Seven, Suit.Clubs);
	    assertEquals(Suit.Clubs, HK.getSuit());
	    assertEquals(Rank.Seven, HK.getRank());
	    assertEquals(7, HK.getRank().getValue());
	  }

}
