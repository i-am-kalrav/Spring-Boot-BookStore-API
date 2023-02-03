package com.bookstore.books.Model;

public class BookDelete
{
    String bkAuth;

    public BookDelete()
    {
    }

    public BookDelete(String bkAuth)
    {
        this.bkAuth = bkAuth;
    }

    public String getBkAuth()
    {
        return this.bkAuth;
    }

    public void setBkAuth(String bkAuth)
    {
        this.bkAuth = bkAuth;
    }

    public BookDelete bkAuth(String bkAuth)
    {
        setBkAuth(bkAuth);
        return this;
    }

    @Override
    public String toString()
    {
        return "{" +
                " bkAuth='" + getBkAuth() + "'" +
                "}";
    }

}
