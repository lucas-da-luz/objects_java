package object.Q2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        book[] books = new book[3];

        for (int i = 0; i < books.length; i++) {

            books[i] = new book();

            books[i].readTitle(scan);
            books[i].readAuthor(scan);
            books[i].readPages(scan);
        }
    }
}