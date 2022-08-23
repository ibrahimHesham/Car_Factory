package com.carfactory.repository;

import com.carfactory.model.ProductOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductOptionRepository extends JpaRepository<ProductOption,Long> {
    public List<ProductOption> findByProduct_Id(Long Id);
}
