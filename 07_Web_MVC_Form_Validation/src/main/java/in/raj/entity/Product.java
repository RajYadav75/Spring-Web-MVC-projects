package in.raj.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private Integer pid;


    @NotBlank(message = "Name is Mandatory")
    @Size(min = 3, max = 15,message = "Name should have only 3 to 15 character")
    private String name;

    @NotNull(message = "Price is Mandatory")
    @Positive(message = "Price should be Positive Number")
    private Double price;
    @NotNull(message = "Quantity is Mandatory")
    @Positive(message = "Quantity should be Positive Number")
    private Integer qty;
}