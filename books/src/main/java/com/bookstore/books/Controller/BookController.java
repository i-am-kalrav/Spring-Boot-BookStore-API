package com.bookstore.books.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.books.Model.Book;
import com.bookstore.books.Model.BookDelete;
import com.bookstore.books.Model.BookGet;
import com.bookstore.books.Model.BookUpdate;
import com.bookstore.books.Services.BookService;

@RestController
@RequestMapping("/bookstore")
public class BookController
{
    @Autowired
    private BookService bkSrv;

    //Get
    @GetMapping("/books/*")
	public List<Book> getBooks()
    {
		return bkSrv.getBooks();
	}

    @GetMapping("/books/auth={ath}")
	public List<Book> getBooksByAuthor(@PathVariable String ath)
    {
		return bkSrv.getBooksByAuthor(ath);
	}

    @GetMapping("/books/price={prc}")
	public List<Book> getBooksByPrice(@PathVariable Double prc)
    {
		return bkSrv.getBooksByPrice(prc);
	}

    @GetMapping("/books/noOfPages={num}")
	public List<Book> getBooksByPgNum(@PathVariable Integer num)
    {
		return bkSrv.getBooksByPgNum(num);
	}

    @GetMapping("/books/edition={edtn}")
	public List<Book> getBooksByEdition(@PathVariable Integer edtn)
    {
		return bkSrv.getBooksByEdition(edtn);
	}

    @GetMapping("/books/genre={gnr}")
	public List<Book> getBooksByGenre(@PathVariable String gnr)
    {
		return bkSrv.getBooksByGenre(gnr);
	}

    @GetMapping("/books/publisher={pblshr}")
	public List<Book> getBooksByPulisher(@PathVariable String pblshr)
    {
		return bkSrv.getBooksByPulisher(pblshr);
	}

	@GetMapping("/books/author={auth}")
	public List<Book> getBooksByAuthPrcGnrPbl(@RequestBody BookGet book, @PathVariable String auth)
    {
		return bkSrv.getBooksByAuthPrcGnrPbl(auth, book.getBkGenre(), book.getBkPblshr(), book.getBkPriceL(), book.getBkPriceU());
	}

	//Post
	@PostMapping("/addBook")
	public void newBook(@RequestBody Book book)
	{
		bkSrv.newBook(book);
	}

	//Put
	@PutMapping("/updateBook")
	public void updateEditionPriceByBkName(@RequestBody BookUpdate bkUpdt)
	{
		bkSrv.updateEditionPriceByBkName(bkUpdt.getBkName(), bkUpdt.getBkEdition(), bkUpdt.getBkPrice());
	}

	//Delete
	@DeleteMapping("/deleteBook")
	public void deleteByBkAuth(@RequestBody BookDelete bkAuth) throws Exception
	{
		bkSrv.deleteByBkAuth(bkAuth);
	}
}
