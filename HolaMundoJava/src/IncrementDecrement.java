public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);
        lives--;//decremento
        System.out.println(lives);

        lives ++;//incremento
        System.out.println(lives);

        // prefija

        int gift = 100 + ++lives;
        System.out.println(gift);

    }
}
