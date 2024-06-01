package in.raj.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public String getPruductNameById(Integer id) {
        int i = 10/0;
        return "mouse";
    }
}
