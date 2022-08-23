
package com.carfactory.model;

        import javax.persistence.*;

@Entity
@Table(name = "inventory_item")
public class InventoryItem {

    @Id
    @SequenceGenerator(
            name = "inventory_sequence",
            sequenceName = "inventory_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "inventory_sequence"
    )
    private Long id;

    @ManyToOne(
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "product_option_id"
    )
    private ProductOption productOption;

    private int availableQuantity;

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", productOption=" + productOption +
                ", availableQuantity=" + availableQuantity +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductOption getProductOption() {
        return productOption;
    }

    public void setProductOption(ProductOption productOption) {
        this.productOption = productOption;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
