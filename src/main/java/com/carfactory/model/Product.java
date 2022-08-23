package com.carfactory.model;

import javax.persistence.*;

@Entity
@Table(
        name = "product",
        uniqueConstraints = { @UniqueConstraint(columnNames = { "model", "year" }) }
)
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long id;
    private String model;
    private String year;

//    @OneToMany(
//            mappedBy = "product",
//            cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY
//    )
//    @JsonManagedReference
//    private List<ProductDiversity> productDiversityList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
