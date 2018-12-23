package flashcards;

public class Main {
    private static Map<String, String> cards = new LinkedHashMap<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(final String[] args) {
	        
	    System.out.println("Input the number of cards:");
	    int numberofCards = scanner.nextInt();
	    createCards(numberofCards);
	    checkCards();
	    //System.out.println(cards);
	    
	}
	
	private static void createCards(int numberOfCards) {
		String card;
		String definition;
		for (int i = 1; i <= numberOfCards; i++) {
			System.out.println("The card #" + i +":");
			while (true) {
				card = scanner.next();
				if (cards.containsKey(card)) {
					System.out.println("Such card is exist. Input another card:");
				}
				else {
					System.out.println("The definition of the card #" +  i + ":");
					definition = scanner.next();
					cards.put(card, definition);
					break;
				}
			}	
		}
	}
	
	private static void checkCards() {
		String answer;
		for (Map.Entry<String, String> card : cards.entrySet()) {
			System.out.println("Print the definition of \""+ card.getKey()+"\":");
			answer = scanner.next();
			if (answer.equals(card.getValue())) {
				System.out.println("Correct answer.");
			}
			else if (cards.containsValue(answer)) {
				System.out.println("Wrong answer (The correct one is \""+ card.getValue() +"\"). You've just written a definition of another card.");
			}
			else {
				System.out.println("Wrong answer (The correct one is \""+ card.getValue() +"\").");
			}
		}
	}
    }
}
