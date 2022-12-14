package com.sopra;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Integer> {
	public List<Book> findByName(String name);

}
