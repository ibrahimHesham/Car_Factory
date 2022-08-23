package com.carfactory.model;

import javax.persistence.*;

@Entity
@Table(name = "product_option")
public class ProductOption {
    @Id
    @SequenceGenerator(
            name = "product_option_sequence",
            sequenceName = "product_option_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_option_sequence"
    )
    private Long id;

    @ManyToOne(
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "product_id"
    )
    private Product product;

    private String transmission;
    private String color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ProductOption{" +
                "id=" + id +
                ", product=" + product +
                ", transmission='" + transmission + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
