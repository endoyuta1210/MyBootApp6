package jp.te4a.spring.boot.myapp8.mybootapp8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.te4a.spring.boot.myapp8.BookForm;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	public BookBean save(BookBean bookBean) {
		return bookRepository.save(bookBean);
	}

	public List<BookBean> findAll() {
 		return bookRepository.findAll();
 	}

	public void create(BookForm form) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'create'");
	}

    public BookForm findOne(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public void update(BookForm form) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}