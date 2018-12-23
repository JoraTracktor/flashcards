package flashcards;

public class Main {
    public static void main(String[] args) {
         final Scanner scanner = new Scanner(System.in);
	    
	        System.out.println("Input the number of cards:");
	        int number = scanner.nextInt();
	        String[] cards = new String[number];
	        String[] definitions = new String[number];
	        String answer;
	        
	        for (int i = 0; i < number; i++ ) {
	        	System.out.println("The card #" + (i+1) + ":");
	        	cards[i] = scanner.next();
	        	System.out.println("The definition of the card #"+ (i+1)+ ":");
	        	definitions[i] = scanner.next();

	        }
	        
	        for (int i = 0; i < cards.length; i++ ) {
	        	System.out.println("Print the definition of \"" + cards[i] + "\":");
	        	answer = scanner.next();
	        	
	        	if (answer.equals(definitions[i])) {
	        		System.out.println("Correct answer.");
	        	}
	        	else {
	        		System.out.println("Wrong answer (the correct one is \""+definitions[i] +"\").");
	        	}
	        }  
    }
}
