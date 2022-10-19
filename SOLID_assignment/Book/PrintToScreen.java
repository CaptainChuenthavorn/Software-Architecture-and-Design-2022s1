//63010124 Chakkapat Chuenthavorn
package com.solid.book;
// build new class for SRP
public class PrintToScreen {
    public void printToScreen(Book book) {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }

}
