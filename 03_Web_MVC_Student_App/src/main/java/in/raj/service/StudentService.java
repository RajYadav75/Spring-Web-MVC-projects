package in.raj.service;

import in.raj.binding.Student;
import in.raj.entity.StudentEntity;
import in.raj.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public boolean saveStudent(Student student) {
        System.out.println(student);
        StudentEntity entity = new StudentEntity();
        BeanUtils.copyProperties(student, entity);
        entity.setTimings(Arrays.toString(student.getTiming()));
        System.out.println(entity);
        studentRepository.save(entity);
        return true;
    }
    public List<String> getCourses(){
        return Arrays.asList("Java","Spring","Web MVC","DevOps");
    }

    public List<String> getTimings(){
        return Arrays.asList("Morning","AfterNoon","Evening","Night");
    }
}
