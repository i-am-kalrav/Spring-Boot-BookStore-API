package com.bookstore.books.Model;

import java.util.Objects;

public class BookUpdate
{
    private String bkName;

    private Integer bkEdition;

    private Double bkPrice;


    public BookUpdate()
    {
    }

    public BookUpdate(String bkName, Integer bkEdition, Double bkPrice)
    {
        this.bkName = bkName;
        this.bkEdition = bkEdition;
        this.bkPrice = bkPrice;
    }

    public String getBkName()
    {
        return this.bkName;
    }

    public void setBkName(String bkName)
    {
        this.bkName = bkName;
    }

    public Integer getBkEdition()
    {
        return this.bkEdition;
    }

    public void setBkEdition(Integer bkEdition)
    {
        this.bkEdition = bkEdition;
    }

    public Double getBkPrice()
    {
        return this.bkPrice;
    }

    public void setBkPrice(Double bkPrice)
    {
        this.bkPrice = bkPrice;
    }

    public BookUpdate bkAuth(String bkName)
    {
        setBkName(bkName);
        return this;
    }

    public BookUpdate bkEdition(Integer bkEdition)
    {
        setBkEdition(bkEdition);
        return this;
    }

    public BookUpdate bkPrice(Double bkPrice)
    {
        setBkPrice(bkPrice);
        return this;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == this)
        {
            return true;
        }
        if (!(o instanceof BookUpdate)) 
        {
            return false;
        }
        BookUpdate bookUpdate = (BookUpdate) o;
        return Objects.equals(bkName, bookUpdate.bkName) && Objects.equals(bkEdition, bookUpdate.bkEdition) && Objects.equals(bkPrice, bookUpdate.bkPrice);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(bkName, bkEdition, bkPrice);
    }

    @Override
    public String toString()
    {
        return "{" +
                " bkName='" + getBkName() + "'" +
                ", bkEdition='" + getBkEdition() + "'" +
                ", bkPrice='" + getBkPrice() + "'" +
                "}";
    }

}
