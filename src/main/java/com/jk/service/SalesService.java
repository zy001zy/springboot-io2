package com.jk.service;

import com.jk.model.Sales;

import java.util.List;

/**
 * Created by zy on 2017/11/16.
 */
public interface SalesService {

    public List<Sales> findAll();

    public void save(Sales user);
}
