package in.raj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class ProductEntity {
    @Id
    @GeneratedValue
    private Integer productId;
    private String name;
    private Double price;
    private Long quantity;
}
