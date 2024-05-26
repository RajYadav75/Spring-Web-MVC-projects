package in.raj.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student_enquiries")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    private String name;
    private String email;
    private String gender;
    private String courses;
    private String timings;
}