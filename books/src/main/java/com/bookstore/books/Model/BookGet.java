package com.bookstore.books.Model;

import java.util.Objects;


public class BookGet
{
    private String bkAuth;

    private String bkPblshr;

    private Double bkPriceU;

    private Double bkPriceL;

    private String bkGenre;


    public BookGet()
    {
    }

    public BookGet(String bkAuth, String bkPblshr, Double bkPriceU, Double bkPriceL, String bkGenre)
    {
        this.bkAuth = bkAuth;
        this.bkPblshr = bkPblshr;
        this.bkPriceU = bkPriceU;
        this.bkPriceL = bkPriceL;
        this.bkGenre = bkGenre;
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

    public Double getBkPriceU()
    {
        return this.bkPriceU;
    }

    public void setBkPriceU(Double bkPriceU)
    {
        this.bkPriceU = bkPriceU;
    }

    public Double getBkPriceL()
    {
        return this.bkPriceL;
    }

    public void setBkPrice(Double bkPriceL)
    {
        this.bkPriceL = bkPriceL;
    }

    public String getBkGenre()
    {
        return this.bkGenre;
    }

    public void setBkGenre(String bkGenre)
    {
        this.bkGenre = bkGenre;
    }

    /*@Override
    public boolean equals(Object o)
    {
        if (o == this)
            return true;
        if (!(o instanceof BookGet))
        {
            return false;
        }
        BookGet bookGet = (BookGet) o;
        return Objects.equals(bkAuth, bookGet.bkAuth) && Objects.equals(bkPblshr, bookGet.bkPblshr) && Objects.equals(bkPrice, bookGet.bkPrice) && Objects.equals(bkGenre, bookGet.bkGenre);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(bkAuth, bkPblshr, bkPriceU, bkPriceL, bkGenre);
    }

    @Override
    public String toString()
    {
        return "{" +
                " bkAuth='" + getBkAuth() + "'" +
                ", bkPblshr='" + getBkPblshr() + "'" +
                ", bkPriceU='" + getBkPriceU() + "'" +
                ", bkPriceL='" + getBkPriceL() + "'" +
                ", bkGenre='" + getBkGenre() + "'" +
                "}";
    }
}
