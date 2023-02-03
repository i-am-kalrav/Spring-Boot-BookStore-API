package com.bookstore.books.Model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bkId;

    @Column
    private String bkName;

    @Column
    private String bkAuth;

    @Column
    private String bkPblshr;

    @Column
    private Double bkPrice;

    @Column
    private Integer bkPgNum;

    @Column
    private Integer bkEdition;

    @Column
    private String bkGenre;


    public Book()
    {
    }

    public Book(long bkId, String bkName, String bkAuth, String bkPblshr, double bkPrice, Integer bkPgNum, Integer bkEdition, String bkGenre)
    {
        this.bkId = bkId;
        this.bkName = bkName;
        this.bkAuth = bkAuth;
        this.bkPblshr = bkPblshr;
        this.bkPrice = bkPrice;
        this.bkPgNum = bkPgNum;
        this.bkEdition = bkEdition;
        this.bkGenre = bkGenre;
    }

    public long getBkId()
    {
        return this.bkId;
    }

    public void setBkId(long bkId)
    {
        this.bkId = bkId;
    }

    public String getBkName()
    {
        return this.bkName;
    }

    public void setBkName(String bkName)
    {
        this.bkName = bkName;
    }

    public String getBkAuth()
    {
        return this.bkAuth;
    }

    public void setBkAuth(String bkAuth)
    {
        this.bkAuth = bkAuth;
    }

    public String getBkPblshr()
    {
        return this.bkPblshr;
    }

    public void setBkPblshr(String bkPblshr)
    {
        this.bkPblshr = bkPblshr;
    }

    public double getBkPrice()
    {
        return this.bkPrice;
    }

    public void setBkPrice(double bkPrice)
    {
        this.bkPrice = bkPrice;
    }

    public Integer getBkPgNum()
    {
        return this.bkPgNum;
    }

    public void setBkPgNum(Integer bkPgNum)
    {
        this.bkPgNum = bkPgNum;
    }

    public Integer getBkEdition()
    {
        return this.bkEdition;
    }

    public void setBkEdition(Integer bkEdition)
    {
        this.bkEdition = bkEdition;
    }

    public String getBkGenre()
    {
        return this.bkGenre;
    }

    public void setBkGenre(String bkGenre)
    {
        this.bkGenre = bkGenre;
    }

    /*public Book id(long id)
    {
        setId(id);
        return this;
    }

    public Book bkName(String bkName)
    {
        setBkName(bkName);
        return this;
    }

    public Book bkAuth(String bkAuth)
    {
        setBkAuth(bkAuth);
        return this;
    }

    public Book bkPublsh(String bkPublsh)
    {
        setBkPublsh(bkPublsh);
        return this;
    }

    public Book bkPrice(double bkPrice)
    {
        setBkPrice(bkPrice);
        return this;
    }

    public Book bkPgNum(Integer bkPgNum)
    {
        setBkPgNum(bkPgNum);
        return this;
    }

    public Book bkEdition(Integer bkEdition)
    {
        setBkEdition(bkEdition);
        return this;
    }

    public Book bkGenre(String bkGenre)
    {
        setBkGenre(bkGenre);
        return this;
    }*/

    /*@Override
    public boolean equals(Object o)
    {
        if (o == this)
            return true;
        if (!(o instanceof Book))
        {
            return false;
        }
        Book book = (Book) o;
        return bkId == book.bkId && Objects.equals(bkName, book.bkName) && Objects.equals(bkAuth, book.bkAuth) && Objects.equals(bkPblshr, book.bkPblshr) && bkPrice == book.bkPrice && Objects.equals(bkPgNum, book.bkPgNum) && Objects.equals(bkEdition, book.bkEdition) && Objects.equals(bkGenre, book.bkGenre);
    }*/

    @Override
    public int hashCode()
    {
        return Objects.hash(bkId, bkName, bkAuth, bkPblshr, bkPrice, bkPgNum, bkEdition, bkGenre);
    }

    @Override
    public String toString()
    {
        return "{" +
                " bkId='" + getBkId() + "'" +
                ", bkName='" + getBkName() + "'" +
                ", bkAuth='" + getBkAuth() + "'" +
                ", bkPblshr='" + getBkPblshr() + "'" +
                ", bkPrice='" + getBkPrice() + "'" +
                ", bkPgNum='" + getBkPgNum() + "'" +
                ", bkEdition='" + getBkEdition() + "'" +
                ", bkGenre='" + getBkGenre() + "'" +
                "}";
    }


}
