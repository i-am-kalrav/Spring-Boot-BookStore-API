package com.bookstore.books.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.books.Model.Book;
import com.bookstore.books.Model.BookDelete;
import com.bookstore.books.Repository.BookRepo;

//import org.springframework.data.rest.webmvc.ResourceNotFoundException;

@Service
public class BookService
{
    @Autowired
    private BookRepo bkRpo;

    //Get
    public List<Book> getBooks()
    {
      return bkRpo.findAll();
    }

    public List<Book> getBooksByAuthor(String auth)
    {
      return bkRpo.findByBkAuth(auth);
    }

    public List<Book> getBooksByPrice(Double price)
    {
      return bkRpo.findByBkPrice(price);
    }

    public List<Book> getBooksByPgNum(Integer pgnum)
    {
      return bkRpo.findByBkPgNum(pgnum);
    }

    public List<Book> getBooksByEdition(Integer edition)
    {
      return bkRpo.findByBkEdition(edition);
    }

    public List<Book> getBooksByGenre(String genre)
    {
      return bkRpo.findByBkGenre(genre);
    }

    public List<Book> getBooksByPulisher(String pblshr)
    {
      return bkRpo.findByBkPblshr(pblshr);
    }

    public List<Book> getBooksByAuthPrcGnrPbl(String bkAuth, String bkGenre, String bkPblshr, Double bkPriceLow, Double bkPriceHigh)
    {
      return bkRpo.findByAuthPrcGnrPbl(bkAuth, bkGenre, bkPblshr, bkPriceLow, bkPriceHigh);
    }

    //Post
    public void newBook(Book bk)
    {
      bkRpo.save(bk);
    }

    //Put
    public void updateEditionPriceByBkName(String bkName, Integer bkEdition, Double bkPrice)
    {
      bkRpo.updateBookByName(bkName, bkEdition, bkPrice);
    }

    //Delete
    public void deleteByBkAuth(BookDelete bkAuth) throws Exception
    {
      try
      {
        bkRpo.deleteByBkAuth(bkAuth.getBkAuth());
      }
      catch (Exception e)
      {
          throw new Exception("Book written by "+ bkAuth.getBkAuth() + " does not exist in the Book Store.");
      }
    }
    /*public ResponseEntity<Map<String, Boolean>> deleteStudent(String auth)
    {
		  try
      {
          Book book = (Book) bkRpo.findByBkAuth(auth);
          bkRpo.delete(book);
          Map<String, Boolean> response = new HashMap<>();
          response.put("deleted", true);
          return ResponseEntity.ok(response);
      }
      catch (ResourceNotFoundException e)
      {
          throw new ResourceNotFoundException("Book written by "+ auth + " does not exist in the Book Store.");
      }
	  }*/
}
