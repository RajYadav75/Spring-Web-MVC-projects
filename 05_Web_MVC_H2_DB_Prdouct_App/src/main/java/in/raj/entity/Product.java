package in.raj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private Integer pid;
    private String name;
    private Double price;
    private Integer qty;
}
