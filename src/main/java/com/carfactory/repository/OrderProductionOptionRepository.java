package com.carfactory.repository;

import com.carfactory.model.OrderProductionOption;
import com.carfactory.model.OrderProductionOptionId;
import com.carfactory.model.Product;
import com.carfactory.model.ProductOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface OrderProductionOptionRepository  extends JpaRepository<OrderProductionOption, OrderProductionOptionId> {


}
