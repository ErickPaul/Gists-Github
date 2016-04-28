package CardShuffle;

public class CardShuffle{

	public Card[] array = new Card[52];
	public CardShuffle(){
		String[] suites = {"Spade", "Diamond", "Heart", "Club"};
		int index = 0;
		Card currentCard;
		for(String suite: suites){
			for(int i=1; i<=13; i++){
				switch(i){
					case 1: currentCard = new Card('A', suite, (index+1));
						break;
					case 11:currentCard = new Card('J', suite, (index+1));
						break;
					case 12:currentCard = new Card('Q', suite, (index+1));
						break;
					case 13:currentCard = new Card('K', suite, (index+1));
						break;
					default:char[] charArray = Character.toChars(i);
						currentCard = new Card(charArray[0], suite, (index+1));
						break;
				}
				array[index++] = currentCard;
			}
		}
		array[51].next = -1;
	}
	public static void main(String[] args){
		CardShuffle cardShuffle = new CardShuffle();
		/*for(Card card : cardShuffle.array){
			System.out.println(card);
		}*/


	}
}

class Card{
	public char value;
	public String suite;
	public int next;
	public Card(char value, String suite, int num){
		this.value = value;
		this.suite = suite;
		this.next = num;
	}
	public String toString(){
		return (suite + "-" + value + "-" + next);
	}
}
