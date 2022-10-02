public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();                    // 카드 한 벌을 만든다.
        Card c = d.pick(0);                     // 섞기 전 제일 위의 카드를 뽑는다.
        System.out.println(c);                  // 주소값(d가 가리키는 객체의 첫번째(0)카드를 pick해서 )보여줌

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}

class Deck {
    final int CARD_NUM = 52;    // 카드의 개수
    Card cardArr[] = new Card[CARD_NUM];  // Card 객체, 카드 어레이 52개 만들어, 포함관계!!!

    Deck () {
        int i = 0;

        for(int k=Card.KIND_MAX; k>0; k--)
            for(int n=0; n<Card.NUM_MAX; n++)
                cardArr[i++] = new Card(k, n+1);
    }

    Card pick(int index) {
        return cardArr[index];
    }

    Card pick() {
        int index = (int)(Math.random()*CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for(int i=0; i<cardArr.length; i++) {
            int r = (int)(Math.random()*CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}  // Deck클래스의 끝

class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card() {
        this(SPADE,1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART","DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현
        return "kind: "+kinds[this.kind]+"number: "+numbers.charAt(this.number);
    } // toString()의 끝
} // Card클래스의 끝
