package dao;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    public static final int START_SEQ = 10;

    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq",
            allocationSize = 1, initialValue = START_SEQ)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "global_seq")
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "preis")
    private double preis;

    public Book() {
    }

    public Book(String title, double preis) {
        this.title = title;
        this.preis = preis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
