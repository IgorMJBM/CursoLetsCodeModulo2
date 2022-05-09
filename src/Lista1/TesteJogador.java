package Lista1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteJogador {
    public static void main(String[] args) {
        List<Jogador> time1 = new ArrayList<>();

        Jogador p1 = new Jogador( 1, "Player 1", "One", LocalDate.of(2000, 1, 5),
                1, "Attacker", 3, 0, 1);
        Jogador p2 = new Jogador( 2, "Player 2", "Two", LocalDate.of(2000, 2, 6),
                1, "Attacker", 3, 0, 0);
        Jogador p3 = new Jogador( 3, "Player 3", "Three", LocalDate.of(2000, 3, 7),
                1, "Midfield", 3, 0, 0);
        Jogador p4 = new Jogador( 4, "Player 4", "Four", LocalDate.of(2000, 4, 8),
                1, "Midfield", 3, 0, 1);
        Jogador p5 = new Jogador( 5, "Player 5", "Five", LocalDate.of(2000, 5, 15),
                1, "Halfback", 3, 0, 0);
        Jogador p6 = new Jogador( 6, "Player 6", "Six", LocalDate.of(2000, 6, 25),
                1, "Halfback", 3, 0, 1);
        Jogador p7 = new Jogador( 7, "Player 7", "Seven", LocalDate.of(2000, 7, 5),
                1, "Right Side", 3, 3, 0);
        Jogador p8 = new Jogador( 8, "Player 8", "Eight", LocalDate.of(2000, 8, 6),
                1, "Goalkeeper", 3, 0, 0);
        Jogador p9 = new Jogador( 9, "Player 9", "Nine", LocalDate.of(2000, 9, 7),
                1, "Left Side", 3, 0, 1);
        Jogador p10 = new Jogador( 10, "Player 10", "Ten", LocalDate.of(2000, 10, 4),
                1, "HalfBack", 3, 0, 0);
        Jogador p11 = new Jogador( 11, "Player 11", "Eleven", LocalDate.of(2000, 11, 2),
                1, "Attacker", 3, 0, 0);

        time1.add(p1);
        time1.add(p2);
        time1.add(p3);
        time1.add(p4);
        time1.add(p5);
        time1.add(p6);
        time1.add(p7);
        time1.add(p8);
        time1.add(p9);
        time1.add(p10);
        time1.add(p11);

        time1.forEach(System.out::println);
    }
}
