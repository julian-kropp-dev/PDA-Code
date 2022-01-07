package uebung07;

public class Library {
    public static void main(String[] args) {
        Book hamster = new Book();
        hamster.setTitle("Programmieren spielend gelernt");
        hamster.setAuthor("D. Boles");
        hamster.publish("3-5190-2297-4", 39.90);

        Book harry_potter = new Book();
        harry_potter.setTitle("Harry Potter und der Stein der Weisen");
        harry_potter.setAuthor("J.K.Rowling");
        harry_potter.publish("9780590353403", 21.88);

        Book die_drei_fragezeichen = new Book();
        die_drei_fragezeichen.setTitle("Die drei Fragezeichen - Schrecken aus dem Moor");
        die_drei_fragezeichen.setAuthor("Marco Sonnleitner");
        die_drei_fragezeichen.publish("978-3-423-71744-1", 6.95);

    }


}
