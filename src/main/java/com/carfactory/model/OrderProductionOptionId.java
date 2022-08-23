package com.carfactory.model;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderProductionOptionId implements Serializable {
    @ManyToOne(
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "orders_id"
    )
    private Order order;
    @ManyToOne(
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "product_option_id"
    )
    private ProductOption productOption;

    public OrderProductionOptionId(Order order, ProductOption productOption) {
        this.order = order;
        this.productOption = productOption;
    }

    public OrderProductionOptionId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderProductionOptionId that = (OrderProductionOptionId) o;
        return order.equals(that.order) && productOption.equals(that.productOption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, productOption);
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ProductOption getProductOption() {
        return productOption;
    }

    public void setProductOption(ProductOption productOption) {
        this.productOption = productOption;
    }
}
