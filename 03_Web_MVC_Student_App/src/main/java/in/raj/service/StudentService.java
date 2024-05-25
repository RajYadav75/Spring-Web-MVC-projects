package in.raj.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<String> getCourses(){
        return Arrays.asList("Java","Spring","Web MVC","DevOps");
    }

    public List<String> getTimings(){
        return Arrays.asList("Morning","AfterNoon","Evening","Night");
    }
}
