package in.raj.controller;

import in.raj.entity.Book;
import in.raj.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private BookRepository repo;
    @GetMapping("/book")
    public ModelAndView getBookById(@RequestParam("id") Integer id){
        ModelAndView mav = new ModelAndView();
        Optional<Book> findById = repo.findById(id);
        if (findById.isPresent()){
            Book bookObj = findById.get();
            // sending data to view
            mav.addObject("book",bookObj);
        }
        // Setting view page name
        mav.setViewName("index");
        return mav;
    }
}
