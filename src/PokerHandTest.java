/* Name : William Xu
 * ID   : 23208616
 * Class: 335 FA15 001
 * HW   : Project 1
 * Goal : The goal for this program is to make sure the PokerHand covers all the different possibility and make the PokerHand's program more currect.
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class PokerHandTest {

	Card C2 = new Card(Rank.Deuce, Suit.Clubs);
	Card C3 = new Card(Rank.Three, Suit.Clubs);
	Card C4 = new Card(Rank.Four, Suit.Clubs);
	Card C5 = new Card(Rank.Five, Suit.Clubs);
	Card C6 = new Card(Rank.Six, Suit.Clubs);
	Card C7 = new Card(Rank.Seven, Suit.Clubs);
	Card C8 = new Card(Rank.Eight, Suit.Clubs);
	Card C9 = new Card(Rank.Nine, Suit.Clubs);
	Card C10 = new Card(Rank.Ten, Suit.Clubs);
	Card CJ = new Card(Rank.Jack, Suit.Clubs);
	Card CQ = new Card(Rank.Queen, Suit.Clubs);
	Card CK = new Card(Rank.King, Suit.Clubs);
	Card CA = new Card(Rank.Ace, Suit.Clubs);

	Card D2 = new Card(Rank.Deuce, Suit.Diamonds);
	Card D3 = new Card(Rank.Three, Suit.Diamonds);
	Card D4 = new Card(Rank.Four, Suit.Diamonds);
	Card D5 = new Card(Rank.Five, Suit.Diamonds);
	Card D6 = new Card(Rank.Six, Suit.Diamonds);
	Card D7 = new Card(Rank.Seven, Suit.Diamonds);
	Card D8 = new Card(Rank.Eight, Suit.Diamonds);
	Card D9 = new Card(Rank.Nine, Suit.Diamonds);
	Card D10 = new Card(Rank.Ten, Suit.Diamonds);
	Card DJ = new Card(Rank.Jack, Suit.Diamonds);
	Card DQ = new Card(Rank.Queen, Suit.Diamonds);
	Card DK = new Card(Rank.King, Suit.Diamonds);
	Card DA = new Card(Rank.Ace, Suit.Diamonds);

	Card H2 = new Card(Rank.Deuce, Suit.Hearts);
	Card H3 = new Card(Rank.Three, Suit.Hearts);
	Card H4 = new Card(Rank.Four, Suit.Hearts);
	Card H5 = new Card(Rank.Five, Suit.Hearts);
	Card H6 = new Card(Rank.Six, Suit.Hearts);
	Card H7 = new Card(Rank.Seven, Suit.Hearts);
	Card H8 = new Card(Rank.Eight, Suit.Hearts);
	Card H9 = new Card(Rank.Nine, Suit.Hearts);
	Card H10 = new Card(Rank.Ten, Suit.Hearts);
	Card HJ = new Card(Rank.Jack, Suit.Hearts);
	Card HQ = new Card(Rank.Queen, Suit.Hearts);
	Card HK = new Card(Rank.King, Suit.Hearts);
	Card HA = new Card(Rank.Ace, Suit.Hearts);

	Card S2 = new Card(Rank.Deuce, Suit.Spades);
	Card S3 = new Card(Rank.Three, Suit.Spades);
	Card S4 = new Card(Rank.Four, Suit.Spades);
	Card S5 = new Card(Rank.Five, Suit.Spades);
	Card S6 = new Card(Rank.Six, Suit.Spades);
	Card S7 = new Card(Rank.Seven, Suit.Spades);
	Card S8 = new Card(Rank.Eight, Suit.Spades);
	Card S9 = new Card(Rank.Nine, Suit.Spades);
	Card S10 = new Card(Rank.Ten, Suit.Spades);
	Card SJ = new Card(Rank.Jack, Suit.Spades);
	Card SQ = new Card(Rank.Queen, Suit.Spades);
	Card SK = new Card(Rank.King, Suit.Spades);
	Card SA = new Card(Rank.Ace, Suit.Spades);

	@Test
	public void testKindValue() {
		PokerHand T9 = new PokerHand(C10, CA, CK, CQ, CJ);
		PokerHand T8 = new PokerHand(C10, H10, D10, S10, CJ);
		PokerHand T7 = new PokerHand(H3, C3, D3, S5, D5);
		PokerHand T6 = new PokerHand(CA, CQ, CJ, C10, C9);
		PokerHand T5 = new PokerHand(H5, D4, C3, S2, SA);
		PokerHand T4 = new PokerHand(C5, H5, S5, CQ, H6);
		PokerHand T3 = new PokerHand(C10, S10, CK, SK, D2);
		PokerHand T2 = new PokerHand(C10, S10, CK, CQ, CJ);
		PokerHand T1 = new PokerHand(HA, S10, S9, H5, D3);
		
		System.out.println(T9.PokerHandValue());
		System.out.println(T8.PokerHandValue());
		System.out.println(T7.PokerHandValue());
		System.out.println(T6.PokerHandValue());
		System.out.println(T5.PokerHandValue());
		System.out.println(T4.PokerHandValue());
		System.out.println(T3.PokerHandValue());
		System.out.println(T2.PokerHandValue());
		System.out.println(T1.PokerHandValue());
	}
	
	
	@Test
	public void testOnePair() {
		PokerHand T1 = new PokerHand(H7, C7, S6, D5, S4);
		PokerHand T2 = new PokerHand(S2, C2, H2, DK, SK);
		
		assertTrue(T1.compareTo(T2) < 0);
		assertTrue(T2.compareTo(T1) > 0);

	}
	
	@Test
	public void testOnePair1() {
		PokerHand T1 = new PokerHand(H8, C7, S7, D5, S4);
		PokerHand T2 = new PokerHand(S2, C2, H2, DK, SK);
		
		assertTrue(T1.compareTo(T2) < 0);
		assertTrue(T2.compareTo(T1) > 0);

	}
	
	@Test
	public void testOnePair2() {
		PokerHand T1 = new PokerHand(H7, C8, S5, D5, S4);
		PokerHand T2 = new PokerHand(S2, C2, H2, DK, SK);
		
		assertTrue(T1.compareTo(T2) < 0);
		assertTrue(T2.compareTo(T1) > 0);

	}
	
	@Test
	public void testOnePair3() {
		PokerHand T1 = new PokerHand(H8, C7, S6, D4, S4);
		PokerHand T2 = new PokerHand(S2, C2, H2, DK, SK);
		
		assertTrue(T1.compareTo(T2) < 0);
		assertTrue(T2.compareTo(T1) > 0);

	}
	
	@Test
	public void testThreeOfKind() {
		PokerHand T1 = new PokerHand(H7, C7, S7, D5, S4);
		PokerHand T2 = new PokerHand(S2, C2, H2, DK, SK);
		
		assertTrue(T1.compareTo(T2) < 0);
		assertTrue(T2.compareTo(T1) > 0);

	}
	
	@Test
	public void testFullHouse() {
		PokerHand T1 = new PokerHand(H7, C7, S7, D5, S5);
		PokerHand T2 = new PokerHand(S2, C2, H2, DK, SK);
		
		assertTrue(T1.compareTo(T2) > 0);
		assertTrue(T2.compareTo(T1) < 0);

	}
	
	@Test
	public void testFourOfKind() {
		PokerHand T1 = new PokerHand(H7, C7, S7, D7, D5);
		PokerHand T2 = new PokerHand(S2, C2, H2, DK, SK);
		
		assertTrue(T1.compareTo(T2) > 0);
		assertTrue(T2.compareTo(T1) < 0);

	}
	
	@Test
	public void testCompareTwoPair1() {
		PokerHand T1 = new PokerHand(H7, C7, S6, H6, D5);
		PokerHand T2 = new PokerHand(S2, C2, H2, DK, SK);
		
		assertTrue(T1.compareTo(T2) < 0);

	}
	
	@Test
	public void testCompareTwoPair2() {
		PokerHand T1 = new PokerHand(H7, C7, S6, H5, D5);
		PokerHand T2 = new PokerHand(S2, C2, H2, DK, SK);
		
		assertTrue(T1.compareTo(T2) < 0);

	}
	
	@Test
	public void testCompareTwoPair3() {
		PokerHand T1 = new PokerHand(H8, C7, S7, H6, D6);
		PokerHand T2 = new PokerHand(S2, C2, H2, DK, SK);
		
		assertTrue(T1.compareTo(T2) < 0);

	}

	
	@Test
	public void testCompareFullhouse() {
		PokerHand T1 = new PokerHand(H4, C4, D4, H7, D7);
		PokerHand T2 = new PokerHand(S2, C2, H2, DK, SK);
		
		assertTrue(T1.compareTo(T2) > 0);

	}
	
	@Test
	public void testCompareFullhouse1() {
		PokerHand T1 = new PokerHand(H5, C5, D5, H9, D9);
		PokerHand T2 = new PokerHand(S5, D5, H5, D6, S6);		
		assertTrue(T1.compareTo(T2) > 0);
		for (int i = 0; i < 5; i++){
		System.out.print(T1.getPokerHandValue(i) + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < 5; i++){
			System.out.print(T2.getPokerHandValue(i) + " ");
			}
		System.out.println(T1.compareTo(T2));

	}
	
	@Test(expected = DuplicateCardException.class)
	public void testCompareFlush() {
		PokerHand T1 = new PokerHand(H9, H8, H4, H3, H2);
		PokerHand T2 = new PokerHand(H9, H7, H6, H5, H4);
		assertTrue(T1.compareTo(T2) > 0);
        System.out.println(T1.getPokerHandValue(3));
	}
	
	
	
	@Test
	public void testdifferentKind3() {
		PokerHand T1 = new PokerHand(HJ, H10, H8, H7, H5);
		PokerHand T2 = new PokerHand(H5, C4, D3, D2, H6);

		assertTrue(T1.compareTo(T2) > 0);
	}
	
	@Test(expected = DuplicateCardException.class)
	public void testdifferentKind4() {
		PokerHand T1 = new PokerHand(H5, C4, D3, D2, HA);
		PokerHand T2 = new PokerHand(C9, H9, D9, H5, D3);
		assertTrue(T1.compareTo(T2) > 0);
	}
	
	@Test(expected = DuplicateCardException.class)
	public void testdifferentKind5() {
		PokerHand T1 = new PokerHand(C9, H9, D9, H5, D3);
		PokerHand T2 = new PokerHand(HK, DK, H9, D9, C2);

		assertTrue(T1.compareTo(T2) > 0);
	}
	
	//---------------------------------------------------------------------------------

	@Test
	  public void testSuitEnum() {
	    String result = "";
	    for (Suit suit : Suit.values())
	      result += suit + " ";
	    assertEquals("Clubs Diamonds Hearts Spades", result.trim());
	  }

	  @Test
	  public void testRankEnum() {
	    String result = "";
	    for (Rank rank : Rank.values())
	      result += rank + " ";
	    assertEquals(
	        "Deuce Three Four Five Six Seven Eight Nine Ten Jack Queen King Ace",
	        result.trim());
	  }

	  // Do not allow duplicate cards, throw an exception
	  @Test(expected = DuplicateCardException.class)
	  public void tryToAddTheSameCardTwiceA() {
	    new PokerHand(C2, C3, C4, C5, C5);
	  }

	  @Test(expected = DuplicateCardException.class)
	  public void testPair2() {
	    PokerHand a = new PokerHand(H3, CA, D4, H6, DA);
	    a.toString();
	    PokerHand b = new PokerHand(H3, C5, HA, SA, C6);
	    assertTrue(a.compareTo(b) < 0);
	  }

	  @Test
	  public void testTwoPairWhenOnePairIsEqual() {
	    PokerHand a = new PokerHand(C4, HK, D4, H3, DK);
	    PokerHand b = new PokerHand(H4, C10, CA, DA, S4);
	    assertTrue(a.compareTo(b) < 0);
	    assertTrue(b.compareTo(a) > 0);
	  }
	  
	  @Test
	  public void testFlush() {
	    PokerHand a = new PokerHand(DA, D5, D4, D3, D2);
	    PokerHand b = new PokerHand(H4, C10, CA, SA, S4);
	    assertTrue(a.compareTo(b) > 0);
	    assertTrue(b.compareTo(a) < 0);
	  }

	  @Test
	  public void testAceLowStraight() {
	    PokerHand a = new PokerHand(CA, C2, C3, C4, H5);
	    PokerHand b = new PokerHand(D2, D3, D4, D5, H6);
	    boolean answer = a.compareTo(b) < 0;
	    assertTrue(answer);
	  }


	  // TEST CARD HGH HANDS

	  private PokerHand nothing72 = new PokerHand(C2, C3, C4, C5, D7);
	  private PokerHand nothing73 = new PokerHand(D2, D4, D5, D6, C7);
	  private PokerHand nothingJ = new PokerHand(C8, C9, C10, SJ, D3);
	  private PokerHand nothingK9 = new PokerHand(CK, CQ, CJ, D10, H9);
	  private PokerHand nothingK8 = new PokerHand(HK, HQ, HJ, H10, S8);
	  private PokerHand nothingA = new PokerHand(S9, SJ, SQ, SK, CA);

	  @Test
	  public void testNothing0() {
	    assertTrue(nothing73.compareTo(nothing72) > 0);
	  }

	  @Test
	  public void testNothing1() {
	    assertTrue(nothingJ.compareTo(nothing73) > 0);
	  }

	  @Test
	  public void testNothing2() {
	    assertTrue(nothingK8.compareTo(nothingJ) > 0);
	  }

	  @Test
	  public void testNothing3() {
	    assertTrue(nothingK9.compareTo(nothingK8) > 0);
	  }

	  @Test
	  public void testNothing4() {
	    assertTrue(nothingA.compareTo(nothingK8) > 0);
	  }
	  
	  // Many more tests needed

	
}
