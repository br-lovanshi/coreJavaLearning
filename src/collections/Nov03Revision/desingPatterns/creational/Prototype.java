package collections.Nov03Revision.desingPatterns.creational;

import java.awt.print.Book;

class Books implements Cloneable{
    private String name;
    private String writer;
    private String category;


    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone(); // shallow copy
    }
}

public class Prototype {
}
