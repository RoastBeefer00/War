public class Card {
    String name;
    String suit;
    Integer value;

    public Card(Integer value, String suit){
        this.value = value;
        this.suit = suit;
        switch (value) {
            case 1:
                this.name = "Ace";
                break;
            case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                this.name = Integer.toString(value);
                break;
            case 11:
                this.name = "Jack";
                break;
            case 12:
                this.name = "Queen";
                break;
            case 13:
                this.name = "King";
                break;
            case 14:
                this.name = "Joker";
                break;
            default:
                break;
        }
    }
}
