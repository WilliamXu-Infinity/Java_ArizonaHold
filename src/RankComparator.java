import java.util.Comparator;

public class RankComparator implements Comparator<Card>{

	@Override
	public int compare(Card a, Card b) {
		return a.getRank().getValue() - b.getRank().getValue();
	}

	
}
