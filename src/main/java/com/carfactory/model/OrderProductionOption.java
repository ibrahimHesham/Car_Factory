package com.carfactory.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "order_production_option")
public class OrderProductionOption {
    @EmbeddedId
    private OrderProductionOptionId orderProductionOptionId;

    private int quantity;

    @Transient
    private ProductOption transientProductOption;
    @Transient
    private Order transientOrder;

    public OrderProductionOptionId getOrderProductionOptionId() {
        return orderProductionOptionId;
    }

    public void setOrderProductionOptionId(OrderProductionOptionId orderProductionOptionId) {
        this.orderProductionOptionId = orderProductionOptionId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductOption getTransientProductOption() {
        return transientProductOption;
    }

    public void setTransientProductOption(ProductOption transientProductOption) {
        this.transientProductOption = transientProductOption;
    }

    public Order getTransientOrder() {
        return transientOrder;
    }

    public void setTransientOrder(Order transientOrder) {
        this.transientOrder = transientOrder;
    }
}
