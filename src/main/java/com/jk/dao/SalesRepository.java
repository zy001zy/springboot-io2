package com.jk.dao;

import com.jk.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zy on 2017/11/16.
 */
public interface SalesRepository extends JpaRepository<Sales,Integer> {

    List<Sales> findAll();

    Sales findBySalesName(String salesName);
}
