/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject2;

/**
 *
 * @author sanjeet
 */
public class Textbook {
    
    String title;
    String author;
    String publisher;

    @Override
    public String toString() {
        return "Textbook{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + '}';
    }

    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    
    public void set(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    
    
    
    
    
    
    
}
