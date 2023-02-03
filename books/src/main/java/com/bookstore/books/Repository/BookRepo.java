package com.bookstore.books.Repository;

import com.bookstore.books.Model.Book;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>
{
    //Get
    public List<Book> findAll();
    public List<Book> findByBkAuth(String auth);
	public List<Book> findByBkPrice(Double price);
	public List<Book> findByBkGenre(String genre);
    public List<Book> findByBkPgNum(Integer pgnum);
    public List<Book> findByBkEdition(Integer edition);
	public List<Book> findByBkPblshr(String pblshr);
    
    @Query(value = "select * from book where bk_auth=:bkAuth and bk_genre=:bkGenre and bk_pblshr=:bkPblshr and (bk_price between :bkPriceLow and :bkPriceHigh)", 
           nativeQuery = true)
    public List<Book> findByAuthPrcGnrPbl(@Param("bkAuth") String bkAuth,
                                          @Param("bkGenre") String bkGenre,
                                          @Param("bkPblshr") String bkPblshr,
                                          @Param("bkPriceLow") Double bkPriceLow,
                                          @Param("bkPriceHigh") Double bkPriceHigh);
    
    //Post
    //@Transactional
    public Book save(List<Book> bk);

    //Put
    @Transactional
	@Modifying
	@Query(value = "update book set bk_edition=:newBkEdition, bk_price=:newBkPrice where bk_name=:bkName", 
           nativeQuery = true)
	public void updateBookByName(@Param("bkName") String bkName,
                                 @Param("newBkEdition") Integer newBkEdition,
                                 @Param("newBkPrice") Double newBkPrice);
    
    //Delete
    @Transactional
	@Modifying
	public void deleteByBkAuth(String auth);
}
